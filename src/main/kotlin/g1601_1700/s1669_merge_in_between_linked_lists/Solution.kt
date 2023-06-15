package g1601_1700.s1669_merge_in_between_linked_lists

import com_github_leetcode.ListNode

// #Medium #Linked_List
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
