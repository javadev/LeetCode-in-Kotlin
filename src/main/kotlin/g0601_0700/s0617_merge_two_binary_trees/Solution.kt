package g0601_0700.s0617_merge_two_binary_trees

// #Easy #Depth_First_Search #Breadth_First_Search #Tree #Binary_Tree
// #Algorithm_I_Day_8_Breadth_First_Search_Depth_First_Search
// #2023_02_06_Time_243_ms_(72.83%)_Space_36.4_MB_(98.91%)

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
    fun mergeTrees(root1: TreeNode?, root2: TreeNode?): TreeNode? {
        if (root1 == null) {
            return root2
        }
        return if (root2 == null) {
            root1
        } else {
            TreeNode(
                root1.`val` + root2.`val`,
                mergeTrees(root1.left, root2.left),
                mergeTrees(root1.right, root2.right),
            )
        }
    }
}
