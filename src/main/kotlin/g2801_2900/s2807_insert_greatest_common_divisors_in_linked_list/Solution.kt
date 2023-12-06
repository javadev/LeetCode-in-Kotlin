package g2801_2900.s2807_insert_greatest_common_divisors_in_linked_list

// #Medium #Array #Math #Linked_List #2023_12_06_Time_225_ms_(67.65%)_Space_37.6_MB_(97.06%)

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
    fun insertGreatestCommonDivisors(head: ListNode?): ListNode? {
        var prevNode: ListNode? = null
        var currNode = head
        while (currNode != null) {
            if (prevNode != null) {
                val gcd = greatestCommonDivisor(prevNode.`val`, currNode.`val`)
                prevNode.next = ListNode(gcd, currNode)
            }
            prevNode = currNode
            currNode = currNode.next
        }
        return head
    }

    private fun greatestCommonDivisor(val1: Int, val2: Int): Int {
        return if (val2 == 0) {
            val1
        } else greatestCommonDivisor(val2, val1 % val2)
    }
}
