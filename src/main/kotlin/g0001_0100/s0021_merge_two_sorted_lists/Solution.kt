package g0001_0100.s0021_merge_two_sorted_lists

// #Easy #Top_100_Liked_Questions #Top_Interview_Questions #Linked_List #Recursion
// #Data_Structure_I_Day_7_Linked_List #Algorithm_I_Day_10_Recursion_Backtracking
// #Level_1_Day_3_Linked_List #Udemy_Linked_List
// #2022_10_06_Time_176_ms_(96.25%)_Space_35.2_MB_(89.94%)

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
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        var l1 = list1
        var l2 = list2
        var list: ListNode? = ListNode(-1)
        val head = list
        while (l1 != null || l2 != null) {
            if (l1 != null && l2 != null) {
                if (l1.`val` <= l2.`val`) {
                    list!!.next = ListNode(l1.`val`)
                    l1 = l1.next
                } else {
                    list!!.next = ListNode(l2.`val`)
                    l2 = l2.next
                }
            } else if (l1 != null) {
                list!!.next = ListNode(l1.`val`)
                l1 = l1.next
            } else {
                list!!.next = ListNode(l2!!.`val`)
                l2 = l2.next
            }
            list = list.next
        }
        return head!!.next
    }
}
