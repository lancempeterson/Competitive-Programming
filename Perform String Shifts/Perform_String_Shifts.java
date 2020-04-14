class Solution {
    public String stringShift(String s, int[][] shift) {
        char [] ar = s.toCharArray();
        for (int[] sh : shift){
            char [] newAr = new char [ar.length];
            if (sh[0] == 0){
                for(int i = 0; i < ar.length; i++){
                    int num = i - sh[1];
                    while (num < 0){
                        num += ar.length;
                    }
                    newAr[num] = ar[i];
                }
            } else {
                for(int i = 0; i < ar.length; i++){
                    int num = i + sh[1];
                    while (num >= ar.length){
                        num -= ar.length;
                    }
                    newAr[num] = ar[i];
                }
            }
            ar = newAr;
        }
        return String.copyValueOf(ar);
    }
}