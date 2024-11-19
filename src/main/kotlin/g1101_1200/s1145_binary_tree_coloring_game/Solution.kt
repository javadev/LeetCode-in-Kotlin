package g1101_1200.s1145_binary_tree_coloring_game

// #Medium #Depth_First_Search #Tree #Binary_Tree
// #2023_05_31_Time_181_ms_(100.00%)_Space_35.9_MB_(100.00%)

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
    fun btreeGameWinningMove(root: TreeNode?, n: Int, x: Int): Boolean {
        if (root == null) {
            return false
        }
        if (root.`val` == x) {
            val leftCount = countNodes(root.left)
            val rightCount = countNodes(root.right)
            val parent = n - (leftCount + rightCount + 1)
            return parent > leftCount + rightCount || leftCount > parent + rightCount || rightCount > parent + leftCount
        }
        return btreeGameWinningMove(root.left, n, x) || btreeGameWinningMove(root.right, n, x)
    }

    private fun countNodes(root: TreeNode?): Int {
        return if (root == null) {
            0
        } else {
            countNodes(root.left) + countNodes(root.right) + 1
        }
    }
}
