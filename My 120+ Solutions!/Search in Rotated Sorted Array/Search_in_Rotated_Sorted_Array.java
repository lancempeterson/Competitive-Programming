class Solution {
    public int search(int[] nums, int target) {
        if ( nums == null || nums.length == 0 ){
            return -1;
        }
        int start = 0;
        int end = nums.length - 1;
        int leftVal = nums[start];
        int rightVal = nums[end];
        while (start <= end){
            int mid = start + ((end - start)/2);
            if (target == nums[mid]){
                return mid;
            }
            boolean leftSideSequential = leftVal <= nums[mid];
            boolean useLeftSide;
            if ( leftSideSequential ){
                if (target >= leftVal && target < nums[mid]){
                    useLeftSide = true;
                } else {
                    useLeftSide = false;
                }
                
            } else {
                if (target <= rightVal && target > nums[mid]){
                    useLeftSide = false;
                } else {
                    useLeftSide = true;
                }
            }
            if (useLeftSide){
                rightVal = nums[mid];
                end = mid - 1;
            } else {
                leftVal = nums[mid];
                start = mid + 1;
            }
        }
        return -1;
    }
}