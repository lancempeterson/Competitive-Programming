class Solution {
    fun maxArea(height: IntArray): Int {
        var max = 0
        var a = 0
        var b = height.size - 1
        while (a < b) {
            max = maxOf(max, (minOf(height[a], height[b]) * (b - a)))
            if (height[a] > height[b]) {
                b -= 1
            } else {
                a += 1
            }
        }
        return max
    }
}