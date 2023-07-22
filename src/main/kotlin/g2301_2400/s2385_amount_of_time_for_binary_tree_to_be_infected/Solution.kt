package g2301_2400.s2385_amount_of_time_for_binary_tree_to_be_infected

// #Medium #Depth_First_Search #Breadth_First_Search #Tree #Binary_Tree
// #2023_07_02_Time_609_ms_(100.00%)_Space_75.2_MB_(100.00%)

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
    private var max = 0
    fun amountOfTime(root: TreeNode?, start: Int): Int {
        dfs(root, start, Distance(-1))
        return max
    }

    private fun dfs(root: TreeNode?, start: Int, l: Distance): Int {
        if (root == null) {
            return 0
        }
        val ld = Distance(-1)
        val rd = Distance(-1)
        val left = dfs(root.left, start, ld)
        val right = dfs(root.right, start, rd)
        if (l.`val` == -1 && start == root.`val`) {
            max = Math.max(left, right)
            l.`val` = 1
        }
        if (ld.`val` != -1) {
            max = Math.max(max, ld.`val` + right)
            l.`val` = ld.`val` + 1
        } else if (rd.`val` != -1) {
            max = Math.max(max, rd.`val` + left)
            l.`val` = rd.`val` + 1
        }
        return Math.max(left, right) + 1
    }

    private class Distance internal constructor(var `val`: Int)
}
