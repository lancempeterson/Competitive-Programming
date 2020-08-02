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
    public boolean isBalanced(TreeNode root) {
        return DFS(root) >= 0;
    }
    public int DFS(TreeNode node){
        if (node == null){
            return 0;
        }
        int left = 0;
        int right = 0;
        if (node.left != null){
            left = DFS(node.left);
        }
        if (node.right != null){
            right = DFS(node.right);
        }
        if (Math.abs(left-right) > 1){
            return -999;
        }
        return 1 + Math.max(left, right);
    }
}