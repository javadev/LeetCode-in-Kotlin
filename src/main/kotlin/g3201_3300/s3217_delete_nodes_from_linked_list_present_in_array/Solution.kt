package g3201_3300.s3217_delete_nodes_from_linked_list_present_in_array

// #Medium #Array #Hash_Table #Linked_List #2024_07_19_Time_872_ms_(98.31%)_Space_71.9_MB_(93.22%)

import com_github_leetcode.ListNode
import kotlin.math.max

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
    fun modifiedList(nums: IntArray, head: ListNode?): ListNode? {
        var maxv = 0
        for (v in nums) {
            maxv = max(maxv, v)
        }
        val rem = BooleanArray(maxv + 1)
        for (v in nums) {
            rem[v] = true
        }
        val h = ListNode(0)
        var t = h
        var p = head
        while (p != null) {
            if (p.`val` > maxv || !rem[p.`val`]) {
                t.next = p
                t = p
            }
            p = p.next
        }
        t.next = null
        return h.next
    }
}
