class Solution {
    var dict: [Int: [Character]] = [:]
    func letterCombinations(_ digits: String) -> [String] {
        if digits.isEmpty {
            return []
        }
        dict[2] = ["a","b","c"]
        dict[3] = ["d","e","f"]
        dict[4] = ["g","h","i"]
        dict[5] = ["j","k","l"]
        dict[6] = ["m","n","o"]
        dict[7] = ["p","q","r","s"]
        dict[8] = ["t","u","v"]
        dict[9] = ["w", "x", "y", "z"]
        var ans: [String] = []
        var digArr = Array(digits)
        generate("", 0, digArr, &ans)
        return ans
    }
    
    func generate(_ str: String, _ i: Int, _ digArr: [Character], _ ans: inout [String]) {
        if i >= digArr.count {
            ans.append(str)
            return
        }
        var dig: Int = digArr[i].wholeNumberValue!
        var possibleChars: [Character] = dict[dig]!
        for char in possibleChars {
            var temp: String = str + String(char)
            generate(temp, i + 1, digArr, &ans)
        }
    }
}