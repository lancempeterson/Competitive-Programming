class Solution {
    func isSubsequence(_ s: String, _ t: String) -> Bool {
        if s.isEmpty {
            return true
        }
        var b = 0
        var sArr = Array(s)
        var tArr = Array(t)
        for char in tArr {
            if char == sArr[b] {
                b += 1
                if b >= sArr.count {
                    return true
                }
            }
        }
        return false
    }
}