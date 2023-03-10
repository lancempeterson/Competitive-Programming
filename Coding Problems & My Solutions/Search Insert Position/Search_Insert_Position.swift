class Solution {
    func searchInsert(_ nums: [Int], _ target: Int) -> Int {
        var l = 0
        var r = nums.count - 1
        while l <= r {
            let m = (l + r) / 2
            if nums[m] == target {
                return m
            }
            else if target > nums[m] {
                l = m + 1
            }
            else {
                r = m - 1
            }
        }
        return l
    }
}