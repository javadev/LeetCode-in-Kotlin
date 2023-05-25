package g1101_1200.s1171_remove_zero_sum_consecutive_nodes_from_linked_list

// #Medium #Hash_Table #Linked_List

import com_github_leetcode.ListNode

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
    fun removeZeroSumSublists(head: ListNode?): ListNode? {
        val pre = ListNode(-1)
        var curr: ListNode? = pre
        pre.next = head
        val map: MutableMap<Int, ListNode> = HashMap()
        var preSum = 0
        while (curr != null) {
            preSum += curr.`val`
            if (map.containsKey(preSum)) {
                curr = map[preSum]!!.next
                var key = preSum + curr!!.`val`
                while (key != preSum) {
                    map.remove(key)
                    curr = curr!!.next
                    key += curr!!.`val`
                }
                map[preSum]!!.next = curr!!.next
            } else {
                map[preSum] = curr
            }
            curr = curr.next
        }
        return pre.next
    }
}
