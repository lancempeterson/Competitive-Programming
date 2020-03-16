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
    
    private int max = 0;
    
    public int longestUnivaluePath(TreeNode root) {
        getPathLength(root);
        return max;
    }
    
    public int getPathLength(TreeNode root){
        if ( root == null ){
            return 0;
        }
        else {
            int leftLength  = getPathLength(root.left);
            int rightLength = getPathLength(root.right);
            int left  = 0;
            int right = 0;
            if ( root.left != null ){
                if ( root.left.val == root.val ){
                    left = 1 + leftLength;
                }
            }
            if ( root.right != null ){
                if ( root.right.val == root.val ){
                    right = 1 + rightLength;
                }
            }
            max = Math.max(max, left + right);
            return Math.max(left, right);
        }
    }
}