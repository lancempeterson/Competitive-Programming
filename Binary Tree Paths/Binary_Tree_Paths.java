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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        if ( root == null ){
            return list;
        }
        String s = "";
        s += Integer.toString(root.val);
        if ( root.left == null && root.right == null ){
            list.add(s);
        }
        if ( root.left != null ){
                DFS(root.left, s, list);
            }
        if (root.right != null){
            DFS(root.right, s, list);
        }
        return list;
    }
    
    public void DFS(TreeNode root, String s, List<String> list){
        s += "->";
        if ( root.left == null && root.right == null ){
            s += Integer.toString(root.val);
            list.add(s);
            return;
        }
        else {
            s += Integer.toString(root.val);
            if ( root.left != null ){
                DFS(root.left, s, list);
            }
            if (root.right != null){
                DFS(root.right, s, list);
            }
            return;
        }
    }
}