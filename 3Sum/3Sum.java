class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        if ( nums.length < 3 ){
            return ans;
        }
        Arrays.sort(nums);
		for (int i = 0; i < nums.length-2; i++) {
			if ( i == 0 || nums[i] > nums[i-1] ) {
                int target = 0 - nums[i];
			    int left = i+1;
			    int right = nums.length-1;
                while (left < right){
                    int val = nums[left] + nums[right];
			
			        if ( val == target ) {
				        List<Integer> list = new ArrayList<>();
				        list.add(nums[i]);
				        list.add(nums[left]);
				        list.add(nums[right]);
				        ans.add(list);
			        }
			        if ( val > target ) {
                        int currentRight = right;
                        while ( nums[right] == nums[currentRight] && left < right){
                            right--;
                        }
			        }
			        else {
                        int currentLeft = left;
                        while (nums[left] == nums[currentLeft] && left < right){
                            left++;    
                        }
			        }
                }
            }
		}
        return ans;
    }
}