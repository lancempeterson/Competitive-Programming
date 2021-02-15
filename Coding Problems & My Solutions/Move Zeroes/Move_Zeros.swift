class Solution {
    func moveZeroes(_ nums: inout [Int]) {
        var a = 0
        var b = 1
        while b < nums.count {
            if (nums[a] != 0) {
                a += 1
                b += 1
            }
            else if (nums[b] == 0) {
                b += 1
            }
            else if (nums[a] == 0 && nums[b] != 0) {
                var temp = nums[b]
                nums[b] = nums[a]
                nums[a] = temp
                a += 1
                b += 1
            }
        }
    }
}