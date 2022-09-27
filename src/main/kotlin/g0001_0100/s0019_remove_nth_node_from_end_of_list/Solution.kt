package g0001_0100.s0019_remove_nth_node_from_end_of_list

// #Medium #Top_100_Liked_Questions #Top_Interview_Questions #Two_Pointers #Linked_List
// #Algorithm_I_Day_5_Two_Pointers #Level_2_Day_3_Linked_List
// #2022_03_29_Time_172_ms_(85.17%)_Space_35_MB_(74.14%)

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
    private var n = 0

    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
        this.n = n
        val node = ListNode(0, head)
        removeNth(node)
        return node.next
    }

    private fun removeNth(node: ListNode?) {
        if (node?.next == null) {
            return
        }
        removeNth(node.next)
        n--
        if (n == 0) {
            node.next = node.next?.next
        }
    }
}
