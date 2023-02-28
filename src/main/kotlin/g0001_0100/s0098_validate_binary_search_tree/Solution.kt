package g0001_0100.s0098_validate_binary_search_tree

// #Medium #Top_100_Liked_Questions #Top_Interview_Questions #Depth_First_Search #Tree #Binary_Tree
// #Binary_Search_Tree #Data_Structure_I_Day_14_Tree #Level_1_Day_8_Binary_Search_Tree
// #Udemy_Tree_Stack_Queue #2022_09_02_Time_330_ms_(41.38%)_Space_40_MB_(43.80%)

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
    fun isValidBST(root: TreeNode?): Boolean {
        return solve(root, Long.MIN_VALUE, Long.MAX_VALUE)
    }

    // we will send a valid range and check whether the root lies in the range
    // and update the range for the subtrees
    private fun solve(root: TreeNode?, left: Long, right: Long): Boolean {
        if (root == null) {
            return true
        }
        return if (root.`val` <= left || root.`val` >= right) {
            false
        } else solve(root.left, left, root.`val`.toLong()) && solve(root.right, root.`val`.toLong(), right)
    }
}
