class Solution {
    public int mySqrt(int x) {
        
        // double d = (double) x;
        // double root = Math.sqrt(d);
        // return (int) root;
        
        if ( x == 0 ){
            return 0;
        }
        
        int left  = 1;
        int right = x;
        int answ  = 1;
        
        while (left < right){
            
            int mid = left + ((right - left) / 2);
            
            // If x greater, ignore left half 
            if ((x/mid) >= mid) {
             answ = mid;
             left = mid + 1;    
            }
  
            // If x is smaller, ignore right half 
            else{
             right = mid; 
            }    
        }
        return answ;
    }
}