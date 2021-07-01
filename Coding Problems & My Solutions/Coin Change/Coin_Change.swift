class Solution {
    func coinChange(_ coins: [Int], _ amount: Int) -> Int {
        var dp = [Int](repeating: amount + 1, count: amount + 1)
        dp[0] = 0
        var i = 1
        while i <= amount {
            var subMin = amount + 1
            for coin in coins {
                var subproblem = i - coin
                if subproblem < 0 {
                    continue
                }
                var coinsUsed = 1 + dp[subproblem]
                subMin = min(subMin, coinsUsed)
            }
            dp[i] = subMin
            i += 1
        }
        if dp[amount] >= amount + 1 {
            return -1
        } else {
            return dp[amount]
        }
    }
}