/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        if (head.next == null){
            return head;
        }
        if (head.next.next == null){
            return head.next;
        }
        int length = 0;
        ListNode p = head;
        while (p != null){
            length++;
            p = p.next;
        }
        length /= 2;
        while (length > 0){
            head = head.next;
            length--;
        }
        return head;
    }
}