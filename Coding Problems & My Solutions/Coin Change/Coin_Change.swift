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

// Note the code below exceeds the time limit, as it is O(N^2) time complexity
// But it is a brute force solution that works slowly for low amounts.


func coinChange(_ coins: [Int], _ amount: Int) -> Int {
    //var arr: [Int] = []
    var coins = coins.sorted()
    coins = coins.reversed()
    //print("coins: \(coins)")
    return useCoin(coins: coins, remaining: amount)
}

func useCoin(coins: [Int], remaining: Int) -> Int {
    if remaining == 0 {
        return 0
    }
    var minCoins = Int.max
    for coin in coins {
        if remaining >= coin {
            let result = useCoin(coins: coins, remaining: remaining - coin)
            if result != -1 {
                minCoins = min(minCoins, result)
            }
        }
    }
    if minCoins == Int.max {
        return -1
    } else {
        return minCoins + 1
    }
}