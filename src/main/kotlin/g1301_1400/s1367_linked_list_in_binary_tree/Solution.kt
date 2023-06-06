package g1301_1400.s1367_linked_list_in_binary_tree

// #Medium #Depth_First_Search #Breadth_First_Search #Tree #Binary_Tree #Linked_List
// #Programming_Skills_II_Day_4 #2023_06_06_Time_237_ms_(92.86%)_Space_39.4_MB_(78.57%)

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
    fun isSubPath(head: ListNode?, root: TreeNode?): Boolean {
        return if (root == null) {
            false
        } else (
            doesRootHaveList(head, root) ||
                isSubPath(head, root.left) ||
                isSubPath(head, root.right)
            )
    }

    private fun doesRootHaveList(head: ListNode?, root: TreeNode?): Boolean {
        if (head == null) {
            return true
        }
        return if (root == null) {
            false
        } else (
            head.`val` == root.`val` &&
                (
                    doesRootHaveList(head.next, root.left) ||
                        doesRootHaveList(head.next, root.right)
                    )
            )
    }
}
