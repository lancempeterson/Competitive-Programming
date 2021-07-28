class Solution {
    func minPathSum(_ grid: [[Int]]) -> Int {
        var dp = [[Int]](repeating: [Int](repeating: 0, count: grid[0].count), count: grid.count)
        for i in 0..<grid.count {
            for j in 0..<grid[i].count {
                dp[i][j] += grid[i][j]
                var minFromAbove = Int.max
                var minFromLeft = Int.max
                if i - 1 >= 0 {
                    minFromAbove = dp[i - 1][j]
                }
                if j - 1 >= 0 {
                    minFromLeft = dp[i][j - 1]
                }
                var minOfAboveOrBelow = min(minFromAbove, minFromLeft)
                if minOfAboveOrBelow != Int.max {
                    dp[i][j] += minOfAboveOrBelow
                }
            }
        }
        return dp[dp.count - 1][dp[0].count - 1]
    }
}