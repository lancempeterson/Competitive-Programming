class Trie {
    
    HashSet<String> set;
    ArrayList<char[]> list;

    /** Initialize your data structure here. */
    public Trie() {
        set = new HashSet<>();
        list = new ArrayList<>();
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        set.add(word);
        char[] ar = word.toCharArray();
        list.add(ar);
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        return set.contains(word);
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        char[] pre = prefix.toCharArray();
        int count = 0;
        for (char[] ar : list){
            count = 0;
            for (int i = 0; i < pre.length && i < ar.length; i++){
                if (pre[i] == ar[i]){
                    count++;
                }
                if (count == prefix.length()){
                    return true;
                }
            }
        }
        return false;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */