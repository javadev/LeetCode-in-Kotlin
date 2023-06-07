package g1201_1300.s1290_convert_binary_number_in_a_linked_list_to_integer

import com_github_leetcode.ListNode

// #Easy #Math #Linked_List #Programming_Skills_I_Day_10_Linked_List_and_Tree
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
    fun getDecimalValue(head: ListNode?): Int {
        var l = 0
        var curr = head
        while (curr!!.next != null) {
            l++
            curr = curr.next
        }
        curr = head
        var num = 0
        while (curr != null) {
            num += curr.`val` * Math.pow(2.0, l--.toDouble()).toInt()
            curr = curr.next
        }
        return num
    }
}
