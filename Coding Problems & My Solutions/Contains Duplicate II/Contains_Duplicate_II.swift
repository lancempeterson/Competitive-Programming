class Solution {
    func containsNearbyDuplicate(_ nums: [Int], _ k: Int) -> Bool {
        var dict: [Int:Int] = [:]
        for (i, num) in nums.enumerated() {
            if let index = dict[num] {
                var indexDiff = index - i
                if indexDiff < 0 {
                    indexDiff *= -1
                }
                if indexDiff <= k {
                    return true
                }
            }
            dict[num] = i
        }
        return false
    }
}