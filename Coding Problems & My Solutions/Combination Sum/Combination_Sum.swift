class Solution {
    func combinationSum(_ candidates: [Int], _ target: Int) -> [[Int]] {
        var ansArr: [[Int]] = []
        generate(candidates, target, [], &ansArr)
        return ansArr
    }
    
    func generate(_ candidates: [Int], _ remainingTarget: Int, _ candidateArr: [Int], _ ansArr: inout [[Int]]) {
        if remainingTarget == 0 {
            let candidate = candidateArr.sorted()
            if !ansArr.contains(candidate) {
                ansArr.append(candidate)
            }
            return
        }
        else if remainingTarget < 0 {
            return
        }
        for num in candidates {
            var tempArr = candidateArr
            tempArr.append(num)
            generate(candidates, remainingTarget - num, tempArr, &ansArr)
        }
    }
}