package g1101_1200.s1171_remove_zero_sum_consecutive_nodes_from_linked_list

// #Medium #Hash_Table #Linked_List #2023_05_25_Time_194_ms_(50.00%)_Space_40.5_MB_(50.00%)

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
