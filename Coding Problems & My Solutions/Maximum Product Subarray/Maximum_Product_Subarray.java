class Solution {
    public int maxProduct(int[] nums) {
        int hi = nums[0];
        int lo = nums[0];
        int max = hi;
        for (int i = 1; i < nums.length; i++){
            int cur = nums[i];
            int oldhi = hi;
            hi = Math.max(cur, Math.max(cur*hi, cur*lo));
            lo = Math.min(cur, Math.min(cur*oldhi, cur*lo));
            max = Math.max(max, hi);
        }
        return max;
    }
}