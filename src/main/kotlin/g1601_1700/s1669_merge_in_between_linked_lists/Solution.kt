package g1601_1700.s1669_merge_in_between_linked_lists

// #Medium #Linked_List #2023_06_15_Time_531_ms_(66.67%)_Space_43.3_MB_(66.67%)

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
@Suppress("NAME_SHADOWING")
class Solution {
    fun mergeInBetween(list1: ListNode?, a: Int, b: Int, list2: ListNode?): ListNode? {
        var list2 = list2
        var start = list1
        for (i in 1 until a) {
            start = start!!.next
        }
        var end = start
        for (i in a..b) {
            end = end!!.next
        }
        start!!.next = list2
        while (list2!!.next != null) {
            list2 = list2.next
        }
        list2.next = end!!.next
        return list1
    }
}
