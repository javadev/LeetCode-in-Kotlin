package g2001_2100.s2095_delete_the_middle_node_of_a_linked_list

// #Medium #Two_Pointers #Linked_List #2023_06_28_Time_1115_ms_(50.00%)_Space_61.4_MB_(81.25%)

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
    fun deleteMiddle(head: ListNode?): ListNode? {
        var slow = head
        var fast = head
        var prev: ListNode? = null
        while (fast?.next != null) {
            prev = slow

            slow = slow?.next
            fast = fast.next?.next
        }
        if (slow == head) {
            return null
        }
        prev?.next = slow?.next
        return head
    }
}
