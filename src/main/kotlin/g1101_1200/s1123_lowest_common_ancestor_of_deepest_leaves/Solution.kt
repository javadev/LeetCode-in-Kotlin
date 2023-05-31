package g1101_1200.s1123_lowest_common_ancestor_of_deepest_leaves

// #Medium #Hash_Table #Depth_First_Search #Breadth_First_Search #Tree #Binary_Tree
// #2023_05_31_Time_221_ms_(66.67%)_Space_42.4_MB_(66.67%)

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
    fun lcaDeepestLeaves(root: TreeNode?): TreeNode? {
        if (root == null) {
            return null
        }
        val leftDep = getDep(root.left)
        val rightDep = getDep(root.right)
        return if (leftDep == rightDep) {
            root
        } else {
            if (leftDep > rightDep) {
                lcaDeepestLeaves(root.left)
            } else {
                lcaDeepestLeaves(root.right)
            }
        }
    }

    fun getDep(root: TreeNode?): Int {
        return if (root == null) {
            0
        } else 1 + Math.max(getDep(root.left), getDep(root.right))
    }
}
