class Solution {
    public void moveZeroes(int[] nums) {
        if ( nums.length == 0 || nums.length == 1 ){
            return;
        }
        int a = 0;
        int b = 1;
        while ( b < nums.length ){
            if ( nums[b] != 0 && nums[a] == 0 ){
                int temp = nums[b];
                nums[b] = nums[a];
                nums[a] = temp;
                a++;
                b++;
            }
            else if ( nums[b] == 0 && nums[a] == 0 ){
                b++;
            }
            else {
                a++;
                b++;
            }
        }
        return;
    }
}