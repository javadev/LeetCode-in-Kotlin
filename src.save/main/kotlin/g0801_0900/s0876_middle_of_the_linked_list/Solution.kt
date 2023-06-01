package g0801_0900.s0876_middle_of_the_linked_list

// #Easy #Two_Pointers #Linked_List #Algorithm_I_Day_5_Two_Pointers
// #Programming_Skills_I_Day_10_Linked_List_and_Tree #Level_1_Day_4_Linked_List #Udemy_Linked_List
// #2023_04_08_Time_136_ms_(76.52%)_Space_34_MB_(11.02%)

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
    fun middleNode(head: ListNode?): ListNode? {
        var fast = head
        var slow = head
        while (fast?.next != null) {
            fast = fast.next!!.next
            slow = slow!!.next
        }
        return slow
    }
}
