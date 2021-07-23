class Solution {
    func tribonacci(_ n: Int) -> Int {
        let maxN = 37
        var dp = [Int](repeating: -1, count: maxN + 1)
        return trib(n, &dp)
    }
    func trib(_ n: Int, _ dp: inout [Int]) -> Int {
        if n == 0 {
            return 0
        }
        else if n == 1 || n == 2 {
            return 1
        }
        if dp[n] != -1 {
            return dp[n]
        }
        dp[n] = trib(n-3, &dp) + trib(n-2, &dp) + trib(n-1, &dp)
        return dp[n]
    }
}