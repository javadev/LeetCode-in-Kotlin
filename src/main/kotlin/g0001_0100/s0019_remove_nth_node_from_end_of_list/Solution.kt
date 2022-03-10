package g0001_0100.s0019_remove_nth_node_from_end_of_list

// #Medium #Top_100_Liked_Questions #Top_Interview_Questions #Two_Pointers #Linked_List

import com_github_leetcode.ListNode

class Solution {
    var n = 0
    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
        this.n = n
        val node = ListNode(0, head)
        removeNth(node)
        return node?.next
    }

    private fun removeNth(node: ListNode?) {
        if (node?.next == null) {
            return
        }
        removeNth(node.next)
        n--
        if (n == 0) {
            node.next = node?.next?.next
        }
    }
}
