package g0201_0300.s0222_count_complete_tree_nodes

// #Easy #Depth_First_Search #Tree #Binary_Search #Binary_Tree #Binary_Search_II_Day_10
// #Top_Interview_150_Binary_Tree_General #2025_02_08_Time_0_(100.00%)_Space_41.04_(43.09%)

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
    fun countNodes(root: TreeNode?): Int {
        if (root == null) {
            return 0
        }
        val leftHeight = leftHeight(root)
        val rightHeight = rightHeight(root)
        // case 1: When Height(Left sub-tree) = Height(right sub-tree) 2^h - 1
        return if (leftHeight == rightHeight) {
            (1 shl leftHeight) - 1
        } else {
            1 + countNodes(root.left) + countNodes(root.right)
        }
    }

    private fun leftHeight(root: TreeNode?): Int {
        return if (root == null) {
            0
        } else {
            1 + leftHeight(root.left)
        }
    }

    private fun rightHeight(root: TreeNode?): Int {
        return if (root == null) {
            0
        } else {
            1 + rightHeight(root.right)
        }
    }
}
