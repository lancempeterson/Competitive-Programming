class Solution {
    func compress(_ chars: inout [Character]) -> Int {
        var temp = [Character]()
        var index = 0
        if chars.count < 2 {
            return 1
        }
        var i = 0
        var j = 1
        while j <= chars.count && i < chars.count {
            if j != chars.count && chars[i] == chars[j] {
                j += 1
                continue
            }
            temp.append(chars[i])
            index += 1
            var numDiff = j - i
            if numDiff > 1 {
                if numDiff < 10 {
                    temp.append(Character("\(numDiff)"))
                } else {
                    var onesPlace = numDiff % 10
                    var tensPlace = numDiff / 10
                    temp.append(Character("\(tensPlace)"))
                    index += 1
                    temp.append(Character("\(onesPlace)"))
                }
                index += 1
                i = j
                j = i + 1
            } else {
                i += 1
            }
        }
        chars = temp
        return index
    }
}