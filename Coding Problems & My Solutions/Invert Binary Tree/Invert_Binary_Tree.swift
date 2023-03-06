/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     public var val: Int
 *     public var left: TreeNode?
 *     public var right: TreeNode?
 *     public init() { self.val = 0; self.left = nil; self.right = nil; }
 *     public init(_ val: Int) { self.val = val; self.left = nil; self.right = nil; }
 *     public init(_ val: Int, _ left: TreeNode?, _ right: TreeNode?) {
 *         self.val = val
 *         self.left = left
 *         self.right = right
 *     }
 * }
 */
class Solution {
    func invertTree(_ root: TreeNode?) -> TreeNode? {
        var node = root
        invert(node: &node)
        return node
    }

    func invert(node: inout TreeNode?) {
        if node == nil {
            return
        }
        invert(node: &node!.left)
        invert(node: &node!.right)
        let tempNode = node!.left
        node!.left = node!.right
        node!.right = tempNode
    }
}