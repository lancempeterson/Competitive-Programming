class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] ar = str.split(" ");
        char[] chars = pattern.toCharArray();
        if (ar.length != chars.length){
            return false;
        }
        HashMap<Character, String> map = new HashMap<>();
        for (int i = 0; i < chars.length; i++){
            if (!map.containsKey(chars[i])){
                if (map.containsValue(ar[i])){
                    return false;
                }
                map.put(chars[i], ar[i]);
            } else {
                if (!map.get(chars[i]).equals(ar[i])){
                    return false;
                }
            }
        }
        return true;
    }
}