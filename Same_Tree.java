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