package g0901_1000.s0988_smallest_string_starting_from_leaf

// #Medium #String #Depth_First_Search #Tree #Binary_Tree
// #2023_05_11_Time_180_ms_(100.00%)_Space_37.6_MB_(75.00%)

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
    private var res = ""
    fun smallestFromLeaf(root: TreeNode?): String {
        dfs(root, StringBuilder())
        return res
    }

    private fun dfs(root: TreeNode?, currStr: StringBuilder) {
        if (root == null) {
            return
        }
        currStr.insert(0, (root.`val` + 97).toChar())
        if (root.left == null && root.right == null) {
            res = if (res == "") {
                currStr.toString()
            } else {
                if (res > currStr.toString()) currStr.toString() else res
            }
        } else {
            dfs(root.left, currStr)
            dfs(root.right, currStr)
        }
        currStr.deleteCharAt(0)
    }
}
