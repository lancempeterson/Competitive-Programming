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
    public List<Integer> preorderTraversal(TreeNode root) {
        //Iterative Solution
        List<Integer> list = new ArrayList<>();
        if ( root == null ){
            return list;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;
        stack.push(current);
        while ( !stack.isEmpty() ){
            current = stack.pop();
            list.add(current.val);
            if ( current.right != null ){
                stack.push(current.right);
            }
            if ( current.left != null ){
                stack.push(current.left);
            }
        }
        return list;
        
        // List<Integer> list = new ArrayList<>();
        // list = preOrderList(root, list);
        // return list;
    }
    
    //Recursive Solution
    // public List<Integer> preOrderList(TreeNode root, List<Integer> list){
    //     if ( root == null ){
    //         return list;
    //     }
    //     else {
    //         list.add(root.val);
    //         list = preOrderList(root.left, list);
    //         list = preOrderList(root.right, list);
    //         return list;
    //     }
    // }
}