package g0101_0200.s0112_path_sum

import com_github_leetcode.TreeNode

// #Easy #Depth_First_Search #Breadth_First_Search #Tree #Binary_Tree #Data_Structure_I_Day_12_Tree
// #2022_09_29_Time_322_ms_(36.41%)_Space_39.6_MB_(18.97%)

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
    fun hasPathSum(root: TreeNode?, sum: Int): Boolean {
        if (root == null) {
            return false
        }
        return if (sum == root.`val` && root.left == null && root.right == null) {
            true
        } else hasPathSum(root.left, sum - root.`val`) || hasPathSum(root.right, sum - root.`val`)
    }
}
