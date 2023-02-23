package g0701_0800.s0701_insert_into_a_binary_search_tree

// #Medium #Tree #Binary_Tree #Binary_Search_Tree #Data_Structure_I_Day_13_Tree
// #Udemy_Tree_Stack_Queue #2023_02_23_Time_311_ms_(79.03%)_Space_38.5_MB_(11.29%)

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
    fun insertIntoBST(
        root: TreeNode?,
        value: Int
    ): TreeNode? {
        if (root == null) {
            return TreeNode(value)
        }

        when {
            root.value < value -> root.right = insertIntoBST(root.right, value)
            root.value > value -> root.left = insertIntoBST(root.left, value)
        }

        return root
    }
    private val TreeNode.value get() = `val`
}