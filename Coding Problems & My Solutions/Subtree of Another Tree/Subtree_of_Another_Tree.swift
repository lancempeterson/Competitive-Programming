class Solution {
    func isSubtree(_ root: TreeNode?, _ subRoot: TreeNode?) -> Bool {
        var rootStr: String = ""
        rootStr = DFS(root, &rootStr)
        var subStr: String = ""
        subStr = DFS(subRoot, &subStr)
        return rootStr.contains(subStr)
    }
    
    func DFS(_ root: TreeNode?, _ str: inout String) -> String {
        guard var root = root else {
            str = str + "N,"
            return str
        }
        str = DFS(root.left, &str)
        str = DFS(root.right, &str)
        str = str + String(root.val) + ","
        return str
    }
}