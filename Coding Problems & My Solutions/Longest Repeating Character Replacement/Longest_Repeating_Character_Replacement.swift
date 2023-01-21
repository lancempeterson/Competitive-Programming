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

class Solution {
    func characterReplacement(_ s: String, _ k: Int) -> Int {
        var dict: [Character:Int] = [:]
        let arr = Array(s)
        var ans = 0
        var a = 0
        var b = 0
        while b <= arr.count {
            if getTotalFrequenciesUsedInDict(dict) - getMostUsedCharacterFreq(dict) <= k {
                let currLen = b - a
                ans = max(ans, currLen)
                if b >= arr.count {
                    break
                }
                dict[arr[b]] = (dict[arr[b]] ?? 0) + 1
                b += 1
            } else {
                dict[arr[a]] = dict[arr[a]]! - 1
                a += 1
            }
        }
        return ans
    }

    func getTotalFrequenciesUsedInDict(_ dict: [Character:Int]) -> Int {
        return dict.values.reduce(0, +)
    }

    func getMostUsedCharacterFreq(_ dict: [Character:Int]) -> Int {
        var maxVal = 0
        for (key, value) in dict {
            maxVal = max(maxVal, value)
        }
        return maxVal
    }

    // k = 2
    //  A 2
    //  B 2
    //  C 1
    // Not allowed (2 + 2 + 1) - (2) = 3

    // k = 2
    // A 1
    // B 3
    // C 1
    // Allowed (1 + 3 + 1) - (3) = 2
}