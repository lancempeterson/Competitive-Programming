class Solution {
    func isValid(_ s: String) -> Bool {
        var stack = [Character]()
        for char in Array(s) {
            switch char {
                case "}":
                let last = stack.popLast()
                if last != "{" {
                    return false
                }
                case ")":
                let last = stack.popLast()
                if last != "(" {
                    return false
                }
                case "]":
                let last = stack.popLast()
                if last != "[" {
                    return false
                }
                default:
                stack.append(char)
            }
        }
        return stack.isEmpty
    }
}