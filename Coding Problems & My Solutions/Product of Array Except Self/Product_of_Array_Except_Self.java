class Solution {
    public int[] productExceptSelf(int[] nums) {
        if (nums.length < 2){
            return nums;
        }
        int ans [] = new int [nums.length];
        int left [] = new int [nums.length];
        int right [] = new int [nums.length];
        left[0] = 1;
        right[right.length-1] = 1;
        for (int i = 1; i < left.length; i++){
            left[i] = nums[i-1] * left[i-1];
        }
        for (int i = right.length - 2; i >= 0; i--){
            right[i] = nums[i+1] * right[i+1];
        }
        for (int i = 0; i < ans.length; i++){
            ans[i] = left[i] * right[i];
        }
        return ans;
    }
}