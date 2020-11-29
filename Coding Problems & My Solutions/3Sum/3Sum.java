class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        if (nums == null || nums.length < 3){
            return ans;
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-2; i++){
            if (i != 0 && nums[i] == nums[i-1]){
                continue;
            }
            int z = nums[i];
            int a = i+1;
            int b = nums.length-1;
            while (a < b){
                int x = nums[a];
                int y = nums[b];
                if (x + y + z == 0){
                    List<Integer> l = new ArrayList<>();
                    l.add(z);
                    l.add(x);
                    l.add(y);
                    ans.add(l);
                }
                if (x + y + z > 0){
                    int currentY = y;
                    while(currentY == nums[b] && b > a){
                        b--;
                    }
                } else {
                    int currentX = x;
                    while (currentX == nums[a] && a < b){
                        a++;
                    }
                }
            }
        }
        return ans;
    }
}