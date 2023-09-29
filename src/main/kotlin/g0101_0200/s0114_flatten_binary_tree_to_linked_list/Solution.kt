package g0101_0200.s0114_flatten_binary_tree_to_linked_list

// #Medium #Top_100_Liked_Questions #Depth_First_Search #Tree #Binary_Tree #Stack #Linked_List
// #Udemy_Linked_List #Big_O_Time_O(N)_Space_O(N)
// #2022_09_27_Time_191_ms_(93.10%)_Space_35_MB_(97.70%)

import com_github_leetcode.TreeNode

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
    fun flatten(root: TreeNode?) {
        if (root != null) {
            findTail(root)
        }
    }

    private fun findTail(root: TreeNode): TreeNode {
        val left: TreeNode? = root.left
        val right: TreeNode? = root.right
        val tail: TreeNode
        // find the tail of left subtree, tail means the most left leaf
        if (left != null) {
            tail = findTail(left)
            // stitch the right subtree below the tail
            root.left = null
            root.right = left
            tail.right = right
        } else {
            tail = root
        }
        // find tail of the right subtree
        return if (tail.right == null) {
            tail
        } else {
            findTail(tail.right!!)
        }
    }
}
