package g0001_0100.s0099_recover_binary_search_tree

// #Medium #Depth_First_Search #Tree #Binary_Tree #Binary_Search_Tree
// #2022_09_27_Time_492_ms_(39.39%)_Space_50.6_MB_(21.21%)

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
    private var prev: TreeNode? = null
    private var first: TreeNode? = null
    private var second: TreeNode? = null

    fun recoverTree(root: TreeNode?) {
        evalSwappedNodes(root)
        val temp: Int = first!!.`val`
        first!!.`val` = second!!.`val`
        second!!.`val` = temp
    }

    private fun evalSwappedNodes(curr: TreeNode?) {
        if (curr == null) {
            return
        }
        evalSwappedNodes(curr.left)
        if (prev != null && prev!!.`val` > curr.`val`) {
            if (first == null) {
                first = prev
            }
            second = curr
        }
        prev = curr
        evalSwappedNodes(curr.right)
    }
}
