package g0101_0200.s0142_linked_list_cycle_ii

// #Medium #Top_100_Liked_Questions #Hash_Table #Two_Pointers #Linked_List
// #Data_Structure_II_Day_10_Linked_List #Level_1_Day_4_Linked_List #Udemy_Linked_List
// #2022_09_03_Time_192_ms_(63.39%)_Space_35.2_MB_(80.95%)

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
    fun detectCycle(head: ListNode?): ListNode? {
        if (head?.next == null) {
            return null
        }
        var slow = head
        var fast = head
        while (fast?.next != null) {
            fast = fast.next!!.next
            slow = slow!!.next
            // intersected inside the loop.
            if (slow == fast) {
                break
            }
        }
        if (fast?.next == null) {
            return null
        }
        slow = head
        while (slow != fast) {
            slow = slow!!.next
            fast = fast!!.next
        }
        return slow
    }
}
