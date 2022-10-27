package g0201_0300.s0237_delete_node_in_a_linked_list

// #Easy #Top_Interview_Questions #Linked_List #2022_10_27_Time_183_ms_(93.00%)_Space_35_MB_(95.19%)

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
    fun deleteNode(node: ListNode?) {
        node ?: return
        node.`val` = node.next!!.`val`
        node.next = node.next!!.next
    }
}
