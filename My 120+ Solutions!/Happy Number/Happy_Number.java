class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> seenInts = new HashSet<>();
        while ( n != 1 ){
            int count = 0;
            while ( n != 0 ){
                int r = n % 10;
                n /= 10;
                r = r * r;
                count += r;
            }
            n = count;
            if ( seenInts.contains(n) ){
                return false;
            }
            else {
                seenInts.add(n);
            }
        }
        return true;
    }
}