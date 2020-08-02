class Solution {
    public void moveZeroes(int[] nums) {
        int a = 0;
        int b = 0;
        while (b < nums.length){
            if (nums[a] == 0 && nums[b] != 0){
                int temp = nums[a];
                nums[a] = nums[b];
                nums[b] = temp;
            }
            if (nums[a] != 0 || nums[b] != 0){
                a++;
            }
            b++;
        }
    }
}