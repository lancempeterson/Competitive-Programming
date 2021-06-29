class Solution {
    func search(_ nums: [Int], _ target: Int) -> Int {
        var a: Int = 0
        var b: Int = nums.count - 1
        while a <= b {
            let c = a + ((b-a)/2)
            if nums[c] == target {
                return c
            }
            var leftInOrder = nums[a] <= nums[c]
            if leftInOrder {
                if target >= nums[a] && target <= nums[c] {
                    b = c - 1
                } else {
                    a = c + 1
                }
            } else {
                if target >= nums[c] && target <= nums[b] {
                    a = c + 1
                } else {
                    b = c - 1
                }
            }
        }
        return -1
    }
}