class Solution {
    func characterReplacement(_ s: String, _ k: Int) -> Int {
        var a = 0
        var b = 1
        var maxLen = 0
        var freqDict: [Character:Int] = [:]
        var arr: [Character] = Array(s)
        freqDict[arr[a]] = (freqDict[arr[a], default: 0] + 1)
        freqDict[arr[b]] = (freqDict[arr[b], default: 0] + 1)
        while b < arr.count {
            var length = b - a + 1
            if length - freqDict.values.max()! <= k {
                maxLen = max(maxLen, length)
                b += 1
                if b < arr.count {
                    freqDict[arr[b]] = (freqDict[arr[b], default: 0] + 1)
                }
            } else {
                freqDict[arr[a]] = (freqDict[arr[a]]! - 1)
                a += 1
            }
        }
        return maxLen
    }
}