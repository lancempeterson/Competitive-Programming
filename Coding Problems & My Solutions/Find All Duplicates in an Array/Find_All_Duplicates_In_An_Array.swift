class Solution {
    func findDuplicates(_ nums: [Int]) -> [Int] {
        var nums = nums
        var arr: [Int] = []
        for (i, num) in nums.enumerated() {
            let index = num - 1
            if nums[index] < 0 {
                arr.append(num)
            }
            nums[index] = -nums[index]
        }
        return arr
    }
}