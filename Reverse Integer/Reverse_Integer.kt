class Solution {
    fun reverse(x: Int): Int {
        var num = x
        var ans: Double = 0.0
        var isNegative = false
        if ( num < 0 ){
            num = 0 - num
            isNegative = true
        }
        val s = Integer.toString(num)
        var charArray = s.toCharArray()
        for ((i, char) in charArray.withIndex()){
            var mult = Math.pow(10.0, i.toDouble())
            var charIntVal = charArray[i].toInt() - '0'.toInt()
            var toAdd = charIntVal * mult
            ans += toAdd
        }
        if ( isNegative ){
            ans = 0 - ans
        }
        if ( ans < Int.MIN_VALUE || ans > Int.MAX_VALUE ){
            return 0
        }
        return ans.toInt()
    }
}