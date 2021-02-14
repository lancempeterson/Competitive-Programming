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
    public boolean isSubtree(TreeNode s, TreeNode t) {
        StringBuilder sString = new StringBuilder();
        sString = createString(s, sString);
        StringBuilder tString = new StringBuilder();
        tString = createString(t, tString);
        if (sString.toString().contains(tString.toString())){
            return true;
        } else {
            return false;
        }
    }
    public StringBuilder createString(TreeNode node, StringBuilder s) {
        if (node == null){
            //add a 'N' to the string
            s.append('N');
            s.append(',');
            return s;
        }
        s.append('#');//prevent case of "22" being substring of "322"
        s.append(node.val);
        s.append(',');
        s = createString(node.left, s);
        s = createString(node.right, s);
        return s;
    }
}