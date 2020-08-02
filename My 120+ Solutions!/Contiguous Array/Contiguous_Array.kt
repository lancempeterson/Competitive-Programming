class Solution {
    fun findMaxLength(nums: IntArray): Int {
        var count = 0
        var max = 0
        val map = hashMapOf<Int, Int>()
        map.put(0,-1)
        for ((i, value) in nums.withIndex()){
            if (value == 0){
                count--
            } else {
                count++
            }
            if (map.containsKey(count)){
                max = max.coerceAtLeast(i - map.getValue(count))
            } else {
                map.put(count, i)
            }
        }
        return max
    }
}