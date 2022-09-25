package g0001_0100.s0082_remove_duplicates_from_sorted_list_ii

// #Medium #Two_Pointers #Linked_List #Data_Structure_II_Day_11_Linked_List
// #Algorithm_II_Day_3_Two_Pointers #2022_09_25_Time_241_ms_(91.04%)_Space_39.6_MB_(16.42%)

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
    fun deleteDuplicates(head: ListNode?): ListNode? {
        if (head == null || head.next == null) {
            return head
        }
        val dummy = ListNode(0)
        var prev: ListNode? = dummy
        prev!!.next = head
        var curr = head.next
        while (curr != null) {
            var flagFoundDuplicate = false
            while (curr != null && prev!!.next!!.`val` == curr.`val`) {
                flagFoundDuplicate = true
                curr = curr.next
            }
            if (flagFoundDuplicate) {
                prev!!.next = curr
                if (curr != null) {
                    curr = curr.next
                }
            } else {
                prev = prev!!.next
                prev!!.next = curr
                curr = curr!!.next
            }
        }
        return dummy.next
    }
}
