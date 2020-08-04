class Solution {
    public boolean isPowerOfFour(int num) {
        if (num <= 0){
            return false;
        }
        int temp = num;
        int numShifts = 0;
        while (temp > 1){
            temp = temp >> 2;
            numShifts++;
        }
        while (numShifts > 0){
            temp = temp << 2;
            numShifts--;
        }
        if (temp == num){
            return true;
        }
        return false;
    }
}