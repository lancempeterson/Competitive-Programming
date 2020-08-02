import java.util.*;
class Solution {
    public int tribonacci(int n) { 
        int [] array = new int [n];
        return tribonacciDynamic(n, array); 
    }
    public int tribonacciDynamic( int n, int [] arr){
        if ( n == 0 ){
            return 0;
        }
        if ( n == 1 || n == 2 ){
            return 1;
        }
        else if (arr[n-1] != 0) {
            return arr[n-1];
        }
        else {
            arr[n-1] = tribonacciDynamic(n-1, arr) + tribonacciDynamic(n-2, arr) + tribonacciDynamic(n-3, arr);
            return arr[n-1];
        }
    }
}
//Dynamic Programming Pattern