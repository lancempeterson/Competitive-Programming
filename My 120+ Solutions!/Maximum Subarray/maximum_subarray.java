class Solution {
    public int maxSubArray(int[] nums) {
        if ( nums.length == 0 ){
            return 0;
        }
        else if ( nums.length == 1 ){
            return nums[0];
        }
        int max = nums[0];
        int localMax = nums[0];
        for ( int i = 1; i < nums.length; i++ ){
            localMax = Math.max(localMax + nums[i], nums[i]);
            max = Math.max(max, localMax);
        }
        return max;
    }
}