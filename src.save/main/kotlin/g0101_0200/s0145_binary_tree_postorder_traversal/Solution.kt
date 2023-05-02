package g0101_0200.s0145_binary_tree_postorder_traversal

// #Easy #Depth_First_Search #Tree #Binary_Tree #Stack #Data_Structure_I_Day_10_Tree
// #Udemy_Tree_Stack_Queue #2022_10_09_Time_211_ms_(80.00%)_Space_34.3_MB_(80.67%)

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
    fun postorderTraversal(root: TreeNode?): MutableList<Int> {
        if (root == null) {
            return ArrayList()
        }
        val res = postorderTraversal(root.left)
        res.addAll(postorderTraversal(root.right))
        res.add(root.`val`)
        return res
    }
}
