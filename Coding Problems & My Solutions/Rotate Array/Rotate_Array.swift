class Solution {
    func rotate(_ nums: inout [Int], _ k: Int) {
        var k = k
        if k >= nums.count {
            k = k % nums.count
        }
        if k < 1 {
            return
        }
        var rightArr: [Int] = []
        for i in 0..<nums.count-k {
            rightArr.append(nums[i])
        }
        var leftArr: [Int] = []
        for i in nums.count-k..<nums.count {
            leftArr.append(nums[i])
        }
        nums = leftArr + rightArr
    }
}