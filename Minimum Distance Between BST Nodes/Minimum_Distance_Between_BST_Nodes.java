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
    public int minDiffInBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
		list = inOrder(root, list);
		int ans = 99;
		for ( int i = 0; i < list.size() - 1; i++) {
			int val1 = list.get(i);
			int val2 = list.get(i+1);
			int diff = val2 - val1;
			ans = Math.min(ans, diff);
		}
        return ans;
    }
    
   public static List<Integer> inOrder(TreeNode root, List<Integer>  list) {
       if ( root == null ) {
           return list;
	    }
	    else {
		    list = inOrder(root.left, list);
		    list.add(root.val);
		    list = inOrder(root.right, list);
		    return list;
	    }
    }
    
}