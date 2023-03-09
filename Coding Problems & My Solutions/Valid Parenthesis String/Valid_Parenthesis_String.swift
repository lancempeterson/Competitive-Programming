class Solution {
    func checkValidString(_ s: String) -> Bool {
        var lrStack: [Int] = [] // Hold indices
        var starStack: [Int] = []
        let arr = Array(s)
        for (i, char) in arr.enumerated() {
            switch char {
            case "(":
                lrStack.append(i)
            case "*":
                starStack.append(i)
            default:
                if !lrStack.isEmpty {
                    lrStack.popLast()
                } else {
                    if starStack.isEmpty {
                        return false
                    } else {
                        starStack.popLast()
                    }
                }
            }
        }
        while !lrStack.isEmpty && !starStack.isEmpty {
            if lrStack.last! < starStack.last! {
                lrStack.popLast()
                starStack.popLast()
            } else {
                break
            }
        }
        return lrStack.isEmpty
    }
}

class Solution {
    func checkValidString(_ s: String) -> Bool {
        var leftParaStack: [Int] = []
        var starStack: [Int] = []
        for (i, char) in Array(s).enumerated() {
            if char == ")" {
                if leftParaStack.isEmpty && starStack.isEmpty {
                    return false
                }
                if leftParaStack.isEmpty == false {
                    leftParaStack.popLast()
                } 
                else {
                    starStack.popLast()
                }
            }
            else if char == "(" {
                leftParaStack.append(i)
            }
            else {
                starStack.append(i)
            }
        }
        while !leftParaStack.isEmpty && !starStack.isEmpty {
            if leftParaStack.last! < starStack.last! {
                leftParaStack.popLast()
                starStack.popLast()
            } else {
                break
            }
        }
        return leftParaStack.isEmpty
    }
}