package g0501_0600.s0538_convert_bst_to_greater_tree

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
    fun convertBST(root: TreeNode?): TreeNode? {
        if (root != null) {
            postOrder(root, 0)
        }
        return root
    }

    private fun postOrder(node: TreeNode, `val`: Int): Int {
        var newVal = 0
        if (node.right != null) {
            newVal += postOrder(node.right!!, `val`)
        }
        newVal += if (newVal == 0) `val` + node.`val` else node.`val`
        node.`val` = newVal
        if (node.left != null) {
            newVal = postOrder(node.left!!, newVal)
        }
        return newVal
    }
}
