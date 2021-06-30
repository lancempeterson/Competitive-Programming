class Solution {
    func groupAnagrams(_ strs: [String]) -> [[String]] {
        var ans: [[String]] = []
        var dict: [String:[String]] = [:]
        for str in strs {
            let key: String = String(str.sorted())
            var values: [String] = dict[key] ?? []
            values.append(str)
            dict[key] = values
        }
        for pair in dict {
            let group: [String] = pair.value
            ans.append(group)
        }
        return ans
    }
}