class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet <Character> hashset = new HashSet<>();
        int max = 0;
        int a = 0;
        int b = 0;
        while ( b < s.length() ){
            if ( !hashset.contains(s.charAt(b))){
                hashset.add(s.charAt(b));
                b++;
                max = Math.max(max,hashset.size());
            }
            else {
                hashset.remove(s.charAt(a));
                a++;
            }
        }
        return max;
    }
}