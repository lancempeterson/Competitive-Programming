class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length-1;
        int [] ans = new int [2];
        
        while ( left < right ){
            
            int val = numbers[left] + numbers [right];
            if ( val == target ){
                ans[0] = left+1;
                ans[1] = right+1;
                return ans;
            }
            if ( target > val ){
                left++;
            }
            else {
                right--;                
            }
        }       
        
        return ans;
    }
}
//Two Pointers Pattern