class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0){
            return "";
        }
        if (strs.length == 1){
            return strs[0];
        }
        StringBuilder sb = new StringBuilder();
        ArrayList<char[]> list = new ArrayList<>();
        int minStringLength = Integer.MAX_VALUE;
        for (String s : strs){
            minStringLength = Math.min(minStringLength, s.length());
            list.add(s.toCharArray());
        }
        for (int i = 0; i < minStringLength; i++){
            char c = list.get(0)[i];
            boolean allContainChar = true;
            for (char[] ar : list){
                if (ar[i] != c){
                    allContainChar = false;
                    break;
                }
            }
            if (allContainChar){
                sb.append(c);
            } else {
                break;
            }
        }
        return sb.toString();
    }
}