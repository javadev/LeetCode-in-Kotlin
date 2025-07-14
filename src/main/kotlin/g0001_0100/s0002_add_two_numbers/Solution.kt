package g0001_0100.s0002_add_two_numbers

// #Medium #Top_100_Liked_Questions #Top_Interview_Questions #Math #Linked_List #Recursion
// #Data_Structure_II_Day_10_Linked_List #Programming_Skills_II_Day_15
// #Top_Interview_150_Linked_List #Big_O_Time_O(max(N,M))_Space_O(max(N,M))
// #AI_can_be_used_to_solve_the_task #2025_07_11_Time_2_ms_(87.63%)_Space_45.71_MB_(80.15%)

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
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        val dummyHead = ListNode(0)
        var p = l1
        var q = l2
        var curr: ListNode? = dummyHead
        var carry = 0
        while (p != null || q != null) {
            val x = p?.`val` ?: 0
            val y = q?.`val` ?: 0
            val sum = carry + x + y
            carry = sum / 10
            curr!!.next = ListNode(sum % 10)
            curr = curr.next
            if (p != null) {
                p = p.next
            }
            if (q != null) {
                q = q.next
            }
        }
        if (carry > 0) {
            curr!!.next = ListNode(carry)
        }
        return dummyHead.next
    }
}
