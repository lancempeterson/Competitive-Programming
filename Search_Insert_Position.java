class Solution {
    public int searchInsert(int[] nums, int target) {
        
        int left = 0;
        int right = nums.length-1;
        int ans = -1;
        
        while ( left < right ){
            
            int mid = left + ( right - left ) / 2;
            
            if ( target == nums[mid] ){
                ans = mid;
                return mid;
            }
            else if ( target > nums[mid] ){
                left = mid+1;
            }
            else {
                right = mid-1;
            }
            
        }
        if ( ans == -1 ) {
			if ( target > nums[left] ) {
				ans = left+1;
			}
			else {
				ans = left;
			}
		}
        return ans;
    }
}