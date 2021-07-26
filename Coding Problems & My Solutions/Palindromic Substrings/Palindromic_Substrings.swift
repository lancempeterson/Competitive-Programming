class Solution {
    func countSubstrings(_ s: String) -> Int {
        var ans = 0
        var dp = [[Int]](repeating: [Int](repeating: 0, count: s.count), count: s.count)
        var arr = Array(s)
        for col in 0..<arr.count {
            for row in 0..<arr.count {
                if row > col {
                    continue
                }
                if col == row {
                    dp[row][col] = 1
                    ans += 1
                }
                else if col - row <= 1 && arr[col] == arr[row] {
                    dp[row][col] = 1
                    ans += 1
                }
                else if arr[col] == arr[row] && dp[row + 1][col - 1] == 1 {
                    dp[row][col] = 1
                    ans += 1
                }
            }
        }
        return ans
    }
}

// Algorithm from [https://www.youtube.com/watch?v=EIf9zFqufbU]