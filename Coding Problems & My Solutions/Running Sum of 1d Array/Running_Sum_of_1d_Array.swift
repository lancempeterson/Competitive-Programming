class Solution {
    func runningSum(_ nums: [Int]) -> [Int] {
        var runningSumArr = [Int](repeating: 0, count: nums.count)
        var runningCount = 0
        for (i, num) in nums.enumerated() {
            runningSumArr[i] = num + runningCount
            runningCount += num
        }
        return runningSumArr
    }
}