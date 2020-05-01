class Solution {
    public String defangIPaddr(String address) {
        StringBuilder ans = new StringBuilder("");
        for (char c : address.toCharArray()){
            if (c == '.'){
                ans.append('[');
                ans.append(c);
                ans.append(']');
            } else {
                ans.append(c);
            }
        }
        return ans.toString();
    }
}