package g0601_0700.s0623_add_one_row_to_tree

// #Medium #Depth_First_Search #Breadth_First_Search #Tree #Binary_Tree
// #2023_02_08_Time_202_ms_(100.00%)_Space_36.9_MB_(87.50%)

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
    fun addOneRow(root: TreeNode?, `val`: Int, depth: Int): TreeNode? {
        if (depth == 1) {
            val newRoot = TreeNode(`val`)
            newRoot.left = root
            return newRoot
        }
        dfs(root!!, depth - 2, `val`)
        return root
    }

    private fun dfs(node: TreeNode, depth: Int, `val`: Int) {
        if (depth == 0) {
            val left = TreeNode(`val`)
            val right = TreeNode(`val`)
            left.left = node.left
            right.right = node.right
            node.left = left
            node.right = right
        } else {
            if (node.left != null) {
                dfs(node.left!!, depth - 1, `val`)
            }
            if (node.right != null) {
                dfs(node.right!!, depth - 1, `val`)
            }
        }
    }
}
