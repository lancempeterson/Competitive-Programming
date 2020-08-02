class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = n;
        while (i > 0){
            nums1[m] = nums2[n - i];
            m++;
            i--;
        }
        Arrays.sort(nums1);
    }
}