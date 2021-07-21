class Solution {
    func subsets(_ nums: [Int]) -> [[Int]] {
        var ans: [[Int]] = []
        generate([], nums, 0, &ans)
        return ans
    }
    
    func generate(_ subset: [Int], _ nums: [Int], _ i: Int, _ ans: inout [[Int]]) {
        ans.append(subset)
        var i = i
        while i < nums.count {
            var temp = subset
            temp.append(nums[i])
            generate(temp, nums, i + 1, &ans)
            i += 1
        }
    }
}