class Solution {
    fun maxProduct(nums: IntArray): Int {
        var hi = Int.MIN_VALUE
        var lo = Int.MAX_VALUE
        var ans = hi
        for ((i,num) in nums.withIndex()) {
            if (i == 0) {
                hi = num
                lo = num
            } else {
                var tempHi = hi
                hi = maxOf(num, maxOf(num * hi, num * lo))
                lo = minOf(num, minOf(num * tempHi, num * lo))
            }
            ans = maxOf(ans, hi)
        }
        return ans
    }
}