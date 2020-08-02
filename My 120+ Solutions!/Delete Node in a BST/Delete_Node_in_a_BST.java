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
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null){
            return root;
        }
        else if (root.val < key){
            root.right = deleteNode(root.right, key);
        }
        else if (root.val > key){
            root.left = deleteNode(root.left, key);
        }
        else {//this is the node we want to delete
            //case 1, leaf node
            if (root.left == null && root.right == null){
                return null;
            }
            //case 2, node has 1 child
            else if (root.left == null){
                return root.right;
            }
            else if (root.right == null){
                return root.left;
            }
            //case 3
            else {
                TreeNode temp = root.right;
                while (temp.left != null){
                    temp = temp.left;
                }
                root.val = temp.val;
                root.right = deleteNode(root.right, root.val);
            }
        }
        return root;
    }
}