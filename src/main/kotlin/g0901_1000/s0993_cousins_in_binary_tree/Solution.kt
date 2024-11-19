package g0901_1000.s0993_cousins_in_binary_tree

// #Easy #Depth_First_Search #Breadth_First_Search #Tree #Binary_Tree
// #2023_05_12_Time_152_ms_(71.43%)_Space_35.2_MB_(71.43%)

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
    fun isCousins(root: TreeNode?, x: Int, y: Int): Boolean {
        return !isSiblings(root, x, y) && isSameLevels(root, x, y)
    }

    private fun isSameLevels(root: TreeNode?, x: Int, y: Int): Boolean {
        return findLevel(root, x, 0) == findLevel(root, y, 0)
    }

    private fun findLevel(root: TreeNode?, x: Int, level: Int): Int {
        if (root == null) {
            return -1
        }
        if (root.`val` == x) {
            return level
        }
        val leftLevel = findLevel(root.left, x, level + 1)
        return if (leftLevel == -1) {
            findLevel(root.right, x, level + 1)
        } else {
            leftLevel
        }
    }

    private fun isSiblings(root: TreeNode?, x: Int, y: Int): Boolean {
        if (root == null) {
            return false
        }
        // Check children first
        val leftSubTreeContainsCousins = isSiblings(root.left, x, y)
        val rightSubTreeContainsCousins = isSiblings(root.right, x, y)
        if (leftSubTreeContainsCousins || rightSubTreeContainsCousins) {
            return true
        }
        return if (root.left == null || root.right == null) {
            false
        } else {
            root.left!!.`val` == x && root.right!!.`val` == y ||
                root.right!!.`val` == x && root.left!!.`val` == y
        }
    }
}
