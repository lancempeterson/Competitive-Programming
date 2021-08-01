class Solution {
    func plusOne(_ digits: [Int]) -> [Int] {
        var digs = digits
        var i = digs.count - 1
        while i >= 0 {
            if digs[i] < 9 {
                digs[i] = digs[i] + 1
                return digs
            } else {
                digs[i] = 0
                i -= 1
            }
        }
        var expandedArr: [Int] = [1]
        return expandedArr + digs
    }
}