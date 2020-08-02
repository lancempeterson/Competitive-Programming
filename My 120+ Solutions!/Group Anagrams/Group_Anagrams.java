class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0){
            return new ArrayList();
        }
        HashMap<String, List<String>> hashmap = new HashMap<>();
        for (String s : strs){
            char [] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String key = new String(charArray);
            if (hashmap.containsKey(key)){
                hashmap.get(key).add(s);
            }
            else {
                List<String> l = new ArrayList<>();
                l.add(s);
                hashmap.put(key, l);
            }
        }
        return new ArrayList(hashmap.values());
    }
}