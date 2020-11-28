class Solution {
    public int search(int[] nums, int target) {
        if (nums == null || nums.length < 1){
            return -1;
        }
        int start = 0;
        int end = nums.length - 1;
        int mid = 0;
        while (start <= end){
            mid = start + (end - start) / 2;
            if (nums[mid] == target){
                return mid;
            }
            if (nums[start] <= nums[mid]){//left side sorted
                //check if target is in left sorted half
                if (target >= nums[start] && target < nums[mid]){
                    end = mid-1;
                } else {
                    start = mid+1;
                }
            } else {//right side sorted
                //check if target is in right sorted half
                if (target > nums[mid] && target <= nums[end]){
                    start = mid+1;
                } else {
                    end = mid-1;
                }
            }
        }
        return -1;
    }
}