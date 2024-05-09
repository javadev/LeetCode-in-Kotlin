package g2101_2200.s2181_merge_nodes_in_between_zeros

// #Medium #Simulation #Linked_List #2024_05_09_Time_794_ms_(100.00%)_Space_69.1_MB_(64.29%)

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
