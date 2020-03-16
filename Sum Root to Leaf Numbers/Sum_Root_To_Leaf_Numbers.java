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
    
    public int total = 0;
    
    public int sumNumbers(TreeNode root) {
        if ( root == null ){
            return 0;
        }
        String s = ""; 
        helperDFS(root, s);
        return total;
    }
    
    public void helperDFS(TreeNode root, String s){
        if ( root.left == null && root.right == null ){
            s += root.val;
            total += Integer.parseInt(s);
            return;
        }
        else {
            s += root.val;
            if ( root.left != null ){
                helperDFS(root.left, s);
            }
            if ( root.right != null ){
                helperDFS(root.right, s);
            }
            return;   
        }
    }
}