package g0401_0500.s0445_add_two_numbers_ii

// #Medium #Math #Stack #Linked_List #Programming_Skills_II_Day_15 #Udemy_Linked_List
// #2022_12_23_Time_240_ms_(82.61%)_Space_42.6_MB_(73.91%)

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
    private fun reverse(head: ListNode?): ListNode? {
        if (head == null || head.next == null) {
            return head
        }
        var prev: ListNode? = null
        var curr: ListNode = head
        var next = head.next
        while (next != null) {
            curr.next = prev
            prev = curr
            curr = next
            next = next.next
        }
        curr.next = prev
        return curr
    }

    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var l1 = l1
        var l2 = l2
        l1 = reverse(l1)
        l2 = reverse(l2)
        var res: ListNode? = ListNode()
        val head = res
        var carry = 0
        while (l1 != null || l2 != null) {
            var val1: Int
            var val2: Int
            if (l1 == null) {
                val1 = 0
            } else {
                val1 = l1.`val`
                l1 = l1.next
            }
            if (l2 == null) {
                val2 = 0
            } else {
                val2 = l2.`val`
                l2 = l2.next
            }
            var data = val1 + val2 + carry
            if (data > 9) {
                carry = data / 10
                data = data % 10
            } else {
                carry = 0
            }
            res!!.next = ListNode(data)
            res = res.next
        }
        if (carry != 0) {
            res!!.next = ListNode(carry)
        }
        return reverse(head!!.next)
    }
}
