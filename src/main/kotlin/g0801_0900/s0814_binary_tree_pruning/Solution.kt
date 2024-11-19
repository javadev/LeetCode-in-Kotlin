package g0801_0900.s0814_binary_tree_pruning

// #Medium #Depth_First_Search #Tree #Binary_Tree
// #2023_03_22_Time_127_ms_(100.00%)_Space_34.3_MB_(11.11%)

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
    fun pruneTree(root: TreeNode?): TreeNode? {
        if (root == null) {
            return root
        }
        root.left = pruneTree(root.left)
        root.right = pruneTree(root.right)
        return if (root.left == null && root.right == null && root.`val` == 0) {
            null
        } else {
            root
        }
    }
}
