class Solution {
    func pivotIndex(_ nums: [Int]) -> Int {
        var fromLeftRunning = [Int](repeating: 0, count: nums.count)
        var fromRightRunning = [Int](repeating: 0, count: nums.count)
        var leftCount = 0
        var rightCount = 0
        for (i, num) in nums.enumerated() {
            fromLeftRunning[i] = leftCount
            leftCount += num
        }
        var i = nums.count - 1
        while i >= 0 {
            fromRightRunning[i] = rightCount
            rightCount += nums[i]
            i -= 1
        }
        for (i, num) in fromLeftRunning.enumerated() {
            if fromLeftRunning[i] == fromRightRunning[i] {
                return i
            }
        }
        return -1
    }
}