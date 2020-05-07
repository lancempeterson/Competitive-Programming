/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isValidBST(TreeNode root) {
        return DFS(root, null, null);
    }
    public boolean DFS(TreeNode node, Integer hi, Integer lo){
        if (node == null){
            return true;
        }
        if (hi != null && node.val >= hi){
            return false;
        }
        if (lo != null && node.val <= lo){
            return false;
        }
        boolean leftValid = DFS(node.left, node.val, lo);
        boolean rightValid = DFS(node.right, hi, node.val);
        return leftValid && rightValid;
    }
}