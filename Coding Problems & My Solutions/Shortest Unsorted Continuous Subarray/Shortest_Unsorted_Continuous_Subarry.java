public int findUnsortedSubarray(int[] nums) {
        if (nums.length < 2){
            return 0;
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int start = -1;
        int end = -2;
        for (int i = 0; i < nums.length; i++){
            max = Math.max(max,nums[i]);
            if (nums[i] < max){
                end = i;
            }
        }
        for (int i = nums.length - 1; i >= 0; i--){
            min = Math.min(min, nums[i]);
            if (nums[i] > min){
                start = i;
            }
        }
        return end - start + 1;
    }