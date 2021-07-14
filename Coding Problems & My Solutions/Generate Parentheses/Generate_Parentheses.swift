class Solution {
    func generateParenthesis(_ n: Int) -> [String] {
        var ans = generate(n, n, "", [])
        return ans
    }
    
    func generate(_ numLefts: Int, _ numRights: Int, _ s: String, _ ans: [String]) -> [String] {
        var ans = ans
        if numRights == 0 {
            ans.append(s)
            return ans
        }
        // make a choice
        // choose "(" if we can
        if numLefts > 0 {
            ans = generate(numLefts - 1, numRights, "\(s)(", ans)
        }
        // choose ")" if we can
        if numLefts < numRights {
            ans = generate(numLefts, numRights -  1, "\(s))", ans)
        }
        return ans
    }
}