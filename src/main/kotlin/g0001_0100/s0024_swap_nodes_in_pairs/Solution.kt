package g0001_0100.s0024_swap_nodes_in_pairs

// #Medium #Top_100_Liked_Questions #Linked_List #Recursion #Data_Structure_II_Day_12_Linked_List
// #Udemy_Linked_List #Big_O_Time_O(n)_Space_O(1)
// #2023_07_03_Time_149_ms_(44.20%)_Space_33.5_MB_(98.90%)

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
    fun swapPairs(head: ListNode?): ListNode? {
        if (head == null) {
            return null
        }
        val len = getLength(head)
        return reverse(head, len)
    }

    private fun getLength(currLocal: ListNode): Int {
        var curr: ListNode? = currLocal
        var cnt = 0
        while (curr != null) {
            cnt++
            curr = curr.next
        }
        return cnt
    }

    // Recursive function to reverse in groups
    private fun reverse(head: ListNode?, len: Int): ListNode? {
        // base case
        if (len < 2) {
            return head
        }
        var curr = head
        var prev: ListNode? = null
        var next: ListNode?
        for (i in 0..1) {
            // reverse linked list code
            next = curr!!.next
            curr.next = prev
            prev = curr
            curr = next
        }
        head!!.next = reverse(curr, len - 2)
        return prev
    }
}
