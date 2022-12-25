class Solution {
    func twoSum(_ nums: [Int], _ target: Int) -> [Int] {
        var dict = [Int:Int]()
        var ans: [Int] = []
        for (i, num) in nums.enumerated() {
            guard let x = dict[num] else {
                dict[target - num] = i
                continue
            }
            ans = [x, i]
            break
        }
        return ans
    }
}

class Solution {
    func twoSum(_ nums: [Int], _ target: Int) -> [Int] {
        var ans: [Int] = []
        var dict: [Int:Int] = [:]
        for (i, num) in nums.enumerated() {
            if let index = dict[num] {
                ans = [index, i]
                break
            } else {
                let numToFind = target - num
                dict[numToFind] = i
            }
        }
        return ans
    }
}