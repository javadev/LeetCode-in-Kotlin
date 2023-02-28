package g0101_0200.s0106_construct_binary_tree_from_inorder_and_postorder_traversal

// #Medium #Array #Hash_Table #Tree #Binary_Tree #Divide_and_Conquer
// #2022_09_27_Time_358_ms_(61.29%)_Space_37.1_MB_(96.77%)

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
    fun buildTree(inorder: IntArray, postorder: IntArray): TreeNode? {
        val inIndex = intArrayOf(inorder.size - 1)
        val postIndex = intArrayOf(postorder.size - 1)
        return helper(inorder, postorder, inIndex, postIndex, Int.MAX_VALUE)
    }

    private fun helper(`in`: IntArray, post: IntArray, index: IntArray, pIndex: IntArray, target: Int): TreeNode? {
        if (index[0] < 0 || `in`[index[0]] == target) {
            return null
        }
        val root = TreeNode(post[pIndex[0]--])
        root.right = helper(`in`, post, index, pIndex, root.`val`)
        index[0]--
        root.left = helper(`in`, post, index, pIndex, target)
        return root
    }
}
