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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null){
            return true;
        }
        else if (p == null || q == null || (p.val != q.val)){
            return false;
        }
        return (p.val == q.val) 
            && isSameTree(p.left, q.left) 
            && isSameTree(p.right, q.right);
    }
}

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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        boolean ans = false;
        if ( p == null && q == null ){
            ans = true;
            return true;
        }
        else if ( p != null && q != null ){
            if ( p.val == q.val && 
                isSameTree(p.left,q.left) && 
                isSameTree(p.right,q.right) ){
                ans = true;
                return true;
            }
        }
        else {
            ans = false;
            return false;
        }
        return ans;
    }
}

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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null){
            return true;
        }
        else if (p == null || q == null || (p.val != q.val)){
            return false;
        }
        boolean leftSame = (p.left == null) && (q.left == null);
        boolean rightSame = (p.right == null) && (q.right == null);
        if (p.left != null && q.left != null){
            leftSame = isSameTree(p.left, q.left);
        }
        if (p.right != null && q.right != null){
            rightSame = isSameTree(p.right, q.right);
        }
        return (p.val == q.val) && leftSame && rightSame;
    }
}