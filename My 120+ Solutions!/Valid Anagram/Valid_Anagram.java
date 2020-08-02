class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }
        int[] alphFreq = new int [26];
        for(char c : s.toCharArray()){
            alphFreq[c - 'a']++;
        }
        for (char c : t.toCharArray()){
            alphFreq[c - 'a']--;
            if (alphFreq[c - 'a'] < 0){
                return false;
            }
        }
        return true;
    }
}