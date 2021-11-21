class Solution {
    fun maxSubArray(nums: IntArray): Int {
        var maxVal = Integer.MIN_VALUE
        var count = 0
        for ((i, num) in nums.withIndex()) {
            if (count < 0) {
                count = 0
            }
            count += num
            maxVal = maxOf(maxVal, count)
        }
        return maxVal
    }
}

class Solution {
    fun maxSubArray(nums: IntArray): Int {
        var max = Int.MIN_VALUE
        if ( nums.size == 0 ){
            return max
        }
        else if ( nums.size == 1 ){
            return nums[0]
        }
        var i = 1
        var subMax = nums[0]
        max = Math.max(max, subMax)
        while ( i < nums.size ) {
            subMax = Math.max(nums[i], subMax + nums[i])      
            max = Math.max(max, subMax)
            i++
        }
        return max
    }
}