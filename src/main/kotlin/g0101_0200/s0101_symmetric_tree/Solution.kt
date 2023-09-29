package g0101_0200.s0101_symmetric_tree

// #Easy #Top_100_Liked_Questions #Top_Interview_Questions #Depth_First_Search #Breadth_First_Search
// #Tree #Binary_Tree #Data_Structure_I_Day_11_Tree #Level_2_Day_15_Tree
// #Big_O_Time_O(N)_Space_O(log(N)) #2023_07_11_Time_153_ms_(82.35%)_Space_34.2_MB_(88.24%)

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
    fun isSymmetric(root: TreeNode?): Boolean {
        return if (root == null) {
            true
        } else helper(root.left, root.right)
    }

    private fun helper(leftNode: TreeNode?, rightNode: TreeNode?): Boolean {
        if (leftNode == null || rightNode == null) {
            return leftNode == null && rightNode == null
        }
        return if (leftNode.`val` != rightNode.`val`) {
            false
        } else helper(leftNode.left, rightNode.right) && helper(leftNode.right, rightNode.left)
    }
}
