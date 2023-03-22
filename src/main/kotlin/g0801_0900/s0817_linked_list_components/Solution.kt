package g0801_0900.s0817_linked_list_components

// #Medium #Hash_Table #Linked_List #2023_03_22_Time_239_ms_(100.00%)_Space_39.8_MB_(66.67%)

import com_github_leetcode.ListNode

/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

@Suppress("NAME_SHADOWING")
class Solution {
    fun numComponents(head: ListNode?, nums: IntArray): Int {
        var head = head
        val set: HashSet<Int> = HashSet()
        for (i in nums) {
            set.add(i)
        }
        var result = 0
        while (head != null) {
            if (set.contains(head.`val`)) {
                while (head != null && set.contains(head.`val`)) {
                    head = head.next
                }
                result++
            } else {
                head = head.next
            }
        }
        return result
    }
}
