class Solution {
    public int findMin(int[] nums) {
        int a = 0;
        int b = nums.length - 1;
        int min = Integer.MAX_VALUE;
        while (a <= b) {
            int mid = a + (b - a) / 2;
            min = Math.min(min, nums[mid]);
            if (nums[a] < nums[b]) {
                // Is Ascending
                b = mid - 1;
            } else {
                // Is Non-Ascending
                if (nums[a] > nums[mid] && nums[mid] < nums[b]) {
                    b = mid - 1;
                } else {
                    a = mid + 1;
                }
            }
        }
        return min;
    }
}