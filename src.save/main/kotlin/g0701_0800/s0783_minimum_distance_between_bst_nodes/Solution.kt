package g0701_0800.s0783_minimum_distance_between_bst_nodes

// #Easy #Depth_First_Search #Breadth_First_Search #Tree #Binary_Tree #Binary_Search_Tree
// #2023_03_12_Time_144_ms_(96.35%)_Space_34.2_MB_(35.56%)

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
    private var prev = -1
    private var min = Int.MAX_VALUE
    fun minDiffInBST(root: TreeNode?): Int {
        if (root == null) {
            return min
        }
        minDiffInBST(root.left)
        if (prev != -1) {
            min = min.coerceAtMost(abs(root.`val` - prev))
        }
        prev = root.`val`
        minDiffInBST(root.right)
        return min
    }
}
