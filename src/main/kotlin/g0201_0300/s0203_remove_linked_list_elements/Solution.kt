package g0201_0300.s0203_remove_linked_list_elements

import com_github_leetcode.ListNode

// #Easy #Linked_List #Recursion #Data_Structure_I_Day_7_Linked_List
// #2022_06_28_Time_1_ms_(98.82%)_Space_49.4_MB_(27.43%)
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
    fun removeElements(head: ListNode?, `val`: Int): ListNode? {
        var head: ListNode? = head ?: return null
        while (head?.`val` == `val`) {
            head = head.next
        }
        var r: ListNode? = head
        var t: ListNode? = head
        while (r != null) {
            if (r.`val` == `val`) {
                t?.next = r.next
            } else {
                t = r
            }
            r = r.next
        }
        return head
    }
}
