package g0501_0600.s0530_minimum_absolute_difference_in_bst

import com_github_leetcode.TreeNode

// #Easy #Depth_First_Search #Breadth_First_Search #Tree #Binary_Tree #Binary_Search_Tree
// #2023_01_15_Time_209_ms_(86.96%)_Space_38.5_MB_(69.57%)

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
    private var ans = Int.MAX_VALUE
    private var prev = Int.MAX_VALUE
    fun getMinimumDifference(root: TreeNode?): Int {
        if (root == null) {
            return ans
        }
        getMinimumDifference(root.left)
        ans = Math.min(ans, Math.abs(root.`val` - prev))
        prev = root.`val`
        getMinimumDifference(root.right)
        return ans
    }
}
