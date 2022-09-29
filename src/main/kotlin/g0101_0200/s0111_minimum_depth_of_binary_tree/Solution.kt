package g0101_0200.s0111_minimum_depth_of_binary_tree

// #Easy #Depth_First_Search #Breadth_First_Search #Tree #Binary_Tree #Udemy_Tree_Stack_Queue
// #2022_09_29_Time_525_ms_(90.51%)_Space_55.3_MB_(90.51%)

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
    fun minDepth(root: TreeNode?): Int {
        if (root == null) {
            return 0
        }
        val queue: Queue<TreeNode> = LinkedList()
        queue.add(root)
        var d = 0
        while (!queue.isEmpty()) {
            val size: Int = queue.size
            for (i in 0 until size) {
                val current: TreeNode = queue.poll()
                if (current.left == null && current.right == null && d > 0) {
                    return d + 1
                }
                if (current.right != null) {
                    queue.add(current.right)
                }
                if (current.left != null) {
                    queue.add(current.left)
                }
            }
            d++
        }
        return d
    }
}
