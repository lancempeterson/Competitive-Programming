class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int i = 0;
        int j = 0;
        HashSet<Character> set = new HashSet<>();
        while (j < s.length() && i < s.length()){
            if (set.contains(s.charAt(j))){
                set.remove(s.charAt(i));
                i++;
            } else {
                set.add(s.charAt(j));
                j++;
                max = Math.max(max, j-i);
            }
        }
        return max;
    }
}