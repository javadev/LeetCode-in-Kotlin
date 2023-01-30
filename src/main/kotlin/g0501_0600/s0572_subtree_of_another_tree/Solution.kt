package g0501_0600.s0572_subtree_of_another_tree

import com_github_leetcode.TreeNode

// #Easy #Depth_First_Search #Tree #Binary_Tree #Hash_Function #String_Matching
// #Algorithm_II_Day_7_Breadth_First_Search_Depth_First_Search
// #2023_01_23_Time_214_ms_(92.39%)_Space_38.4_MB_(45.65%)

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
    private fun isSubtreeFound(root: TreeNode?, subRoot: TreeNode?): Boolean {
        if (root == null && subRoot == null) {
            return true
        }
        if (root == null || subRoot == null) {
            return false
        }
        return if (root.`val` == subRoot.`val`) {
            isSubtreeFound(root.left, subRoot.left) && isSubtree(root.right, subRoot.right)
        } else {
            false
        }
    }

    fun isSubtree(root: TreeNode?, subRoot: TreeNode?): Boolean {
        if (root == null && subRoot == null) {
            return true
        }
        return if (root == null || subRoot == null) {
            false
        } else isSubtreeFound(root, subRoot) ||
            isSubtree(root.left, subRoot) ||
            isSubtree(root.right, subRoot)
    }
}
