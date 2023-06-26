package g2001_2100.s2074_reverse_nodes_in_even_length_groups

// #Medium #Linked_List #2023_06_26_Time_1197_ms_(50.00%)_Space_57.4_MB_(100.00%)

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
    fun reverseEvenLengthGroups(head: ListNode?): ListNode? {
        var cnt = 1
        var currGroupCnt = 0
        var currNode = head
        var s = currNode
        while (currNode != null) {
            while (currGroupCnt++ < cnt && currNode != null) {
                val isEven = currGroupCnt % 2 == 0
                val isLastNodeInGroup = currGroupCnt == cnt || currNode.next == null
                if (isEven && isLastNodeInGroup) {
                    val end = currNode.next
                    val afterStart = s?.next
                    currNode = afterStart
                    var prev = s?.next
                    var curr = prev?.next
                    // First node of the group should link to 'start' of the next group exclusive
                    afterStart?.next = end
                    // Reverse this group, prev - curr - temp algorithm:
                    // curr will point to prev, new prev is curr, while curr shifts forward via tmp (:
                    while (curr != null && curr != end) {
                        val tmp = curr.next
                        curr.next = prev
                        prev = curr
                        curr = tmp
                    }
                    // Last node of the prev group should link to new first node of this one
                    s?.next = prev
                    s = afterStart
                } else if (!isEven && isLastNodeInGroup) {
                    s = currNode
                }
                currNode = currNode?.next
            }
            cnt++
            currGroupCnt = 0
        }
        return head
    }
}
