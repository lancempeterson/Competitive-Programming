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
    
    public boolean isCousins(TreeNode root, int x, int y) {
        int [] xValues = new int[2];
        int [] yValues = new int[2];
        xValues = getLevelOfNodeWithValueX(root, x, xValues);
        yValues = getLevelOfNodeWithValueX(root, y, yValues);
        if ( xValues[0] == yValues[0] &&
           xValues[1] != yValues[1]){
            return true;
        }
        else {
            return false;
        }
    }
    
    public int [] getLevelOfNodeWithValueX(TreeNode root, int x, int [] data){
        if ( root == null ){
            data[0] = -99;
            return data;
        }
        else if ( root.val == x ){
            data[0] = 0;
            return data;
        }
        else {
            int left  = getLevelOfNodeWithValueX(root.left, x, data)[0];
            int right = getLevelOfNodeWithValueX(root.right, x, data)[0];
            if ( left == 0 ){
                data[1] = root.val;
            }
            if ( right == 0 ){
                 data[1] = root.val;
            }
            left  += 1;
            right += 1;
            data[0] = Math.max(left, right);
            return data;
        }
    }
}