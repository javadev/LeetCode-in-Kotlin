package g2101_2200.s2130_maximum_twin_sum_of_a_linked_list

import com_github_leetcode.ListNode

// #Medium #Two_Pointers #Stack #Linked_List
class Solution {
    fun pairSum(head: ListNode?): Int {
        if (head == null) {
            return 0
        }
        var maxSum = Int.MIN_VALUE
        var slow = head
        var fast = head
        while (fast != null && fast.next != null) {
            slow = slow!!.next
            fast = fast.next!!.next
        }
        if (slow!!.next == null) {
            return head.`val` + slow.`val`
        }
        var tail = head
        var pivot = reverse(slow)
        while (pivot != null) {
            maxSum = Math.max(maxSum, tail!!.`val` + pivot.`val`)
            tail = tail.next
            pivot = pivot.next
        }
        return maxSum
    }

    private fun reverse(head: ListNode?): ListNode? {
        var tail = head
        var prev: ListNode? = null
        while (tail != null) {
            val temp = tail.next
            tail.next = prev
            prev = tail
            tail = temp
        }
        return prev
    }
}
