class Solution {
    func maxSubArray(_ nums: [Int]) -> Int {
        var maximum = Int.min
        var count = 0
        for num in nums { 
            count = max(count, 0)
            count += num
            maximum = max(maximum, count)
        }
        return maximum
    }
}

class Solution {
    func maxSubArray(_ nums: [Int]) -> Int {
        if nums.isEmpty { return 0 }
        var count: Int = 0
        var ans: Int = nums.first!
        for num in nums {
            let prevBestChoice = max(0, count)
            count = prevBestChoice + num
            ans = max(ans, count)
        }
        return ans
    }
}