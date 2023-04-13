package g0801_0900.s0889_construct_binary_tree_from_preorder_and_postorder_traversal

// #Medium #Array #Hash_Table #Tree #Binary_Tree #Divide_and_Conquer
// #2023_04_09_Time_168_ms_(100.00%)_Space_35.5_MB_(75.00%)

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
    fun constructFromPrePost(preorder: IntArray, postorder: IntArray): TreeNode? {
        return if (preorder.isEmpty() || preorder.size != postorder.size) {
            null
        } else buildTree(preorder, 0, preorder.size - 1, postorder, 0, postorder.size - 1)
    }

    private fun buildTree(
        preorder: IntArray,
        preStart: Int,
        preEnd: Int,
        postorder: IntArray,
        postStart: Int,
        postEnd: Int
    ): TreeNode? {
        if (preStart > preEnd || postStart > postEnd) {
            return null
        }
        val data = preorder[preStart]
        val root = TreeNode(data)
        if (preStart == preEnd) {
            return root
        }
        var offset = postStart
        while (offset <= preEnd) {
            if (postorder[offset] == preorder[preStart + 1]) {
                break
            }
            offset++
        }
        root.left = buildTree(
            preorder,
            preStart + 1,
            preStart + offset - postStart + 1,
            postorder,
            postStart,
            offset
        )
        root.right = buildTree(
            preorder,
            preStart + offset - postStart + 2,
            preEnd,
            postorder,
            offset + 1,
            postEnd - 1
        )
        return root
    }
}
