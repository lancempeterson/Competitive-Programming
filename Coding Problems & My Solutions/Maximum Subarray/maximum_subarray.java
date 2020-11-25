class Solution {
    public int maxSubArray(int[] nums) {
        int cur = nums[0];
        int max = cur;
        for (int i = 1; i < nums.length; i++){
            cur = Math.max(cur, 0);
            cur += nums[i];
            max = Math.max(max, cur);
        }
        return max;
    }
}