package g0001_0100.s0023_merge_k_sorted_lists

// #Hard #Top_100_Liked_Questions #Top_Interview_Questions #Heap_Priority_Queue #Linked_List
// #Divide_and_Conquer #Merge_Sort #2022_03_29_Time_323_ms_(75.14%)_Space_43.3_MB_(68.27%)

import com_github_leetcode.ListNode

class Solution {
    fun mergeKLists(lists: Array<ListNode>): ListNode? {
        return if (lists.isEmpty()) {
            null
        } else mergeKLists(lists, 0, lists.size)
    }

    private fun mergeKLists(lists: Array<ListNode>, leftIndex: Int, rightIndex: Int): ListNode? {
        return if (rightIndex > leftIndex + 1) {
            val mid = (leftIndex + rightIndex) / 2
            val left = mergeKLists(lists, leftIndex, mid)
            val right = mergeKLists(lists, mid, rightIndex)
            mergeTwoLists(left, right)
        } else {
            lists[leftIndex]
        }
    }

    private fun mergeTwoLists(leftLocal: ListNode?, rightLocal: ListNode?): ListNode? {
        var left = leftLocal
        var right = rightLocal
        if (left == null) {
            return right
        }
        if (right == null) {
            return left
        }
        val res: ListNode
        if (left.`val` <= right.`val`) {
            res = left
            left = left.next
        } else {
            res = right
            right = right.next
        }
        var node: ListNode? = res
        while (left != null || right != null) {
            if (left == null) {
                node!!.next = right
                right = right!!.next
            } else if (right == null) {
                node!!.next = left
                left = left.next
            } else {
                if (left.`val` <= right.`val`) {
                    node!!.next = left
                    left = left.next
                } else {
                    node!!.next = right
                    right = right.next
                }
            }
            node = node.next
        }
        return res
    }
}
