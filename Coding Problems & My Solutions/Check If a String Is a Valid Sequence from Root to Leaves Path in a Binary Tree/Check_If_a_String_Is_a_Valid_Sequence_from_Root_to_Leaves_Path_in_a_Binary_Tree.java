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
    public boolean isValidSequence(TreeNode root, int[] ar) {
        return DFS(root, ar, 0);
    }
    public boolean DFS(TreeNode node, int[] ar, int index){
        if (index >= ar.length || node == null){
            return false;
        }
        if (node.left == null && node.right == null){
            return index == ar.length - 1 && node.val == ar[index];
        }
        boolean currentNodeValid = node.val == ar[index];
        boolean leftPathValid = DFS(node.left, ar, index + 1);
        boolean rightPathValid = DFS(node.right, ar, index + 1);
        return currentNodeValid && (leftPathValid || rightPathValid);
    }
}