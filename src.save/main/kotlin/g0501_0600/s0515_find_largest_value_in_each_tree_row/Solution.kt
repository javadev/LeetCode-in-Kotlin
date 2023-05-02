package g0501_0600.s0515_find_largest_value_in_each_tree_row

// #Medium #Depth_First_Search #Breadth_First_Search #Tree #Binary_Tree
// #2023_01_12_Time_238_ms_(73.33%)_Space_35.5_MB_(100.00%)

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
    fun largestValues(root: TreeNode?): List<Int> {
        val list: MutableList<Int> = ArrayList()
        val queue: Queue<TreeNode?> = LinkedList()
        if (root != null) {
            queue.offer(root)
            while (!queue.isEmpty()) {
                var max = Int.MIN_VALUE
                val size = queue.size
                for (i in 0 until size) {
                    val curr = queue.poll()
                    max = Math.max(max, curr!!.`val`)
                    if (curr.left != null) {
                        queue.offer(curr.left)
                    }
                    if (curr.right != null) {
                        queue.offer(curr.right)
                    }
                }
                list.add(max)
            }
        }
        return list
    }
}
