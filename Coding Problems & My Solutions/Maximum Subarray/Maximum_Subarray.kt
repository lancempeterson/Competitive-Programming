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