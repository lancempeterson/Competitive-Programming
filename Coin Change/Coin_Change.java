class Solution {
    public int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);
        int [] dpArray = new int [amount+1];
        Arrays.fill(dpArray, amount+1);//Fill the array with invalid values to start (coins used can't be more than amount)
        dpArray[0] = 0;
        for (int i = 0; i <= amount; i++){ 
            int coinsUsed = 0;
            for (int j = coins.length-1; j >= 0; j--){ 
                if (coins[j] <= i){
                    int remainder = i - coins[j];
                    coinsUsed = 1 + dpArray[remainder];
                    dpArray[i] = Math.min(dpArray[i], coinsUsed);
                }
            }
        }
        if ( dpArray[amount] > amount){
            return -1;
        }
        else {
            return dpArray[amount];
        }
    }
}
//Dynamic Programming Pattern