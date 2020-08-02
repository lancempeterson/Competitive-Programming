class Solution {
    public int rob(int[] nums) {
        if ( nums.length <= 0 ){
            return 0;
        }
        else if ( nums.length == 1 ){
            return nums[0];
        }
        int [] dp = new int [nums.length];
        dp[0] = nums[0];
        dp[1] = nums[1];
        int maxMoney = Math.max(dp[0],dp[1]);
        for ( int i = 2; i < dp.length; i++ ){
            for ( int j = 0; j < i-1; j++){ 
                dp[i] = Math.max(dp[i], nums[i] + dp[j]);
                if (dp[i] > maxMoney){
                    maxMoney = dp[i];
                }
            }
        }
        return maxMoney;
    }
}
//Dynamic Programming Pattern