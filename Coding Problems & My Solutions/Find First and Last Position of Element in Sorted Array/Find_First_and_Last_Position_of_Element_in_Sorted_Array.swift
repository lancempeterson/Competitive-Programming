class Solution {
    func searchRange(_ nums: [Int], _ target: Int) -> [Int] {
        var ans: [Int] = []
        var a = 0
        var b = nums.count - 1
        while a <= b {
            var mid = a + ((b - a) / 2)
            if nums[mid] == target {
                var i = mid
                while i >= 0 && nums[i] == target {
                    i -= 1
                }
                ans.append(i + 1)
                var j = mid
                while j < nums.count && nums[j] == target {
                    j += 1
                }
                ans.append(j - 1)
                return ans
            }
            else if target > nums[mid] {
                a = mid + 1
            } else {
                b = mid - 1
            }
        }
        return [-1, -1]
    }
}