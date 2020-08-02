class Solution {
    public int[] plusOne(int[] digits) {
        if (digits[digits.length -1] < 9){
            digits[digits.length -1] = digits[digits.length -1] + 1;
            return digits;
        }
        boolean allNines = true;
        for ( int i = 0; i < digits.length; i++ ){
            if ( digits[i] != 9 ){
                allNines = false;
            }
        }
        if ( allNines ){
            int [] ans = new int [digits.length + 1];
            ans[0] = 1;
            for ( int i = 1; i < ans.length; i++ ){
                ans[i] = 0;
            }
            return ans;
        }
        else {
            int [] ans = new int [digits.length];
            for ( int i = 0; i < digits.length; i++ ){
                ans[i] = digits[i];
            }
            ans[digits.length -1] = 0;
            for ( int i = digits.length - 2; i >= 0; i-- ){
                if (digits[i] != 9){
                    ans[i] = digits[i] + 1;
                    return ans;
                }
                else {
                    ans[i] = 0;
                }
            }
            return ans;
        }
    }
}