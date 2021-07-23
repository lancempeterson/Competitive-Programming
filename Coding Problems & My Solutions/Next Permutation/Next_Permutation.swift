class Solution {
    func nextPermutation(_ nums: inout [Int]) {
        if nums.count < 2 {
            return
        }
        var i = nums.count - 2
        // Find Element that breaks decreasing order
        while i >= 0 && nums[i] >= nums[i + 1] {
            i -= 1
        }
        if i >= 0 {
            // Find Element just larger than nums[i]
            var j = nums.count - 1
            while nums[j] <= nums[i] {
                j -= 1
            }
            swap(&nums, i, j)
        }
        // Reverse remaining elements
        reverse(&nums, i + 1)
    }
    
    func reverse(_ nums: inout [Int], _ start: Int) {
        var i = start
        var j = nums.count - 1
        while i < j {
            swap(&nums, i, j)
            i += 1
            j -= 1
        }
    }
    
    func swap(_ nums: inout [Int], _ i: Int, _ j: Int) {
        var temp = nums[i]
        nums[i] = nums[j]
        nums[j] = temp
    }
}