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

class Solution {
    func maxProduct(_ nums: [Int]) -> Int {
        var ans = Int.min
        var currentMax = 1
        var currentMin = 1
        for num in nums {
            var tempMax = currentMax
            currentMax = max(num, num * currentMax, num * currentMin)
            currentMin = min(num, num * tempMax, num * currentMin)
            ans = max(ans, num, currentMax)
        }
        return ans
    }
}