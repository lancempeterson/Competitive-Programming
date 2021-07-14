class Solution {
    func lengthOfLongestSubstring(_ s: String) -> Int {
        var maxLen = 0
        var set = Set<Character>()
        var arr = Array(s)
        var a = 0
        var b = 0
        while b < arr.count {
            if set.contains(arr[b]) {
                set.remove(arr[a])
                a += 1
            } else {
                set.insert(arr[b])
                maxLen = max(maxLen, b - a + 1)
                b += 1
            }
        }
        return maxLen
    }
}