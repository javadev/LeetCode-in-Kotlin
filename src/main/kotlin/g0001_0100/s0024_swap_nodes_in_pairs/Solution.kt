package g0001_0100.s0024_swap_nodes_in_pairs

// #Medium #Linked_List #Recursion #Data_Structure_II_Day_12_Linked_List
// #2022_03_29_Time_173_ms_(83.13%)_Space_34.6_MB_(41.93%)

import com_github_leetcode.ListNode

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
