/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        findDiameter(root);
        return max;
    }
    public int findDiameter(TreeNode root){
        if ( root == null ){
            return 0;    
        }
        int left = 0;
        int right = 0;
        if ( root.left != null ){
            left = findDiameter(root.left) + 1;
        }
        if ( root.right != null ){
            right = findDiameter(root.right) + 1;
        }
        max = Math.max(max, left+right);
        return Math.max(left,right);
    }
}