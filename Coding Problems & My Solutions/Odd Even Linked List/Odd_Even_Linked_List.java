/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null){
            return head;
        }
        ListNode o  = head;
        ListNode e = head.next;
        ListNode e_head = e;
        while (e != null){
            o.next = e.next;
            if (o.next == null){
                break;
            }
            o = o.next;
            e.next = o.next;
            e = o.next;
        }
        o.next = e_head;
        return head;
    }
}