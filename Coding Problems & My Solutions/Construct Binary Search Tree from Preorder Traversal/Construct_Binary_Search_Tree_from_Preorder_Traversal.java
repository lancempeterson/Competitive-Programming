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
    public TreeNode bstFromPreorder(int[] ar) {
        if (ar.length == 0){
            return null;
        }
        if (ar.length == 1){
            return new TreeNode(ar[0]);
        }
        TreeNode node = new TreeNode(ar[0]);
        int splitIndex = 1;
        while (splitIndex < ar.length && ar[splitIndex] < ar[0]){
            splitIndex++;
        }
        int leftSide [] = new int [splitIndex - 1];
        for (int i = 0; i < leftSide.length; i++){
            leftSide[i] = ar[i+1];
        }
        int rightSide [] = new int [ar.length - splitIndex];
        for (int i = 0; i < rightSide.length; i++){
            rightSide[i] = ar[i+splitIndex];
        }
        if (leftSide.length <= 1 && rightSide.length <= 1){
            if (leftSide.length == 1){
                node.left = new TreeNode(leftSide[0]);
            }
            if (rightSide.length == 1){
                node.right = new TreeNode(rightSide[0]);
            }
            return node;
        }
        node.left = bstFromPreorder(leftSide);
        node.right = bstFromPreorder(rightSide);
        return node;
    }
}