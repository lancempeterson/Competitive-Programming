class Solution {
    public int singleNonDuplicate(int[] nums) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end){
            int mid = start + ((end - start)/2);
            boolean leftSideSame = false;
            boolean rightSideSame = false;
            if (mid - 1 >= 0 && nums[mid-1] == nums[mid]){
                leftSideSame = true;
            }
            if (mid + 1 < nums.length && nums[mid+1] == nums[mid]){
                rightSideSame = true;
            }
            if (!leftSideSame && !rightSideSame){
                ans = nums[mid];
                break;
            }
            if (mid % 2 == 0){
                if (leftSideSame){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (leftSideSame){
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return ans;
    }
}