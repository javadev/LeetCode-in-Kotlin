package g1301_1400.s1339_maximum_product_of_splitted_binary_tree

import com_github_leetcode.TreeNode

// #Medium #Depth_First_Search #Tree #Binary_Tree
/*
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
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
