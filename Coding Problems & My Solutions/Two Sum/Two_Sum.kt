class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        var hashMap = HashMap<Int, Int>()
        for ((i,num) in nums.withIndex()) {
            if (hashMap.containsKey(num)) {
                return intArrayOf(hashMap[num]!!, i)
            } else {
                hashMap[target - num] = i
            }
        }
        return intArrayOf()
    }
}