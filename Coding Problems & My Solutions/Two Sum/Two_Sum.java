class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] ans = new int [2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            int x = nums[i];
            int y = target - x;
            if (map.containsKey(y)){
                ans[0] = i;
                ans[1] = map.get(y);
                break;
            }
            map.put(x, i);
        }
        return ans;
    }
}