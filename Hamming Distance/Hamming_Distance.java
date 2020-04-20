class Solution {
    public int hammingDistance(int x, int y) {
        int z = x ^ y;
        int ans = 0;
        while (z > 0){
            if ( z % 2 == 1){
                ans++;
            }
            z = z >> 1;
        }
        return ans;
    }
}