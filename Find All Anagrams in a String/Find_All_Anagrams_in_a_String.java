class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        int[] pFreq = new int [26];
        for (int i = 0; i < p.length(); i++){
            pFreq[p.charAt(i) - 'a'] += 1;
        }
        int N = p.length();
        char[] ar = s.toCharArray();
        for (int i = 0; i <= s.length() - N; i++){
            String cur = s.substring(i, i+N);
            if (isAnagram(cur, pFreq)){
                ans.add(i);
            }
        }
        return ans;
    }
    public boolean isAnagram(String cur, int[] pFreq){
        int[] curFreq = new int [26];
        for (int i = 0; i < cur.length(); i++){
            curFreq[cur.charAt(i) - 'a'] += 1;
        }
        for (int i = 0; i < pFreq.length; i++){
            if (pFreq[i] != curFreq[i]){
                return false;
            }
        }
        return true;
    }
}