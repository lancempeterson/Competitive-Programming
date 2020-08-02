class Solution {
    public List<String> letterCasePermutation(String S) {
        List<String> ans = new ArrayList<>();
        generatePermutations(ans,S,0);
        return ans;
    }
    
    public void generatePermutations(List<String> list, String s, int index){
		//goal
		if ( index == s.length() ) {
			list.add(s);
			return;
		}
		// explore all the choices
		Character c = s.charAt(index);
		//constraints
		if ( Character.isLetter(c) ) {
			//make a choice
			c = Character.toLowerCase(c);
			s = s.substring(0, index) + c + s.substring(index + 1); 
			//explore
			generatePermutations(list, s, index+1);
			//undo choice
			c = Character.toUpperCase(c);
			s = s.substring(0, index) + c + s.substring(index + 1); 
			//explore
			generatePermutations(list, s, index+1);
		}
		else {
			//skip the character
			generatePermutations(list, s, index+1);
		}	
	}
    
}