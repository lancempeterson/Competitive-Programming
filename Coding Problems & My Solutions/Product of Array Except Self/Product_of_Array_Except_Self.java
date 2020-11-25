class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        int mult = 1;
        ans[0] = 1;
        for (int i = 1; i < nums.length; i++){
            ans[i] = mult * nums[i-1];
            mult = mult * nums[i-1];
        }
        mult = 1;
        for (int i = nums.length -2; i >= 0; i--){
            ans[i] = ans[i] * mult * nums[i+1];
            mult = mult * nums[i+1];
        }
        return ans;
    }
}