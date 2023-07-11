package g0101_0200.s0109_convert_sorted_list_to_binary_search_tree

// #Medium #Tree #Binary_Tree #Linked_List #Binary_Search_Tree #Divide_and_Conquer
// #2023_07_11_Time_191_ms_(100.00%)_Space_39.5_MB_(61.54%)

import com_github_leetcode.ListNode
import com_github_leetcode.TreeNode

/*
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
/*
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    fun sortedListToBST(head: ListNode?): TreeNode? {
        // Empty list -> empty tree / sub-tree
        if (head == null) {
            return null
        }
        // No next node -> this node will become leaf
        if (head.next == null) {
            val leaf = TreeNode(head.`val`)
            leaf.left = null
            leaf.right = null
            return leaf
        }
        var slow = head
        // Head-Start fast by 1 to get slow = mid -1
        var fast = head.next!!.next
        // Find the mid of list
        while (fast != null && fast.next != null) {
            slow = slow!!.next
            fast = fast.next!!.next
        }
        // slow.next ->  mid = our "root"
        val root = TreeNode(slow!!.next!!.`val`)
        // Right sub tree from mid - end
        root.right = sortedListToBST(slow.next!!.next)
        // Left sub tree from head - mid (chop slow.next)
        slow.next = null
        root.left = sortedListToBST(head)
        return root
    }
}
