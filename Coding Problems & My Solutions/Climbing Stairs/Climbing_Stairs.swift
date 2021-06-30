class Solution {
    func climbStairs(_ n: Int) -> Int {
        var dp = [Int](repeating: 0, count: n + 1)
        dp[0] = 1
        dp[1] = 1
        var i = 2
        while i <= n {
            dp[i] = dp[i-2] + dp[i-1]
            i += 1
        }
        return dp[n]
    }
}