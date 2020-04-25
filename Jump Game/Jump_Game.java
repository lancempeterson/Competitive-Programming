class Solution {
    public boolean canJump(int[] nums) {
        if (nums.length < 2){
            return true;
        }
        int i = nums.length - 2;
        int n = 0;
        while (i >= 0){
            n++;
            if (nums[i] >= n){
                n = 0;
            }
            i--;
        }
        return n == 0;
    }
}