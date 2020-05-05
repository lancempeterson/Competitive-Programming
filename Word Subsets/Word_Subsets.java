class Solution {
    public List<String> wordSubsets(String[] A, String[] B) {
        int[] totalBFrequency = new int [26];
        for (String b : B){
            int[] subAr = getAlphabetFrequency(b);
            for (int i = 0; i < totalBFrequency.length; i++){
                totalBFrequency[i] = Math.max(totalBFrequency[i], subAr[i]);
            }
        }
        List<String> ans = new ArrayList<>();
        for (String a : A){
            boolean canAdd = true;
            int[] ar = getAlphabetFrequency(a);
            for (int i = 0; i < totalBFrequency.length; i++){
                if (totalBFrequency[i] > ar[i]){
                    canAdd = false;
                    break;
                }
            }
            if (canAdd){
                ans.add(a);
            }
        }
        return ans;
    }
    public int[] getAlphabetFrequency(String s){
        int[] ar = new int [26];
        for (char c : s.toCharArray()){
            ar[c - 'a'] += 1;
        }
        return ar;
    }
}