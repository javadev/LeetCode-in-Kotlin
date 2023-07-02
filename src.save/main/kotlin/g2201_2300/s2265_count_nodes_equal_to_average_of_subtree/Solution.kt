package g2201_2300.s2265_count_nodes_equal_to_average_of_subtree

// #Medium #Depth_First_Search #Tree #Binary_Tree
// #2023_06_28_Time_174_ms_(100.00%)_Space_36.4_MB_(100.00%)

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
    private var ans = 0
    fun averageOfSubtree(root: TreeNode?): Int {
        dfs(root)
        return ans
    }

    private fun dfs(node: TreeNode?): IntArray {
        if (node == null) {
            return intArrayOf(0, 0)
        }
        val left = dfs(node.left)
        val right = dfs(node.right)
        val currsum = left[0] + right[0] + node.`val`
        val currcount = left[1] + right[1] + 1
        if (currsum / currcount == node.`val`) {
            ++ans
        }
        return intArrayOf(currsum, currcount)
    }
}
