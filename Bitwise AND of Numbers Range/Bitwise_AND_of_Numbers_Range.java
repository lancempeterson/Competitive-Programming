class Solution {
    public int rangeBitwiseAnd(int m, int n) {
        while (n > m){
            n = n & (n-1);
        }
        int ans = m & n;
        return ans;
    }
}