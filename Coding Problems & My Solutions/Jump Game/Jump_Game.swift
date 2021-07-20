class Solution {
    func canJump(_ nums: [Int]) -> Bool {
        var lastGoodIndex = nums.count - 1
        var i = nums.count - 1
        while i >= 0 {
            if i + nums[i] >= lastGoodIndex {
                lastGoodIndex = i
            }
            i -= 1
        }
        return lastGoodIndex == 0
    }
}