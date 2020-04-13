class Solution {
    public boolean isValid(String s) {
        if ( s.equals("")) {
			return true;
		}
        Stack<Character> stack = new Stack<>();
        for ( int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if ( c == '(' || c == '{' || c == '[' ) {
				stack.push(c);
			}
			else if ( c == ')') {
				if ( !stack.isEmpty() ) {
					char d = stack.pop();
					if ( d != '(' ) {
						return false;
					}
				}
                else {
                    return false;
                }
			}
			else if ( c == '}') {
				if ( !stack.isEmpty() ) {
					char d = stack.pop();
					if ( d != '{' ) {
						return false;
					}
				}
                else {
                    return false;
                }
			}
			else if ( c == ']') {
				if ( !stack.isEmpty() ) {
					char d = stack.pop();
					if ( d != '[' ) {
						return false;
					}
				}
                else {
                    return false;
                }
			}
		}
        if (!stack.isEmpty()){
            return false;
        }
        return true;
    }
}