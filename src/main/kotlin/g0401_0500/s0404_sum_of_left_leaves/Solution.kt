package g0401_0500.s0404_sum_of_left_leaves

// #Easy #Depth_First_Search #Breadth_First_Search #Tree #Binary_Tree
// #Programming_Skills_I_Day_10_Linked_List_and_Tree
// #2022_12_01_Time_173_ms_(86.05%)_Space_35_MB_(25.58%)

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
    fun sumOfLeftLeaves(root: TreeNode): Int {
        fun dfs(root: TreeNode?, left: Boolean): Int {
            root ?: return 0
            if (root.left == null && root.right == null) {
                return if (left) {
                    root.`val`
                } else {
                    0
                }
            }
            return dfs(root.left, true) + dfs(root.right, false)
        }

        return dfs(root, false)
    }
}
