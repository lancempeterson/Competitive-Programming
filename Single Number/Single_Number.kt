class Solution {
    fun singleNumber(nums: IntArray): Int {
        var bit = 0
        for ( num in nums ) {
            bit = bit xor num
        }
        return bit
    }
}