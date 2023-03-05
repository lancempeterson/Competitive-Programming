class Solution {
    func findMaxLength(_ nums: [Int]) -> Int {
        var dict: [Int:Int] = [:]
        var count = 0
        var maxLen = 0
        dict[0] = -1
        for (i, num) in nums.enumerated() {
            if num == 0 {
                count -= 1
            } else {
                count += 1
            }
            if let y = dict[count] {
                maxLen = max(maxLen, i - y)
            } else {
                dict[count] = i
            }
        }
        return maxLen
    }
}

class Solution {
    func findMaxLength(_ nums: [Int]) -> Int {
        var count = 0
        var dict: [Int:Int] = [:]
        var maxx = 0
        dict[0] = -1
        for (i, val) in nums.enumerated() {
            if val == 1 {
                count += 1
            } else {
                count -= 1
            }
            if dict[count] != nil {
                var length = i - dict[count]!
                maxx = max(maxx, length)
            } else {
                dict[count] = i
            }
        }
        return maxx
    }
}

class Solution {
    func findMaxLength(_ nums: [Int]) -> Int {
        var count: Int = 0
        var dict: [Int:Int] = [:]
        var ans: Int = 0
        dict[0] = -1
        for (i, num) in nums.enumerated() {
            if num == 0 {
                count -= 1
            } else {
                count += 1
            }
            if let firstIndexOfCount = dict[count] {
                ans = max(ans, (i - firstIndexOfCount))
            } else {
                dict[count] = i
            }
        }
        return ans
    }
}