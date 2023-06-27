package g0101_0200.s0103_binary_tree_zigzag_level_order_traversal

// #Medium #Top_Interview_Questions #Breadth_First_Search #Tree #Binary_Tree
// #Data_Structure_II_Day_15_Tree #Udemy_Tree_Stack_Queue
// #2022_09_27_Time_316_ms_(34.25%)_Space_35.3_MB_(95.21%)

import com_github_leetcode.TreeNode
import java.util.LinkedList
import java.util.Queue

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
    fun zigzagLevelOrder(root: TreeNode?): List<List<Int>> {
        val result: MutableList<List<Int>> = ArrayList()
        if (root == null) {
            return result
        }
        val q: Queue<TreeNode> = LinkedList()
        q.add(root)
        q.add(null)
        var zig = true
        var level = LinkedList<Int>()
        while (q.isNotEmpty()) {
            var node: TreeNode? = q.remove()
            while (q.isNotEmpty() && node != null) {
                if (zig) {
                    level.add(node.`val`)
                } else {
                    level.addFirst(node.`val`)
                }
                if (node.left != null) {
                    q.add(node.left)
                }
                if (node.right != null) {
                    q.add(node.right)
                }
                node = q.remove()
            }
            result.add(level)
            zig = !zig
            level = LinkedList()
            if (q.isNotEmpty()) {
                q.add(null)
            }
        }
        return result
    }
}
