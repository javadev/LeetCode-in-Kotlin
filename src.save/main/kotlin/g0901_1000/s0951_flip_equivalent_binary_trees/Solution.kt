package g0901_1000.s0951_flip_equivalent_binary_trees

// #Medium #Depth_First_Search #Tree #Binary_Tree
// #2023_05_01_Time_150_ms_(100.00%)_Space_35.4_MB_(50.00%)

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
    fun flipEquiv(root1: TreeNode?, root2: TreeNode?): Boolean {
        if (root1 == null && root2 == null) {
            return true
        }
        if (root1 == null || root2 == null) {
            return false
        }
        return if (root1.`val` != root2.`val`) {
            false
        } else flipEquiv(root1.left, root2.left) && flipEquiv(root1.right, root2.right) ||
            flipEquiv(root1.left, root2.right) && flipEquiv(root1.right, root2.left)
    }
}
