package g1501_1600.s1530_number_of_good_leaf_nodes_pairs

// #Medium #Depth_First_Search #Tree #Binary_Tree
// #2023_06_12_Time_242_ms_(100.00%)_Space_39.1_MB_(100.00%)

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
    fun countPairs(root: TreeNode?, distance: Int): Int {
        return if (distance < 2) {
            0
        } else pairsAndLeaves(root, distance)[0]
    }

    private fun pairsAndLeaves(node: TreeNode?, distance: Int): IntArray {
        val r = IntArray(distance)
        if (node == null) {
            return r
        }
        if (node.left == null && node.right == null) {
            r[1] = 1
            return r
        }
        val rl = pairsAndLeaves(node.left, distance)
        val rr = pairsAndLeaves(node.right, distance)
        for (i in 2 until distance) {
            r[i] = rl[i - 1] + rr[i - 1]
        }
        var pairs = rl[0] + rr[0]
        for (dist in 2..distance) {
            for (leftToNodeDist in 1 until dist) {
                pairs += rl[leftToNodeDist] * rr[dist - leftToNodeDist]
            }
        }
        r[0] = pairs
        return r
    }
}
