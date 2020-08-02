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
    public int numPaths = 0;
    public int pathSum(TreeNode root, int sum) {
        List<Integer> list = new ArrayList<>();
        generatePaths(root, list, sum);
        return numPaths;
    }
    public void generatePaths(TreeNode node, List<Integer> list, int sum){
        if (node == null){
            return;
        }
        for (int i = 0; i < list.size(); i++){
            list.set(i, list.get(i) + node.val);
            if (list.get(i) == sum){
                numPaths++;
            }
        }
        list.add(node.val);
        if (node.val == sum){
            numPaths++;
        }
        List<Integer> nodeList = new ArrayList<>();
        nodeList.addAll(list);
        generatePaths(node.left, nodeList, sum);
        nodeList.clear();
        nodeList.addAll(list);
        generatePaths(node.right, nodeList, sum);
        return;
    }
}