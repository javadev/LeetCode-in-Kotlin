package g0001_0100.s0083_remove_duplicates_from_sorted_list

// #Easy #Linked_List #Data_Structure_I_Day_8_Linked_List
// #2023_07_10_Time_173_ms_(82.42%)_Space_36.6_MB_(53.33%)

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
