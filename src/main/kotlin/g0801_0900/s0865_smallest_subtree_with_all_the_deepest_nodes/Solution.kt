package g0801_0900.s0865_smallest_subtree_with_all_the_deepest_nodes

// #Medium #Hash_Table #Depth_First_Search #Breadth_First_Search #Tree #Binary_Tree
// #2023_04_04_Time_147_ms_(100.00%)_Space_35.1_MB_(55.56%)

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
    private var deepLevel = 0
    private var left: TreeNode? = null
    private var right: TreeNode? = null
    fun subtreeWithAllDeepest(root: TreeNode?): TreeNode? {
        if (root == null || root.left == null && root.right == null) {
            return root
        }
        deep(root, 0)
        return if (right == null) {
            left
        } else {
            lca(root, left!!.`val`, right!!.`val`)
        }
    }

    private fun lca(root: TreeNode?, left: Int, right: Int): TreeNode? {
        if (root == null) {
            return null
        }
        if (root.`val` == left || root.`val` == right) {
            return root
        }
        val leftLca: TreeNode? = lca(root.left, left, right)
        val rightLca: TreeNode? = lca(root.right, left, right)
        return if (leftLca != null && rightLca != null) {
            root
        } else leftLca ?: rightLca
    }

    private fun deep(root: TreeNode?, level: Int) {
        if (root == null) {
            return
        }
        if (deepLevel < level) {
            deepLevel = level
            left = root
            right = null
        } else if (deepLevel == level) {
            right = root
        }
        deep(root.left, level + 1)
        deep(root.right, level + 1)
    }
}
