package g0101_0200.s0141_linked_list_cycle

// #Easy #Top_100_Liked_Questions #Top_Interview_Questions #Hash_Table #Two_Pointers #Linked_List
// #Data_Structure_I_Day_7_Linked_List #Udemy_Linked_List #Big_O_Time_O(N)_Space_O(1)
// #2022_09_18_Time_223_ms_(91.85%)_Space_38.2_MB_(87.85%)

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
    fun hasCycle(head: ListNode?): Boolean {
        if (head == null) {
            return false
        }
        var slow = head
        var faster = head
        while (slow?.next != null && faster?.next?.next != null) {
            slow = slow.next
            faster = faster.next?.next
            if (slow == faster) {
                return true
            }
        }
        return false
    }
}
