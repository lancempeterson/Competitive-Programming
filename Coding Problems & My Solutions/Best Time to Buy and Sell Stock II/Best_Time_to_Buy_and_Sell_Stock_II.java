class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length < 2){
            return 0;
        }
        int profit = 0;
        int a = 0;
        int b = 1;
        while (b < prices.length){
            if (prices[b] > prices[a]){
                profit += prices[b] - prices[a];
            }
            a++;
            b++;
        }
        return profit;
    }
}