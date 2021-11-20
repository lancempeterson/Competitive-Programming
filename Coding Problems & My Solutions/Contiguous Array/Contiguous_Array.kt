
class Solution {
    fun findMaxLength(nums: IntArray): Int {
        var count = 0
        val hashMap = HashMap<Int, Int>()
        var ans = 0
        hashMap[0] = -1
        for ((i, num) in nums.withIndex()) {
            if (num == 1) {
                count += 1
            } else {
                count -= 1
            }
            if (hashMap.containsKey(count)) {
                ans = maxOf(ans, i - hashMap[count]!!)
            } else {
                hashMap[count] = i
            }
        }
        return ans
    }
}

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

class Solution {
    fun findMaxLength(nums: IntArray): Int {
        var hashMap = HashMap<Int, Int>()
        var ans = 0
        var count = 0
        var i = 0
        hashMap.put(0, -1)
        while (i < nums.size) {
            if (nums[i] == 0) {
                count -= 1
            } else {
                count += 1
            }
            if (hashMap.containsKey(count)) {
                ans = maxOf(ans, i - hashMap.get(count)!!)
            } else {
                hashMap[count] = i
            }
            i += 1
        }
        return ans
    }
}