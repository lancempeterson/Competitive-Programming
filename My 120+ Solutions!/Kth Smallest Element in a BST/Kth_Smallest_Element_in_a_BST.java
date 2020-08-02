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
    public int kthSmallest(TreeNode root, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());
        DFS(root, k, maxHeap);
        return maxHeap.peek();
    }
    public void DFS(TreeNode node, int k, PriorityQueue<Integer> maxHeap){
        if (node == null){
            return;
        }
        if (node.left != null){
            DFS(node.left, k, maxHeap);
        }
        maxHeap.add(node.val);
        if (maxHeap.size() > k){
            maxHeap.remove();
        }
        if (node.right != null){
            DFS(node.right, k, maxHeap);
        }
    }
}