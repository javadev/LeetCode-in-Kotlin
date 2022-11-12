package g0301_0400.s0328_odd_even_linked_list

import com_github_leetcode.ListNode

/*
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun oddEvenList(head: ListNode?): ListNode? {
        if (head != null) {
            var odd = head
            var even = head.next
            val evenHead = even
            while (even != null && even.next != null) {
                odd!!.next = odd.next!!.next
                even.next = even.next!!.next
                odd = odd.next
                even = even.next
            }
            odd!!.next = evenHead
        }
        return head
    }
}
