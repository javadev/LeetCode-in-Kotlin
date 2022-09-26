package g0001_0100.s0095_unique_binary_search_trees_ii

// #Medium #Dynamic_Programming #Tree #Binary_Tree #Backtracking #Binary_Search_Tree
// #2022_09_26_Time_360_ms_(41.38%)_Space_42.4_MB_(72.41%)

import com_github_leetcode.TreeNode

/**
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
    fun generateTrees(n: Int): List<TreeNode?> {
        var result: MutableList<TreeNode?> = ArrayList<TreeNode?>()
        result.add(TreeNode(1))
        for (i in 2..n) {
            val nresult: MutableList<TreeNode?> = ArrayList<TreeNode?>()
            for (r in result) {
                var node = TreeNode(i, r, null)
                nresult.add(node)
                var previous: TreeNode? = r
                while (previous != null) {
                    node = TreeNode(i)
                    val cr: TreeNode? = copy(r)
                    insert(cr, node, previous)
                    previous = node.left
                    nresult.add(cr)
                }
            }
            result = nresult
        }
        return result
    }

    private fun insert(dest: TreeNode?, n: TreeNode, from: TreeNode) {
        if (dest != null && dest.`val` === from.`val`) {
            val h: TreeNode? = dest.right
            dest.right = n
            n.left = h
            return
        }
        if (dest != null) {
            insert(dest.right, n, from)
        }
    }

    private fun copy(n: TreeNode?): TreeNode? {
        return if (n == null) {
            null
        } else TreeNode(n.`val`, copy(n.left), copy(n.right))
    }
}
