package g0101_0200.s0107_binary_tree_level_order_traversal_ii

// #Medium #Breadth_First_Search #Tree #Binary_Tree
// #2023_07_11_Time_187_ms_(87.50%)_Space_36.6_MB_(100.00%)

import com_github_leetcode.TreeNode
import java.util.Collections

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
    private val order: MutableList<MutableList<Int>> = ArrayList()

    fun levelOrderBottom(root: TreeNode?): List<MutableList<Int>> {
        getOrder(root, 0)
        Collections.reverse(order)
        return order
    }

    fun getOrder(root: TreeNode?, level: Int) {
        if (root != null) {
            if (level + 1 > order.size) {
                order.add(ArrayList())
            }
            order[level].add(root.`val`)
            getOrder(root.left, level + 1)
            getOrder(root.right, level + 1)
        }
    }
}
