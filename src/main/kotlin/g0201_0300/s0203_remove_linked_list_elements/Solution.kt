package g0201_0300.s0203_remove_linked_list_elements

// #Easy #Linked_List #Recursion #Data_Structure_I_Day_7_Linked_List
// #2022_10_19_Time_233_ms_(91.22%)_Space_37_MB_(100.00%)

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
    fun removeElements(head: ListNode?, `val`: Int): ListNode? {
        val sentinel = ListNode(-1)
        sentinel.next = head
        var next = head
        var prev = sentinel

        while (next != null) {
            if (next.`val` == `val`) {
                prev.next = next.next
            } else {
                prev = next
            }
            next = next.next
        }

        return sentinel.next
    }
}
