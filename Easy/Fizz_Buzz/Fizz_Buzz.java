import java.util.*;

class Solution {
	
	//Time complexity O(N)
    public List<String> fizzBuzz(int n) {
		
		//Initialize a list. We need java.util package to use List.
        List<String> arrayList = new ArrayList<String>();//List is an interface which means it cannot be instantiated (no new List() is possible).
        for ( int i = 1; i <= n; i++ ){
			// if (i % 3 == 0 && i % 5 == 0) {
			// 	arrayList.add("FizzBuzz");
			// }
			// else if ( i % 3 == 0 ) {
			// 	arrayList.add("Fizz");
			// }
			// else if ( i % 5 == 0) {
			// 	arrayList.add("Buzz");
			// }
			// else {
			// 	arrayList.add(""+i);
			// }  
            String s = "";
            if (i % 3== 0){
                s = s+"Fizz";
            }
            if (i % 5 == 0){
                s = s+"Buzz";
            }
            if (s.equals("")){
                arrayList.add(""+i);
            }
            else {
                arrayList.add(""+s);
            }
        }
        return arrayList;
    }
}