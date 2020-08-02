class Solution {
    public boolean isPerfectSquare(int num) {
        if (num == 0){
            return false;
        }
        int start = 0;
        int end = num;
        while (start <= end){
            int mid = start + ((end - start)/2);
            int squared = mid * mid;
            if (squared > num || mid > 46340){
                end = mid - 1;
            } 
            else if (squared < num){
                start = mid + 1;
            } else {
                return true;
            }
        }
        return false;
    }
}