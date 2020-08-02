/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p1 = headA;
        ListNode p2 = headB;
        HashSet<ListNode> map = new HashSet<>();
        while ( p1 != null ){
            map.add(p1);
            p1 = p1.next;
        }
        while ( p2 != null ){
            if ( map.contains(p2) ){
                return p2;
            }
            p2 = p2.next;
        }
        return null;
    }
}