/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        List<Integer> list = new ArrayList<Integer>();
		while ( l1 != null || l2 != null ) {
            if ( l1 != null) {
		        list.add(l1.val);
			    l1 = l1.next;
			}
			if ( l2 != null) {
				list.add(l2.val);
				l2 = l2.next;
			}
		}
        Collections.sort(list);
		ListNode root = null;		
		for (int i = 0; i < list.size(); i++) {
			ListNode temp = new ListNode(list.get(i));
			ListNode ptr = null;
			if (root == null) {
				root = temp;
			}
			else {
				ptr = root;
				while ( ptr.next != null ) {
					ptr = ptr.next;
				}
				ptr.next = temp;
			}
		}
        return root;
    }
}