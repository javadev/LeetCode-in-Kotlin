package g1001_1100.s1026_maximum_difference_between_node_and_ancestor

// #Medium #Depth_First_Search #Tree #Binary_Tree
// #2023_05_23_Time_155_ms_(77.78%)_Space_36.6_MB_(48.15%)

import com_github_leetcode.TreeNode
import kotlin.math.abs

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
    private var max = 0
    fun maxAncestorDiff(root: TreeNode?): Int {
        traverse(root, -1, -1)
        return max
    }

    private fun traverse(root: TreeNode?, maxAncestor: Int, minAncestor: Int) {
        if (root == null) {
            return
        }
        if (maxAncestor == -1) {
            traverse(root.left, root.`val`, root.`val`)
            traverse(root.right, root.`val`, root.`val`)
        }
        if (maxAncestor != -1) {
            max = max.coerceAtLeast(abs(maxAncestor - root.`val`))
            max = max.coerceAtLeast(abs(minAncestor - root.`val`))
            traverse(root.left, root.`val`.coerceAtLeast(maxAncestor), root.`val`.coerceAtMost(minAncestor))
            traverse(root.right, root.`val`.coerceAtLeast(maxAncestor), root.`val`.coerceAtMost(minAncestor))
        }
    }
}
