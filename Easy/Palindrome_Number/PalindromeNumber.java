class Solution {
    public boolean isPalindrome(int x) {
        String s = Integer.toString(x);
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb = sb.reverse();
        String rs = sb.toString();
        if ( s.equals(rs) ){
            return true;
        }
        else {
            return false;
        }
    }
}