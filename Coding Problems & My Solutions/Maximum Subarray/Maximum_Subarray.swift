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