class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0){
            return true;
        }
        int a = 0, b = 0;
        while (b < t.length()){
            if (t.charAt(b) == s.charAt(a)){
                a++;
                if (a == s.length()){
                    return true;
                }
            }
            b++;
        }
        return false;
    }
}