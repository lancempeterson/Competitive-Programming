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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> l = new ArrayList<>();
        // Recursive Solution
        // l = recursiveInOrderListBuilder(root, l);
        // Iterative Solution
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;
        while (current != null || !stack.isEmpty()){ 
            while ( current != null ){
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            l.add(current.val);
            current = current.right;
        }
        return l;
    }
    
    // public List<Integer> recursiveInOrderListBuilder(TreeNode root, List<Integer> list){
    //     if ( root == null ){
    //         return list;
    //     }
    //     else {
    //         list = recursiveInOrderListBuilder(root.left, list);
    //         list.add(root.val);
    //         list = recursiveInOrderListBuilder(root.right, list);
    //         return list;
    //     }
    // }
}