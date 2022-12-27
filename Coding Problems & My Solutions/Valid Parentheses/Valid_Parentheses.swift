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

class Solution {
    func isValid(_ s: String) -> Bool {
        var stack: [Character] = []
        let arr = Array(s)
        for char in arr {
            if char == "(" || char == "[" || char == "{" {
                stack.append(char)
            }
            else if char == ")" {
                let poppedChar = stack.popLast()
                if poppedChar != "(" {
                    return false
                }
            }
            else if char == "]" {
                let poppedChar = stack.popLast()
                if poppedChar != "[" {
                    return false
                }
            }
            else if char == "}" {
                let poppedChar = stack.popLast()
                if poppedChar != "{" {
                    return false
                }
            }
        }
        return stack.isEmpty 
    }
}