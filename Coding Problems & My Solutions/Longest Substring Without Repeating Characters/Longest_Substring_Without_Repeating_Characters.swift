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

class Solution {
    func lengthOfLongestSubstring(_ s: String) -> Int {
        var set = Set<Character>()
        var ans = 0
        let charArray = Array(s)//s.map { String($0) }
        var a = 0
        var b = 0
        while b < charArray.count {
            if set.contains(charArray[b]) {
                set.remove(charArray[a])
                a += 1
            } else {
                set.insert(charArray[b])
                let currentLen = (b - a) + 1
                ans = max(ans, currentLen)
                b += 1
            }
        }
        return ans
    }
}