package g2101_2200.s2181_merge_nodes_in_between_zeros

import com_github_leetcode.ListNode

// #Medium #Simulation #Linked_List
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
    fun mergeNodes(head: ListNode): ListNode? {
        var temp = head.next
        var slow = head
        var sum = 0
        var fast = temp
        while (temp != null) {
            if (temp.`val` == 0) {
                temp.`val` = sum
                sum = 0
                slow.next = fast!!.next
                slow = temp
                fast = fast.next
            } else {
                sum += temp.`val`
                fast = temp
            }
            temp = temp.next
        }
        return head.next
    }
}
