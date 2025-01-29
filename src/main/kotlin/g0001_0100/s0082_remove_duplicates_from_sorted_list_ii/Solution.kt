package g0001_0100.s0082_remove_duplicates_from_sorted_list_ii

// #Medium #Two_Pointers #Linked_List #Data_Structure_II_Day_11_Linked_List
// #Algorithm_II_Day_3_Two_Pointers #Top_Interview_150_Linked_List
// #2023_07_10_Time_166_ms_(89.47%)_Space_36.8_MB_(63.16%)

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
