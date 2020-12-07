class Solution {
    public boolean isPalindrome(String s) {
        char[] arr = s.toLowerCase().toCharArray();
        int a = 0;
        int b = arr.length-1;
        while (a < b){
            if (!Character.isLetterOrDigit(arr[a])){
                a++;
                continue;
            }
            if (!Character.isLetterOrDigit(arr[b])){
                b--;
                continue;
            }
            if (arr[a] != arr[b]){
                return false;
            }
            a++;
            b--;
        }
        return true;
    }
}