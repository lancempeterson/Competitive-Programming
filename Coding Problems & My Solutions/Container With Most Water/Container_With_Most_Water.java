class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int a = 0;
        int b = height.length - 1;
        while (a < b){
            max = Math.max(max,(Math.min(height[a],height[b])*(b-a)));
            if (height[a] > height[b]){
                b--;
            } else{
                a++;
            }
        }
        return max;
    }
}