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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        if (root != null){
            buildPaths(ans, root, new StringBuilder());
        }
        return ans;
    }
    public void buildPaths(List<String> list, TreeNode node, StringBuilder sb){
        if (node.left == null && node.right == null){
            list.add(sb.toString() + node.val);
        }
        sb.append(node.val);
        sb.append("->");
        if (node.left != null){
            buildPaths(list, node.left, new StringBuilder(sb));
        }
        if (node.right != null){
            buildPaths(list, node.right, new StringBuilder(sb));
        }
    }
}