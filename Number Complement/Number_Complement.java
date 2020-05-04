class Solution {
    public int findComplement(int num) {
        if (num == 0){
            return 1;
        }
        int mask = 0;
        int n = 1;
        while (mask < num){
            mask += n;
            n *= 2;
        }
        return num ^ mask;
    }
}