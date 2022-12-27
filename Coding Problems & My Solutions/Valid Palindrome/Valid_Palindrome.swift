class Solution {
    func isPalindrome(_ s: String) -> Bool {
        var arr = Array(s.lowercased())
        var i = 0
        var j = arr.count - 1
        while i < j {
            if (arr[i].isLowercase || arr[i].isNumber) && (arr[j].isLowercase || arr[j].isNumber) {
                if arr[i] != arr[j] {
                    return false
                }
                i += 1
                j -= 1
            }
            else if !arr[i].isLowercase && !arr[i].isNumber {
                i += 1
            }
            else if !arr[j].isLowercase && !arr[j].isNumber {
                j -= 1
            }
        }
        return true
    }
}

class Solution {
    func isPalindrome(_ s: String) -> Bool {
        let validChars = "abcdefghijklmnopqrstuvwxyz0123456789"
        var s = s.lowercased()
        let arr = Array(s)
        var l = 0
        var r = s.count - 1
        while l < r {
            if !validChars.contains(arr[l]) {
                l += 1
                continue
            }
            if !validChars.contains(arr[r]) {
                r -= 1
                continue
            }
            if arr[l] != arr[r] {
                return false
            }
            l += 1
            r -= 1
        }
        return true
    }
}