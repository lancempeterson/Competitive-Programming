class Solution {
    func hammingWeight(_ n: Int) -> Int {
        var ans = 0
        var num = n
        while num != 0 {
            if num % 2 == 1 {
                ans += 1
            }
            num = num >> 1
        }
        return ans
    }
}