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