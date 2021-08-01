class Solution {
    func intersect(_ nums1: [Int], _ nums2: [Int]) -> [Int] {
        var a = 0
        var b = 0
        var ans: [Int] = []
        var nums1 = nums1.sorted()
        var nums2 = nums2.sorted()
        while a < nums1.count && b < nums2.count {
            if nums1[a] == nums2[b] {
                ans.append(nums1[a])
                a += 1
                b += 1
            } 
            else if nums1[a] < nums2[b] {
                a += 1
            } else {
                b += 1
            }
        }
        return ans
    }
}