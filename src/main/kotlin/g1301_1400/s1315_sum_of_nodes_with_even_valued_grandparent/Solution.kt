package g1301_1400.s1315_sum_of_nodes_with_even_valued_grandparent

// #Medium #Depth_First_Search #Breadth_First_Search #Tree #Binary_Tree
// #2023_06_05_Time_257_ms_(82.35%)_Space_39.4_MB_(58.82%)

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
    fun sumEvenGrandparent(root: TreeNode?): Int {
        return if (root == null) {
            0
        } else {
            dfs(root, root.left, 0) + dfs(root, root.right, 0)
        }
    }

    private fun dfs(grandparent: TreeNode?, parent: TreeNode?, sum: Int): Int {
        var sum = sum
        if (grandparent == null || parent == null) {
            return sum
        }
        if (grandparent.`val` % 2 == 0 && parent.left != null) {
            sum += parent.left!!.`val`
        }
        if (grandparent.`val` % 2 == 0 && parent.right != null) {
            sum += parent.right!!.`val`
        }
        sum = dfs(parent, parent.left, sum)
        sum = dfs(parent, parent.right, sum)
        return sum
    }
}
