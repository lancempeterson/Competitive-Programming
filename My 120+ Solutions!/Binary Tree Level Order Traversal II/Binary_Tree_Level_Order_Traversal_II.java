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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if ( root == null ){
            return list;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while ( !q.isEmpty() ){
            int levelNodesCount = q.size();
            List<Integer> l = new ArrayList<>();
            while ( levelNodesCount > 0 ){
                TreeNode node = q.remove();
                if ( node.left != null ){
                    q.add(node.left);
                }
                if ( node.right != null ){
                    q.add(node.right);
                }
                l.add(node.val);
                levelNodesCount--;
            }
            list.add(0,l);         
        }
        return list;
    }
}