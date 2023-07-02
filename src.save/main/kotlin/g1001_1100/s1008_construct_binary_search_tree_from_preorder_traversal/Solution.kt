package g1001_1100.s1008_construct_binary_search_tree_from_preorder_traversal

// #Medium #Array #Tree #Binary_Tree #Stack #Monotonic_Stack #Binary_Search_Tree
// #Udemy_Tree_Stack_Queue #2023_05_15_Time_145_ms_(100.00%)_Space_35.8_MB_(50.00%)

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
    private var i = 0
    fun bstFromPreorder(preorder: IntArray): TreeNode? {
        return bstFromPreorder(preorder, Int.MAX_VALUE)
    }

    private fun bstFromPreorder(preorder: IntArray, bound: Int): TreeNode? {
        if (i == preorder.size || preorder[i] > bound) {
            return null
        }
        val root = TreeNode(preorder[i++])
        root.left = bstFromPreorder(preorder, root.`val`)
        root.right = bstFromPreorder(preorder, bound)
        return root
    }
}
