package g1301_1400.s1372_longest_zigzag_path_in_a_binary_tree

// #Medium #Dynamic_Programming #Depth_First_Search #Tree #Binary_Tree
// #2023_06_06_Time_381_ms_(66.11%)_Space_50.7_MB_(31.89%)

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
    private var maxLength = 0

    fun longestZigZag(root: TreeNode?): Int {
        dfs(root, true)
        return maxLength
    }

    private fun dfs(root: TreeNode?, isLeft: Boolean): Int {
        if (root == null) {
            return 0
        }
        val left = dfs(root.left, false)
        val right = dfs(root.right, true)
        maxLength = Math.max(maxLength, left)
        maxLength = Math.max(maxLength, right)
        return 1 + if (isLeft) left else right
    }
}
