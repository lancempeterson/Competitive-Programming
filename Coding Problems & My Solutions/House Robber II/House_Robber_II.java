class Solution {
        public int rob(int[] nums) {
            int max = 0;
            if (nums.length == 0) {
                return max;
            }
            int[] dp1 = new int[nums.length - 1];
            int[] dp2 = new int[nums.length - 1];
            if (nums.length == 1) {
                return nums[0];
            } else if (nums.length == 2) {
                return Math.max(nums[0], nums[1]);
            } else {
                dp1[0] = nums[0];
                dp1[1] = nums[1];
                max = Math.max(dp1[0], dp1[1]);
                dp2[0] = nums[1];
                dp2[1] = nums[2];
                max = Math.max(max, dp2[1]);
                for (int i = 0; i < dp1.length; i++) {
                    for (int j = 0; j < i - 1; j++) {
                        dp1[i] = Math.max(dp1[i], nums[i] + dp1[j]);
                        max = Math.max(max, dp1[i]);
                    }
                }
                for (int i = 0; i < dp2.length; i++) {
                    for (int j = 0; j < i - 1; j++) {
                        dp2[i] = Math.max(dp2[i], nums[i + 1] + dp2[j]);
                        max = Math.max(max, dp2[i]);
                    }
                }
            }
            return max;
        }
    }