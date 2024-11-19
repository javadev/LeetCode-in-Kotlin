package g1001_1100.s1080_insufficient_nodes_in_root_to_leaf_paths

// #Medium #Depth_First_Search #Tree #Binary_Tree
// #2023_06_02_Time_271_ms_(100.00%)_Space_38.9_MB_(100.00%)

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
    fun sufficientSubset(root: TreeNode?, limit: Int): TreeNode? {
        return if (sufficientSubset(root, limit, 0, root!!.left == null && root.right == null) < limit) null else root
    }

    fun sufficientSubset(root: TreeNode?, limit: Int, sum: Int, isLeaf: Boolean): Int {
        if (root != null) {
            val leftSum = sufficientSubset(
                root.left,
                limit,
                sum + root.`val`,
                root.left == null && root.right == null,
            )
            val rightSum = sufficientSubset(
                root.right,
                limit,
                sum + root.`val`,
                root.left == null && root.right == null,
            )
            if (leftSum < limit) {
                root.left = null
            }
            if (rightSum < limit) {
                root.right = null
            }
            return leftSum.coerceAtLeast(rightSum)
        }
        return if (isLeaf) sum else Int.MIN_VALUE
    }
}
