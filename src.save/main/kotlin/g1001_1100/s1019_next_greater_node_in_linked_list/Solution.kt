package g1001_1100.s1019_next_greater_node_in_linked_list

// #Medium #Array #Stack #Linked_List #Monotonic_Stack
// #2023_05_21_Time_472_ms_(75.00%)_Space_97.4_MB_(25.00%)

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
@Suppress("NAME_SHADOWING")
class Solution {
    fun nextLargerNodes(head: ListNode?): IntArray {
        var head = head
        val len = length(head)
        var i = 0
        val arr = IntArray(len)
        val idx = IntArray(len)
        while (head != null) {
            arr[i] = head.`val`
            head = head.next
            i++
        }
        hlp(arr, idx, 0)
        i = 0
        while (i < idx.size) {
            val j = idx[i]
            if (j != -1) {
                arr[i] = arr[j]
            } else {
                arr[i] = 0
            }
            i++
        }
        arr[i - 1] = 0
        return arr
    }

    private fun hlp(arr: IntArray, idx: IntArray, i: Int) {
        if (i == arr.size - 1) {
            idx[i] = -1
            return
        }
        hlp(arr, idx, i + 1)
        var j = i + 1
        while (j != -1 && arr[i] >= arr[j]) {
            j = idx[j]
        }
        if (j != -1 && arr[i] >= arr[j]) {
            idx[i] = -1
        } else {
            idx[i] = j
        }
    }

    private fun length(head: ListNode?): Int {
        var head = head
        var len = 0
        while (head != null) {
            head = head.next
            len++
        }
        return len
    }
}
