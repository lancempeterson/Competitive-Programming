func solution(a: [Int]) -> [Int] {
    var ans: [Int] = []
    var freqArr: [Int] = Array(repeating: 0, count: 10)
    for num in a {
        let digs = getDigits(number: num)
        for dig in digs {
            freqArr[dig] += 1
        }
    }
    var maxFreq: Int = 0
    for freq in freqArr {
        maxFreq = max(maxFreq, freq)
    }
    for (i, freq) in freqArr.enumerated() {
        if freq == maxFreq {
            ans.append(i)
        }
    }
    return ans
}

func getDigits(number: Int) -> [Int] {
    let numString = String(number)
    var digits: [Int] = []
    for character in numString {
        if let digit = Int(String(character)) {
            digits.append(digit)
        }
    }
    return digits
}