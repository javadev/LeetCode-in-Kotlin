package g0101_0200.s0160_intersection_of_two_linked_lists

// #Easy #Top_100_Liked_Questions #Top_Interview_Questions #Hash_Table #Two_Pointers #Linked_List
// #Data_Structure_II_Day_11_Linked_List #Udemy_Linked_List #Big_O_Time_O(M+N)_Space_O(1)
// #2022_09_08_Time_262_ms_(83.50%)_Space_54.7_MB_(75.26%)

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
    fun getIntersectionNode(headA: ListNode?, headB: ListNode?): ListNode? {
        var node1 = headA
        var node2 = headB
        while (node1 !== node2) {
            node1 = if (node1 == null) headB else node1.next
            node2 = if (node2 == null) headA else node2.next
        }
        return node1
    }
}
