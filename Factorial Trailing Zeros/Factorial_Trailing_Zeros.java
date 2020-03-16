class Solution {
    public int trailingZeroes(int n) {
        if ( n == 0 ){
            return 0;
        }
        int zeros = 0;
        while ( n > 0 ){
            n = n / 5;
            zeros += n;
        }
        return zeros;
        
        // long [] dp = new long[n+1];
        // dp[0] = dp[1] = 1;
        // long factorial = getFactorial(n, dp);
        //int zeros = 0;
        // if ( factorial < 10 ){
        //     return 0;
        // }
        // while (factorial >= 10){
        //     if ( factorial % 10 == 0)
        //     {
        //         zeros++;
        //     }
        //     else {
        //         factorial = 0;
        //     }
        //     factorial /= 10;
        // }
        // return zeros;
    }
    
    // public long getFactorial(int n, long [] dp){
    //     if ( n == 0 ){
    //         return 1;
    //     }
    //     else {
    //         if (dp[n] != 0){
    //             return dp[n];
    //         }
    //         else {
    //             dp[n] = n * getFactorial(n-1,dp);
    //             return dp[n];
    //         }
    //     }
    // }
}