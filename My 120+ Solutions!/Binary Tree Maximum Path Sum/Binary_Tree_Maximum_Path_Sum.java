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
    public int max = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        DFS(root);
        return max;
    }
    public int DFS(TreeNode node){
        if (node == null){
            return 0;
        }
        int nodeMax = node.val;
        int left = DFS(node.left);
        int right = DFS(node.right);
        nodeMax = Math.max(nodeMax,node.val + left);
        nodeMax = Math.max(nodeMax,node.val + right);
        nodeMax = Math.max(nodeMax,node.val + left + right);
        max = Math.max(max,nodeMax);
        int valSendUp = node.val;
        valSendUp = Math.max(valSendUp,node.val + left);
        valSendUp = Math.max(valSendUp,node.val + right);
        return valSendUp;
    }
}