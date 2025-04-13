package g0201_0300.s0206_reverse_linked_list

// #Easy #Top_100_Liked_Questions #Top_Interview_Questions #Linked_List #Recursion
// #LeetCode_75_LinkedList #Data_Structure_I_Day_8_Linked_List
// #Algorithm_I_Day_10_Recursion_Backtracking #Level_1_Day_3_Linked_List #Udemy_Linked_List
// #Big_O_Time_O(N)_Space_O(1) #2022_09_27_Time_279_ms_(45.78%)_Space_36.2_MB_(49.40%)

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
    fun reverseList(head: ListNode?): ListNode? {
        var prev: ListNode? = null
        var curr = head
        while (curr !== null) {
            val next = curr.next
            curr.next = prev
            prev = curr
            curr = next
        }
        return prev
    }
}
