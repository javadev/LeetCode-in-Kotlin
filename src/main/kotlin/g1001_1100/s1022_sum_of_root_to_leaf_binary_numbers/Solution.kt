package g1001_1100.s1022_sum_of_root_to_leaf_binary_numbers

// #Easy #Depth_First_Search #Tree #Binary_Tree
// #2025_05_03_Time_0_ms_(100.00%)_Space_41.68_MB_(93.33%)

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
    fun sumRootToLeaf(root: TreeNode?): Int {
        return sumRootToLeaf(root, 0)
    }

    private fun sumRootToLeaf(root: TreeNode?, sum: Int): Int {
        var sum = sum
        if (root == null) {
            return 0
        }
        sum = 2 * sum + root.`val`
        if (root.left == null && root.right == null) {
            return sum
        }
        return sumRootToLeaf(root.left, sum) + sumRootToLeaf(root.right, sum)
    }
}
