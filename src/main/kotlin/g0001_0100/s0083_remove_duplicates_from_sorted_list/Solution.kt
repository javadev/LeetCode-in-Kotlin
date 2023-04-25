package g0001_0100.s0083_remove_duplicates_from_sorted_list

// #Easy #Linked_List #Data_Structure_I_Day_8_Linked_List
// #2022_09_25_Time_274_ms_(77.82%)_Space_37.9_MB_(53.23%)

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
        if (head == null) {
            return null
        }
        var current: ListNode = head
        var next = current.next
        while (null != next) {
            if (current.`val` == next.`val`) {
                current.next = next.next
            } else {
                current = next
            }
            next = current.next
        }
        return head
    }
}
