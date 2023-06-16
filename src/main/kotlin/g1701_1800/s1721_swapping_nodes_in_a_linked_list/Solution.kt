package g1701_1800.s1721_swapping_nodes_in_a_linked_list

// #Medium #Two_Pointers #Linked_List #2023_06_16_Time_879_ms_(13.84%)_Space_53.8_MB_(95.50%)

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
    fun swapNodes(head: ListNode?, k: Int): ListNode? {
        var k = k
        var beg: ListNode? = null
        var end: ListNode? = null
        var node = head
        while (node != null) {
            k--
            if (k == 0) {
                beg = node
                end = head
            } else if (end != null) {
                end = end.next
            }
            node = node.next
        }
        if (beg != null) {
            val tem = beg.`val`
            beg.`val` = end!!.`val`
            end.`val` = tem
        }
        return head
    }
}
