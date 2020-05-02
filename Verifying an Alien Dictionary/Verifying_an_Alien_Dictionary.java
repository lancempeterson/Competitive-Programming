class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        if (words.length < 2){
            return true;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < order.length(); i++){
            map.put(order.charAt(i), i);
        }
        int a = 0;
        int b = 1;
        while (b < words.length){
            if (!comparedWordsValid(words[a], words[b], map)){
                return false;
            }
            a++;
            b++;
        }
        return true;
    }
    public boolean comparedWordsValid(String word1, String word2, HashMap<Character, Integer> map){
        for (int i = 0; i < word1.length() && i < word2.length(); i++){
            if (map.get(word1.charAt(i)) < map.get(word2.charAt(i))){
                return true;
            }
            else if (map.get(word1.charAt(i)) > map.get(word2.charAt(i))){
                return false;
            }
        }
        return word1.length() < word2.length();
    }
}