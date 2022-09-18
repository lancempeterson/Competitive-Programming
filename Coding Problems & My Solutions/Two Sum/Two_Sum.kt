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

class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = HashMap<Int, Int>()
        for ((i, num) in nums.withIndex()) {
            if (map.containsKey(num)) {
                return intArrayOf(map[num]!!, i)
            }
            val targetCompliment = target - num
            map.put(targetCompliment, i)
        }
        return intArrayOf()
    }
}