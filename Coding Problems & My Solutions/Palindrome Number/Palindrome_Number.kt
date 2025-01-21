class Solution {
    fun isPalindrome(x: Int): Boolean {
        if (x < 0) { return false }
        val str = x.toString()
        var a = 0
        var b = str.length - 1
        while (a <= b) {
            if (str[a] != str[b]) {
                return false
            }
            a += 1
            b -= 1
        }
        return true
    }
}