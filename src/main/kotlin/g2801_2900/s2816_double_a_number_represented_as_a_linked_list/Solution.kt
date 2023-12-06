package g2801_2900.s2816_double_a_number_represented_as_a_linked_list

// #Medium #Math #Stack #Linked_List #2023_12_06_Time_393_ms_(100.00%)_Space_46.1_MB_(71.43%)

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
    fun doubleIt(head: ListNode?): ListNode? {
        var temp1 = revList(head)
        var list1: ListNode? = null
        var current = list1
        var carry = 0
        while (temp1 != null) {
            val `val` = temp1.`val` * 2
            if (list1 == null) {
                list1 = ListNode(`val` % 10 + carry)
                current = list1
            } else {
                current!!.next = ListNode(`val` % 10 + carry)
                current = current.next
            }
            carry = `val` / 10
            temp1 = temp1.next
        }
        if (carry == 1) {
            current!!.next = ListNode(carry)
        }
        return revList(list1)
    }

    private fun revList(head: ListNode?): ListNode? {
        var prev: ListNode? = null
        var nxt: ListNode?
        var current = head
        while (current != null) {
            nxt = current.next
            current.next = prev
            prev = current
            current = nxt
        }
        return prev
    }
}
