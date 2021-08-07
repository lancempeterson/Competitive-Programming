class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) {
            return false
        }
        val sSorted: CharArray = s.toCharArray().sortedArray()
        val tSorted: CharArray = t.toCharArray().sortedArray()
        var i = 0
        while (i < sSorted.size) {
            if (sSorted[i] != tSorted[i]) {
                return false
            }
            i += 1
        }
        return true
    }
}