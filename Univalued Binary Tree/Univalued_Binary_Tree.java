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
    public boolean isUnivalTree(TreeNode root) {
        if ( root.left == null && root.right == null ){
            return true;
        }
        else {
            boolean same = false;
            if ( root.left != null){
                if ( root.val == root.left.val && isUnivalTree(root.left)){
                    same = true;
                }
                else {
                    return false;
                }
            }
            if ( root.right != null){
                if ( root.val == root.right.val && isUnivalTree(root.right)){
                    same = true;
                }
                else {
                    return false;
                }
            }
            return same;
        }
    }
}