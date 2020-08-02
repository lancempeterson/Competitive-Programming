class Solution {
    public int twoCitySchedCost(int[][] costs) {
        Arrays.sort(costs, (a,b) -> (a[0]-a[1]) - (b[0]-b[1]));
        int ans = 0;
        int a = 0;
        int b = costs.length - 1;
        while (a < b){
            ans += costs[a][0];
            ans += costs[b][1];
            a++;
            b--;
        }
        return ans;
    }
}