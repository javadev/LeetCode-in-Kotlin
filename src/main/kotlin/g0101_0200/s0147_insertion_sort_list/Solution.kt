package g0101_0200.s0147_insertion_sort_list

// #Medium #Sorting #Linked_List #2022_10_09_Time_385_ms_(52.00%)_Space_43_MB_(14.00%)

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
    fun insertionSortList(head: ListNode?): ListNode? {
        val dummy = ListNode(-1)
        var node = head
        while (node != null) {
            var prev = dummy
            while (prev?.next != null && node.`val` > prev.next.`val`) {
                prev = prev.next!!
            }
            val temp = node.next
            node.next = prev.next
            prev.next = node
            node = temp
        }
        return dummy.next
    }
}
