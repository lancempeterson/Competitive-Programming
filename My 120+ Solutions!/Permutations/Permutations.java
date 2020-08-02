class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        generatePermutations(ans, list, nums);
        return ans;
    }
    public void generatePermutations(List<List<Integer>> ans, List<Integer> list, int[] nums){
        if (nums.length == 0){
            List<Integer> l = new ArrayList<Integer>(list);
            ans.add(l);
            return;
        }
        for (int i = 0; i < nums.length; i++){
            int [] numsRemaining = new int [nums.length - 1];
            for (int j = 0, k = 0; j < nums.length; j++){
                if (j == i){
                    continue;
                }
                numsRemaining[k++] = nums[j];
            }
            list.add(nums[i]);
            generatePermutations(ans, list, numsRemaining);
            list.remove(list.size() - 1);
        }
        return;
    }
}