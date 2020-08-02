class Solution {
    public boolean backspaceCompare(String S, String T) {
        Stack<Character> stackS = new Stack<>();
        Stack<Character> stackT = new Stack<>();
        char [] s = S.toCharArray();
        char [] t = T.toCharArray();
        for (char c : s){
            if ( c == '#' && !stackS.isEmpty() ){
                stackS.pop();
            } 
            else if ( c != '#' ) {
                stackS.add(c);
            }
        }
        for (char c : t){
            if ( c == '#' && !stackT.isEmpty() ){
                stackT.pop();
            } 
            else if ( c != '#' ) {
                stackT.add(c);
            }
        }
        return stackS.equals(stackT);
    }
}