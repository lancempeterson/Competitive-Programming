class Solution {
    fun checkValidString(s: String): Boolean {
        return isValid(s, '(') && isValid(s.reversed(), ')')
    }
    
    fun isValid(s: String, char: Char): Boolean {
        var open = 0
        var close = 0
        var star = 0
        for (c in s){
            when(c){
                '*' -> star++
                char -> open++
                else -> close++
            }
            if (close > open + star){
                return false
            }
        }
        return true
    }
}