package g1301_1400.s1325_delete_leaves_with_a_given_value

// #Medium #Depth_First_Search #Tree #Binary_Tree
// #2023_06_06_Time_185_ms_(100.00%)_Space_36.7_MB_(66.67%)

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
@Suppress("NAME_SHADOWING")
class Solution {
    fun removeLeafNodes(root: TreeNode?, target: Int): TreeNode? {
        var root = root
        while (hasTargetLeafNodes(root, target)) {
            root = removeLeafNodes(target, root)
        }
        return root
    }

    private fun removeLeafNodes(target: Int, root: TreeNode?): TreeNode? {
        var root = root
        if (root == null) {
            return root
        }
        if (root.`val` == target && root.left == null && root.right == null) {
            root = null
            return root
        }
        if (root.left != null && root.left!!.`val` == target && root.left!!.left == null && root.left!!.right == null) {
            root.left = null
        }
        if (root.right != null && root.right!!.`val` == target && root.right!!.left == null &&
            root.right!!.right == null
        ) {
            root.right = null
        }
        removeLeafNodes(target, root.left)
        removeLeafNodes(target, root.right)
        return root
    }

    private fun hasTargetLeafNodes(root: TreeNode?, target: Int): Boolean {
        if (root == null) {
            return false
        }
        return if (root.left == null && root.right == null && root.`val` == target) {
            true
        } else hasTargetLeafNodes(root.left, target) || hasTargetLeafNodes(root.right, target)
    }
}
