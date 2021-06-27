class Solution {
    func isAnagram(_ s: String, _ t: String) -> Bool {
        var dict: [Character:Int] = [:]
        for char in Array(s) {
            var charCount = dict[char] ?? 0
            dict[char] = charCount + 1
        }
        for char in Array(t) {
            var charCount = dict[char] ?? 0
            dict[char] = charCount - 1
        }
        for (key, value) in dict {
            if value != 0 {
                return false
            }
        }
        return true
    }
}