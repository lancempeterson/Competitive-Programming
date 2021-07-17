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