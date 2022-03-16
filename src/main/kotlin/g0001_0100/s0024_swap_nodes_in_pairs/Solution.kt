package g0001_0100.s0024_swap_nodes_in_pairs

import com_github_leetcode.ListNode

// #Medium #Linked_List #Recursion #2022_02_18_Time_0_ms_(100.00%)_Space_41.9_MB_(22.86%)

class Solution {
    fun swapPairs(head: ListNode?): ListNode? {
        if (head == null) {
            return null
        }
        val len = getLength(head)
        return reverse(head, len)
    }

    private fun getLength(curr: ListNode): Int {
        var curr: ListNode? = curr
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
