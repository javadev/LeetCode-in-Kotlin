package g0001_0100.s0094_binary_tree_inorder_traversal

// #Easy #Top_100_Liked_Questions #Top_Interview_Questions #Depth_First_Search #Tree #Binary_Tree
// #Stack #Data_Structure_I_Day_10_Tree #Udemy_Tree_Stack_Queue
// #2022_09_27_Time_269_ms_(38.80%)_Space_35.9_MB_(14.49%)

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
    fun inorderTraversal(root: TreeNode?): List<Int> {
        if (root == null) {
            return emptyList()
        }
        val answer: MutableList<Int> = ArrayList()
        inorderTraversal(root, answer)
        return answer
    }

    private fun inorderTraversal(root: TreeNode?, answer: MutableList<Int>) {
        if (root == null) {
            return
        }
        if (root.left != null) {
            inorderTraversal(root.left, answer)
        }
        answer.add(root.`val`)
        if (root.right != null) {
            inorderTraversal(root.right, answer)
        }
    }
}
