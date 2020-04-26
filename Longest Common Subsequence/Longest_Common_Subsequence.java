class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        // char [] ar1 = text1.toCharArray();
        // char [] ar2 = text2.toCharArray();
        // int dp [][] = new int [ar1.length][ar2.length];
        // return LCS(ar1, ar2, 0, 0, dp);
        return iterativeLCS(text1, text2);
    }
	//Dynamic Programming with Memoization (~19 ms)
    public int LCS(char [] ar1, char [] ar2, int i, int j, int [][] dp){
        if (i == ar1.length || j == ar2.length) {
			return 0;
		}
        if (dp[i][j] != 0){
            return dp[i][j];
        }
		int result = 0;
		if (ar1[i] == ar2[j]) {
			result = 1 + LCS(ar1, ar2, i+1, j+1, dp);
		}
		else {
			int temp1 = LCS(ar1, ar2, i+1,j, dp);
			int temp2 = LCS(ar1, ar2, i, j+1, dp);
			result = Math.max(temp1, temp2);
		}
        dp[i][j] = result;
		return result;
    }
	//Bottom-Up Iterative (~6 ms)
    public int iterativeLCS(String text1, String text2) {
        char [] ar1 = text1.toCharArray();
        char [] ar2 = text2.toCharArray();
        int dp [][] = new int [ar1.length + 1][ar2.length + 1];
        for (int i = 1; i < dp.length; i++) {
        	for (int j = 1; j < dp[i].length; j++) {
                if (ar1[i-1] == ar2[j-1]){
                    dp[i][j] = 1 + dp[i-1][j-1];  
                } else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
        	}
        }
        return dp[ar1.length][ar2.length];
    }
}