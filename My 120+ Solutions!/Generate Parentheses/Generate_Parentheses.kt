class Solution {
    fun generateParenthesis(n: Int): List<String> {
        var list: MutableList<String> = mutableListOf<String>()
        var s = ""
        var lefts = 0
        var rights = 0
        createList(list, n, s, 0, 0)
        return list
    }
    
    fun createList(list: MutableList<String>, n: Int, s: String, lefts: Int, rights: Int): String {
        if ( s.length == n * 2 ){
            list.add(s)
            return s
        }
        if ( lefts < n ){
            createList(list, n, s + "(", lefts+1, rights)
        }
        if ( lefts > rights ){
            createList(list, n, s + ")", lefts, rights+1)
        }
        return s
    }   
}
/**
Backtracking Pattern
At every state we have a decision
3 Keys
1) our choice
    place a ( or a )
    at every decision point we have to make a valid choice
2) our constraints
    We cannot close until we open.
    We cannot place more than N left brackets
    We cannot place more than N right brackets
    We can only place a right bracket if numLeftBrackets < numRightBrackets
3) our goal
    place N*2 characters, then we are done.
*/
