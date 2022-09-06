package g0201_0300.s0237_delete_node_in_a_linked_list

import com_github_leetcode.ListNode

// #Easy #Top_Interview_Questions #Linked_List
// #2022_07_04_Time_0_ms_(100.00%)_Space_43.8_MB_(62.83%)
/*
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    fun deleteNode(node: ListNode?) {
        var node = node
        while (node!!.next!!.next != null) {
            node.`val` = node.next!!.`val`
            node = node.next
        }
        node.`val` = node.next!!.`val`
        node.next = null
    }
}
