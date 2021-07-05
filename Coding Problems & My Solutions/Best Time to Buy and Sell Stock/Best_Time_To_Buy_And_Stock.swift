class Solution {
    func maxProfit(_ prices: [Int]) -> Int {
        var maxProfit: Int = 0
        var bestLast: Int = prices[0]
        for (i, price) in prices.enumerated() {
            bestLast = min(bestLast, price)
            if bestLast == price { continue }
            maxProfit = max(maxProfit, price - bestLast)
        }
        return maxProfit
    }
}