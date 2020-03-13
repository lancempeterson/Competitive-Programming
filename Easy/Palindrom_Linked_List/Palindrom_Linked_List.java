import java.util.*;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        
        List<Integer> list = new ArrayList<Integer>();
        List<Integer> rlist = new ArrayList<Integer>();
        
        while (head != null){
            list.add(head.val);
            head = head.next;
        }
        
        for ( int i = (list.size()-1); i >= 0; i--){
            rlist.add(list.get(i));
        }
        
        for ( int i = 0; i < list.size(); i++ ) {
        	int a = list.get(i);
        	int b = rlist.get(i);
        	if (a != b) {
        		return false;
        	}
        }
        return true;
        
//         ListNode current = head;
//         ListNode next = null;
//         ListNode prev = null;
//         while ( current != null ){
//             next = current.next;
//             current.next = prev;
//             prev = current;
//             current = next;
//         }
//         boolean hasDifference = false;
//         ListNode rhead = prev;
        
//         while ( head != null ){
//             if ( head.val != rhead.val ){
//                 return false;
//             }
//             head  = head.next;
//             rhead = rhead.next;
//         }
//         return true;
        
    }
}