package g0001_0100.s0086_partition_list

// #Medium #Two_Pointers #Linked_List #Top_Interview_150_Linked_List
// #2023_07_10_Time_160_ms_(70.73%)_Space_35.1_MB_(46.34%)

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
    fun partition(head: ListNode?, x: Int): ListNode? {
        var head = head
        var nHead: ListNode? = ListNode(0)
        var nTail: ListNode? = ListNode(0)
        val ptr = nTail
        val temp = nHead
        while (head != null) {
            val nNext = head.next
            if (head.`val` < x) {
                nHead!!.next = head
                nHead = nHead.next
            } else {
                nTail!!.next = head
                nTail = nTail.next
            }
            head = nNext
        }
        nTail!!.next = null
        nHead!!.next = ptr!!.next
        return temp!!.next
    }
}
