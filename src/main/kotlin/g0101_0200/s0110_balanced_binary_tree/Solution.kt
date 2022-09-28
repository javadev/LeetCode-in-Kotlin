package g0101_0200.s0110_balanced_binary_tree

// #Easy #Depth_First_Search #Tree #Binary_Tree #Programming_Skills_II_Day_2 #Level_2_Day_6_Tree
// #Udemy_Tree_Stack_Queue #2022_09_28_Time_398_ms_(12.89%)_Space_43.8_MB_(12.58%)

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
    fun isBalanced(root: TreeNode?): Boolean {
        // Empty Tree is balanced
        if (root == null) {
            return true
        }
        // Get max height of subtree child
        // Get max height of subtree child
        // compare height difference (cannot be more than 1)
        var leftHeight = 0
        var rightHeight = 0
        if (root.left != null) {
            leftHeight = getMaxHeight(root.left)
        }
        if (root.right != null) {
            rightHeight = getMaxHeight(root.right)
        }
        val heightDiff = Math.abs(leftHeight - rightHeight)
        // if passes height check
        //  - Check if left subtree is balanced and if the right subtree is balanced
        //  - If one of both are imbalanced, then the tree is imbalanced
        return heightDiff <= 1 && isBalanced(root.left) && isBalanced(root.right)
    }

    private fun getMaxHeight(root: TreeNode?): Int {
        if (root == null) {
            return 0
        }
        var leftHeight = 0
        var rightHeight = 0
        // Left
        if (root.left != null) {
            leftHeight = getMaxHeight(root.left)
        }
        // Right
        if (root.right != null) {
            rightHeight = getMaxHeight(root.right)
        }
        return if (leftHeight > rightHeight) {
            1 + leftHeight
        } else {
            1 + rightHeight
        }
    }
}
