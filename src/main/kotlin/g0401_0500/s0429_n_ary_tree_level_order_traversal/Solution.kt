package g0401_0500.s0429_n_ary_tree_level_order_traversal

// #Medium #Breadth_First_Search #Tree #Programming_Skills_II_Day_9
// #2022_12_22_Time_278_ms_(75.00%)_Space_38.9_MB_(87.50%)

import com_github_leetcode.Node

/*
 * Definition for a Node.
 * class Node(var `val`: Int) {
 *     var neighbors: List<Node?> = listOf()
 * }
 */

class Solution {
    fun levelOrder(root: Node?) = go(listOfNotNull(root), mutableListOf())

    private tailrec fun go(level: List<Node>, acc: MutableList<List<Int>>): List<List<Int>> =
        if (level.isEmpty()) acc else go(
            level = level.flatMap(Node::neighbors).filterNotNull(),
            acc = acc.apply { level.map(Node::`val`).also { add(it) } }
        )
}
