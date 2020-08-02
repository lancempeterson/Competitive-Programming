/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public boolean isUnivalTree(TreeNode root) {
        if (root.left == null && root.right == null){
            return true;
        }
        boolean leftUnival = true;
        boolean rightUnival = true;
        if (root.left != null){
            if (root.val != root.left.val){
                return false;
            }
            leftUnival = isUnivalTree(root.left);
        }
        if (root.right != null){
            if (root.val != root.right.val){
                return false;
            }
            rightUnival = isUnivalTree(root.right);
        }
        return leftUnival && rightUnival;
    }