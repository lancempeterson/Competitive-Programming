class Solution {
    func permute(_ nums: [Int]) -> [[Int]] {
        var ans: [[Int]] = []
        generate(nums, [], &ans)
        return ans
    }
    func generate(_ nums: [Int], _ perm: [Int], _ ans: inout [[Int]]) {
        if nums.isEmpty {
            ans.append(perm)
        }
        for num in nums {
            var tempNums = nums.filter { $0 != num }
            var tempPerm = perm
            tempPerm.append(num)
            generate(tempNums, tempPerm, &ans)
        }
    }
}