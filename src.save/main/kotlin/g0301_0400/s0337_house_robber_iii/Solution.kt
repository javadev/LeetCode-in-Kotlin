package g0301_0400.s0337_house_robber_iii

// #Medium #Dynamic_Programming #Depth_First_Search #Tree #Binary_Tree #Udemy_Tree_Stack_Queue
// #2022_11_17_Time_282_ms_(84.62%)_Space_39.5_MB_(69.23%)

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
    fun rob(root: TreeNode?): Int {
        val out = robRec(root)
        return Math.max(out[0], out[1])
    }

    private fun robRec(curr: TreeNode?): IntArray {
        if (curr == null) {
            return intArrayOf(0, 0)
        }
        val left = robRec(curr.left)
        val right = robRec(curr.right)
        val out = IntArray(2)
        // 1. If choosing to take the house
        out[0] = curr.`val` + left[1] + right[1]
        // 2. If choosing to skip the house
        out[1] = left[0] + right[0]
        // 3. Best Solution at house
        out[0] = Math.max(out[0], out[1])
        return out
    }
}
