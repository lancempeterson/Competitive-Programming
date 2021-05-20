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

class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int runningCount = max;
        for (int i = 1; i < nums.length; i++) {
            if (runningCount < 0) {
                runningCount = 0;
            }
            runningCount += nums[i];
            max = Math.max(max, runningCount);
        }
        return max;
    }
}