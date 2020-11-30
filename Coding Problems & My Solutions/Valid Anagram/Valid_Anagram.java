class Solution {
    public boolean isAnagram(String s, String t) {
        if (s == null || t == null || s.length() != t.length()){
            return false;
        }
        int[] alphabetFreq = new int[26];
        for (char c : s.toCharArray()){
            alphabetFreq[c-'a']++;
        }
        for (char c : t.toCharArray()){
            alphabetFreq[c-'a']--;
            if (alphabetFreq[c-'a'] < 0){
                return false;
            }
        }
        return true;
    }
}