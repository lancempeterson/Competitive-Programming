class Solution {
    func rob(_ nums: [Int]) -> Int {
        var dp = [Int](repeating: 0, count: nums.count + 1)
        dp[1] = nums[0]
        var i = 1
        while i < nums.count {
            dp[i + 1] = max(nums[i] + dp[i - 1], dp[i])
            i += 1
        }
        return dp.last!
    }
}