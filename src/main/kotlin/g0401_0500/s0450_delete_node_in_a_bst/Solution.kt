package g0401_0500.s0450_delete_node_in_a_bst

// #Medium #Tree #Binary_Tree #Binary_Search_Tree #LeetCode_75_Binary_Search_Tree
// #Data_Structure_II_Day_16_Tree #2022_12_25_Time_257_ms_(84.62%)_Space_38.6_MB_(92.31%)

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
    fun deleteNode(root: TreeNode?, key: Int): TreeNode? {
        if (root == null) return root
        // find the correct node
        if (key < root.`val`) {
            root.left = deleteNode(root.left, key)
        } else if (key > root.`val`) {
            root.right = deleteNode(root.right, key)
        } else {
            // case 1 - both children are null
            if (root.left == null && root.right == null) {
                return null
            } else if (root.left != null && root.right != null) { // case 2 - both children are NOT null
                val successor = minimum(root.right!!) // inorder successor
                root.right = deleteNode(root.right, successor)
                root.`val` = successor
            } else { // case 3 - only one of the child is null
                return root.left ?: root.right
            }
        }
        return root
    }

    private fun minimum(root: TreeNode): Int {
        var node = root
        while (node.left != null) {
            node = node.left!!
        }
        return node.`val`
    }
}
