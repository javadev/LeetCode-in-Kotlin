package g0401_0500.s0429_n_ary_tree_level_order_traversal

import com_github_leetcode.children.Node

/*
 * Definition for a Node.
 * class Node(var `val`: Int) {
 *     var children: List<Node?> = listOf()
 * }
 */

class Solution {
    fun levelOrder(root: Node?) = go(listOfNotNull(root), mutableListOf())

    private tailrec fun go(level: List<Node>, acc: MutableList<List<Int>>): List<List<Int>> =
        if (level.isEmpty()) acc else go(
            level = level.flatMap(Node::children).filterNotNull(),
            acc = acc.apply { level.map(Node::`val`).also { add(it) } }
        )
}
