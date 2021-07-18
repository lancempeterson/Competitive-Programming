class Solution {
    func findMaxLength(_ nums: [Int]) -> Int {
        var dict: [Int:Int] = [:]
        var count = 0
        var maxLen = 0
        dict[0] = -1
        for (i, num) in nums.enumerated() {
            if num == 0 {
                count -= 1
            } else {
                count += 1
            }
            if let y = dict[count] {
                maxLen = max(maxLen, i - y)
            } else {
                dict[count] = i
            }
        }
        return maxLen
    }
}