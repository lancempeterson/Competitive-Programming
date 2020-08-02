class Solution {
    public int minPathSum(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0){
            return 0;
        }
        int [][] dp = new int [grid.length][grid[0].length];
        for (int row = 0; row < dp.length; row++){
            for (int col = 0; col < dp[row].length; col++){
                dp[row][col] = grid[row][col];
                if (row > 0 && col > 0){
                    dp[row][col] += Math.min(dp[row-1][col],dp[row][col-1]);
                }
                else if (row > 0){
                    dp[row][col] += dp[row-1][col];
                }
                else if (col > 0){
                    dp[row][col] += dp[row][col-1];
                }
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
}