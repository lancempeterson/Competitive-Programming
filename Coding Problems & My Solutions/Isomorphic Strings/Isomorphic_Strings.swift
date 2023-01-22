class Solution {
    func isIsomorphic(_ s: String, _ t: String) -> Bool {
        if s.count != t.count { return false }
        var dict: [Character:Character] = [:]
        let sArr = Array(s)
        let tArr = Array(t)
        for (i, char) in sArr.enumerated() {
            if let isomorph = dict[sArr[i]] {
                if isomorph  != tArr[i] {
                    return false
                }
            } else {
                if dict.values.contains(tArr[i]) {
                    return false
                }
                dict[sArr[i]] = tArr[i]
            }
        }
        return true
    }
}