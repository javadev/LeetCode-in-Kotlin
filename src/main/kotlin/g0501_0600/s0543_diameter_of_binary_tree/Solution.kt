package g0501_0600.s0543_diameter_of_binary_tree

// #Easy #Top_100_Liked_Questions #Depth_First_Search #Tree #Binary_Tree #Level_2_Day_7_Tree
// #Udemy_Tree_Stack_Queue #2022_09_11_Time_307_ms_(43.93%)_Space_37.1_MB_(67.78%)

import com_github_leetcode.TreeNode

/**
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
    private var diameter = 0
    fun diameterOfBinaryTree(root: TreeNode?): Int {
        diameter = 0
        diameterOfBinaryTreeUtil(root)
        return diameter
    }

    private fun diameterOfBinaryTreeUtil(root: TreeNode?): Int {
        if (root == null) {
            return 0
        }
        val leftLength = if (root.left != null) 1 + diameterOfBinaryTreeUtil(root.left) else 0
        val rightLength = if (root.right != null) 1 + diameterOfBinaryTreeUtil(root.right) else 0
        diameter = Math.max(diameter, leftLength + rightLength)
        return Math.max(leftLength, rightLength)
    }
}
