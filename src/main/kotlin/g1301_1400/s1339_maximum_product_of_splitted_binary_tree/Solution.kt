package g1301_1400.s1339_maximum_product_of_splitted_binary_tree

// #Medium #Depth_First_Search #Tree #Binary_Tree
// #2023_06_06_Time_384_ms_(100.00%)_Space_57.2_MB_(66.67%)

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
    private var maxProduct: Long = 0
    private var total: Long = 0

    fun sumTree(node: TreeNode?): Int {
        if (node == null) {
            return 0
        }
        node.`val` += sumTree(node.left) + sumTree(node.right)
        return node.`val`
    }

    private fun helper(root: TreeNode?) {
        if (root == null) {
            return
        }
        helper(root.left)
        helper(root.right)
        val leftSubtreeVal = if (root.left != null) root.left!!.`val`.toLong() else 0L
        val leftProduct = leftSubtreeVal * (total - leftSubtreeVal)
        val rightSubtreeVal = if (root.right != null) root.right!!.`val`.toLong() else 0L
        val rightProduct = rightSubtreeVal * (total - rightSubtreeVal)
        maxProduct = Math.max(maxProduct, Math.max(leftProduct, rightProduct))
    }

    fun maxProduct(root: TreeNode?): Int {
        if (root == null) {
            return 0
        }
        total = sumTree(root).toLong()
        helper(root)
        return (maxProduct % 1000000007L).toInt()
    }
}
