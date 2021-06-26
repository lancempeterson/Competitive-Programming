class Solution {
    func maxArea(_ height: [Int]) -> Int {
        var maxNo = Int.min
        var a = 0
        var b = height.count - 1
        while a <= b {
            maxNo = max(maxNo, (b-a) * min(height[a], height[b]))
            if height[a] > height[b] {
                b -= 1
            } else {
                a += 1
            }
        }
        return maxNo
    }
}