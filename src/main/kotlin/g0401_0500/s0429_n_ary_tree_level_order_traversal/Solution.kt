package g0401_0500.s0429_n_ary_tree_level_order_traversal

// #Medium #Breadth_First_Search #Tree #Programming_Skills_II_Day_9
// #2023_03_07_Time_248_ms_(75.86%)_Space_38.6_MB_(93.10%)

import com_github_leetcode.Node
import java.util.LinkedList
import java.util.Queue

/*
 * Definition for a Node.
 * class Node(var `val`: Int) {
 *     var neighbors: List<Node?> = listOf()
 * }
 */
class Solution {
    fun levelOrder(root: Node?): List<List<Int>> {
        val result: MutableList<List<Int>> = ArrayList()
        if (root == null) {
            return result
        }
        val queue: Queue<Node> = LinkedList<Node>()
        queue.offer(root)
        while (queue.isNotEmpty()) {
            val size: Int = queue.size
            val level: MutableList<Int> = ArrayList()
            for (i in 0 until size) {
                val currentNode: Node = queue.poll()
                level.add(currentNode.`val`)
                for (child in currentNode.neighbors) {
                    queue.offer(child)
                }
            }
            result.add(level)
        }
        return result
    }
}
