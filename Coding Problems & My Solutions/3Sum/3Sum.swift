class Solution {
    func threeSum(_ nums: [Int]) -> [[Int]] {
        var ans: [[Int]] = []
        var nums = nums.sorted()
        var i = 0
        while i < nums.count - 2 {
            if i != 0 && nums[i] == nums[i-1] {
                i += 1
                continue
            }
            var j = i + 1
            var k = nums.count - 1
            while j < k {
                var sum = nums[i] + nums[j] + nums[k]
                if sum == 0 {
                    var sol: [Int] = [nums[i], nums[j], nums[k]]
                    ans.append(sol)
                    repeat {
                        j += 1
                    } while j < k && nums[j] == nums[j-1]
                }
                else if sum < 0 {
                    j += 1
                } else {
                    k -= 1
                }
            }
            i += 1
        }
        return ans
    }
}