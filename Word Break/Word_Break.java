class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        HashMap<String, Boolean> map = new HashMap<>();
        return wb(s, wordDict, map);
    }
    public boolean wb(String s, List<String> wordDict, HashMap<String, Boolean> map){
        if ( s.equals("") ){
            return true;
        }
        else {
          for ( int i = 0; i < s.length(); i++ ){
                String s1 = "";
                for ( int j = 0; j <= i; j++ ){
                    s1 += s.charAt(j);
                }
                String s2 = s.substring(s1.length());
                Boolean containsS1 = wordDict.contains(s1);
                if ( containsS1 ){
					boolean subProb;
					if ( map.containsKey(s2) ) {
						subProb = map.get(s2);
					}
					else {
						subProb = wb(s2,wordDict,map);
						map.put(s2, subProb);
					}
					if ( subProb == true ) {
						return true;
					}
                }
            }
            return false;
        }
    }
}
