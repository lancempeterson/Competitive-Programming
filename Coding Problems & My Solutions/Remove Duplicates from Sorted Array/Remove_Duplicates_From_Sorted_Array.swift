class Solution {
    func removeDuplicates(_ nums: inout [Int]) -> Int {
        var i = 0
        var j = 0
        while j <= nums.count - 1 {
            while (j != nums.count - 1) && nums[j] == nums[j+1] {
                j += 1
                continue
            }
            var temp = nums[i]
            nums[i] = nums[j]
            nums[j] = temp
            i += 1
            j += 1
        }
        return i
    }
}