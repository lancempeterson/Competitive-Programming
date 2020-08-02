class Solution {
    
    private char [] array2 = {'a','b','c'};
    private char [] array3 = {'d','e','f'};
    private char [] array4 = {'g','h','i'};
    private char [] array5 = {'j','k','l'};
    private char [] array6 = {'m','n','o'};
    private char [] array7 = {'p','q','r','s'};
    private char [] array8 = {'t','u','v'};
    private char [] array9 = {'w','x','y','z'};
    
    public List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();
        String s = "";
        if ( digits.equals("") ){
            return list;
        }
        buildStrings(list, digits, 0, s);
        return list;
    }
    public void buildStrings(List<String> list, String digits, int digitsIndex, String s){
        if ( s.length() == digits.length() ){
            list.add(s);
            return;
        }
        else{
            String levelString = s;
            int index = digitsIndex;
            char [] array = getArrayBasedOnDigit(digits.charAt(digitsIndex));
            for (int i = 0; i < array.length; i++){
                s = s+ array[i];
                digitsIndex++;
                buildStrings(list, digits, digitsIndex, s);
                //reset choices
                digitsIndex = index;
                s = levelString;
            }
        }
    }
    private char [] getArrayBasedOnDigit(char digit){
        if ( digit == '2'){
            return array2;
        }else if ( digit == '3' ){
            return array3;
        }else if ( digit == '4' ){
            return array4;
        }else if ( digit == '5' ){
            return array5;
        }else if ( digit == '6' ){
            return array6;
        }else if ( digit == '7' ){
            return array7;
        }else if ( digit == '8' ){
            return array8;
        }else {
            return array9;
        }
    }
}