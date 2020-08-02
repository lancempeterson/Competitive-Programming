class Solution {
    public boolean detectCapitalUse(String word) {
        if (word == null || word.length() == 0){
            return true;
        }
        int numCaps = 0;
        for (char c : word.toCharArray()){
            if (Character.isUpperCase(c)){
                numCaps++;
            }
        }
        if (numCaps == 0 || numCaps == word.length() ||
            (numCaps == 1 && Character.isUpperCase(word.charAt(0)))){
            return true;
        }
        return false;
    }
}