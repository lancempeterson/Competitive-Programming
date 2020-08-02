/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = null;
        int sum = l1.val + l2.val;
        int carry = 0;
        if (sum > 9){
            ans = new ListNode(sum-10);
            carry = 1;
        } else {
            ans = new ListNode(sum);
            carry = 0;
        }
        ListNode p1 = l1.next;
        ListNode p2 = l2.next;
        ListNode p3 = ans;
        while (p1 != null || p2 != null){
            sum = carry;
            if (p1 != null){
                sum += p1.val;
                p1 = p1.next;
            }
            if (p2 != null){
                sum += p2.val;
                p2 = p2.next;
            }
            if (sum > 9){
                p3.next = new ListNode(sum-10);
                carry = 1;
            } else {
                p3.next = new ListNode(sum);
                carry = 0;
            }
            p3 = p3.next;
        }
        if (carry > 0){
            p3.next = new ListNode(carry);
        }
        return ans;
    }
}