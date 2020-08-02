/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        if ( node.next == null ){
            return;
        }
        ListNode current = node;
        ListNode next = current.next;
        while (next != null){
            current.val = next.val;
            if ( next.next == null ){
                current.next = null;
                return;
            }
            current = next;
            next = next.next;
        }
        return;
    }
}