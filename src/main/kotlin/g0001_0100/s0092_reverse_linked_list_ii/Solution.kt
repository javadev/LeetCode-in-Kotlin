package g0001_0100.s0092_reverse_linked_list_ii

// #Medium #Linked_List #2022_09_26_Time_191_ms_(82.35%)_Space_34.4_MB_(29.41%)

import com_github_leetcode.ListNode

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
    fun reverseBetween(head: ListNode?, left: Int, right: Int): ListNode? {
        var head = head
        var right = right
        if (left == right) {
            return head
        }
        var prev: ListNode? = null
        var temp = head
        val start: ListNode?
        var k = left
        while (temp != null && k > 1) {
            prev = temp
            temp = temp.next
            k--
        }
        if (left > 1 && prev != null) {
            prev.next = null
        }
        var prev1: ListNode? = null
        start = temp
        while (temp != null && right - left >= 0) {
            prev1 = temp
            temp = temp.next
            right--
        }
        if (prev1 != null) {
            prev1.next = null
        }
        if (left > 1 && prev != null) {
            prev.next = reverse(start)
        } else {
            head = reverse(start)
            prev = head
        }
        while (prev!!.next != null) {
            prev = prev.next
        }
        prev.next = temp
        return head
    }

    fun reverse(head: ListNode?): ListNode? {
        var p: ListNode?
        var q: ListNode?
        var r: ListNode? = null
        p = head
        while (p != null) {
            q = p.next
            p.next = r
            r = p
            p = q
        }
        return r
    }
}
