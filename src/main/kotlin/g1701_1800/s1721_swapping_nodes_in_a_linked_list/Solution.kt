package g1701_1800.s1721_swapping_nodes_in_a_linked_list

import com_github_leetcode.ListNode

// #Medium #Two_Pointers #Linked_List
/*
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
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
