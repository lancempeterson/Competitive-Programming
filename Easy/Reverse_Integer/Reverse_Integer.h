/**
Given a 32-bit signed integer, reverse digits of an integer.
Example 1:
Input: 123
Output: 321
Example 2:
Input: -123
Output: -321
Example 3:
Input: 120
Output: 21
Note:
Assume we are dealing with an environment which could only store 
integers within the 32-bit signed integer range: [−2^31,  2^31 − 1]. 
For the purpose of this problem, assume that your function returns 0 
when the reversed integer overflows.
**/
#include <cstdlib>

class Solution {
public:
    int reverse(int x) {
        
		int neg_limit = -2147483648;
		int pos_limit = 2147483647;
        if ( x >= pos_limit || x <= neg_limit )
			return 0;
        
        bool isNeg = false;
		if ( x < 0 )
			isNeg = true;
		else
			isNeg = false;
		
		string string_x = to_string(abs(x));
		int n = string_x.length(); 
		for (int i = 0; i < n / 2; i++) 
			swap(string_x[i], string_x[n - i - 1]); 
		
        int reversedInt;
		try {
			reversedInt = stoi(string_x);
		}
		catch(std::out_of_range& e){
			return 0;
		}

		if ( isNeg ){
			reversedInt = 0-reversedInt;
		}
		
		if ( reversedInt > pos_limit || reversedInt < neg_limit )
			return 0;
		else 
			return reversedInt;
    }
};