package g1401_1500.s1448_count_good_nodes_in_binary_tree

// #Medium #Depth_First_Search #Breadth_First_Search #Tree #Binary_Tree #LeetCode_75_Binary_Tree/DFS
// #2023_06_07_Time_384_ms_(68.52%)_Space_50.5_MB_(68.52%)

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
@Suppress("NAME_SHADOWING")
class Solution {
    private var count = 0

    private fun traverse(root: TreeNode?, max: Int) {
        var max = max
        if (root == null) {
            return
        }
        if (root.`val` >= max) {
            count += 1
            max = root.`val`
        }
        traverse(root.left, max)
        traverse(root.right, max)
    }

    fun goodNodes(root: TreeNode?): Int {
        traverse(root, Int.MIN_VALUE)
        return count
    }
}
