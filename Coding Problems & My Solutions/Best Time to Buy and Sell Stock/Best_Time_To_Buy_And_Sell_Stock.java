class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int max = 0;
        for (int i = 0; i < prices.length; i++){
            if (i > 0){
                int spentCost = 0 - minPrice;
                int priceGain = spentCost + prices[i];
                max = Math.max(max, priceGain);
            }
            minPrice = Math.min(minPrice, prices[i]);
        }
        return max;
    }
}

class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 1) {
            return 0;
        }
        int max = 0;
        int low = prices[0];
        for (int i = 1; i < prices.length; i++) {
            low = Math.min(low, prices[i - 1]);
            max = Math.max(max, prices[i] - low);
        }
        return max;
    }
}