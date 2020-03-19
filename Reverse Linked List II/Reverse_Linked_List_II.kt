/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun reverseBetween(head: ListNode?, m: Int, n: Int): ListNode? {
        if ( m == n ){
            return head
        }
        var m_val = m
        var n_val = n
        var p1 = head
        while (m_val > 1){
            p1 = p1?.next
            m_val--
        }
        var p0 = head
        while (p0?.next != p1 && p0 != p1 && p0 != null){
            p0 = p0?.next
        }
        var p2 = head
        while (n_val > 1){
            p2 = p2?.next
            n_val--
        }
        var p3 = p2?.next
        var current = p1
        var next = p3
        var prev = p3
        while ( current != p3 ){
            next = current?.next
            current?.next = prev
            prev = current
            current = next
        }
        if ( p0 == p1 ){
            return p2
        }
        else {
            p0?.next = p2    
            return head
        }
    }
}