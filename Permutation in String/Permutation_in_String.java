class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() == 0){
            return true;
        }
        int[] s1Freq = new int [26];
        int[] s2Freq = new int [26];
        Queue<Character> q = new LinkedList();
        for (char c : s1.toCharArray()){
            s1Freq[c - 'a'] += 1;
        }
        for (char c : s2.toCharArray()){
            if (q.size() == s1.length()){
                char _c = q.remove();
                s2Freq[_c - 'a'] -= 1;
            }
            q.add(c);
            s2Freq[c - 'a'] += 1;
            if (Arrays.equals(s1Freq, s2Freq)){
                return true;
            }
        }
        return false;
    }
}