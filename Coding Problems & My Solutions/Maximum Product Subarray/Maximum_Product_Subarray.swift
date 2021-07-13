class Solution {
    func maxProduct(_ nums: [Int]) -> Int {
        var ans = Int.min
        var curMax = 1
        var curMin = 1
        for num in nums {
            var tempMax = curMax
            curMax = max(num * curMax, num * curMin, num)
            curMin = min(num * tempMax, num * curMin, num)
            ans = max(ans, curMax)
        }
        return ans
    }
}