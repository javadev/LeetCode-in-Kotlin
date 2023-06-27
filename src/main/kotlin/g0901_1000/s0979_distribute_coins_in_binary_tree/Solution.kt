package g0901_1000.s0979_distribute_coins_in_binary_tree

// #Medium #Depth_First_Search #Tree #Binary_Tree
// #2023_05_08_Time_165_ms_(80.00%)_Space_36.5_MB_(20.00%)

import com_github_leetcode.TreeNode
import kotlin.math.abs

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
    private var num = 0
    fun distributeCoins(root: TreeNode?): Int {
        helper(root)
        return num
    }

    private fun helper(node: TreeNode?): Int {
        if (node == null) {
            return 0
        }
        val total: Int = node.`val` + helper(node.left) + helper(node.right)
        val leftover = total - 1
        num += abs(leftover)
        return leftover
    }
}
