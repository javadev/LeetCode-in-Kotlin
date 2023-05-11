package g0901_1000.s0987_vertical_order_traversal_of_a_binary_tree

// #Hard #Hash_Table #Depth_First_Search #Breadth_First_Search #Tree #Binary_Tree
// #2023_05_10_Time_189_ms_(66.67%)_Space_36.8_MB_(66.67%)

import com_github_leetcode.TreeNode
import java.util.PriorityQueue
import java.util.Queue
import java.util.TreeMap

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
    private class Node internal constructor(var row: Int, var `val`: Int)

    fun verticalTraversal(root: TreeNode?): List<List<Int>> {
        val map = TreeMap<Int, Queue<Node>>()
        helper(root, map, 0, 0)
        val ret: MutableList<List<Int>> = ArrayList()
        for (entry in map.iterator()) {
            val list: MutableList<Int> = ArrayList()
            ret.add(list)
            while (entry.value.isNotEmpty()) {
                list.add(entry.value.poll().`val`)
            }
        }
        return ret
    }

    private fun helper(cur: TreeNode?, map: TreeMap<Int, Queue<Node>>, r: Int, c: Int) {
        if (cur == null) {
            return
        }
        map.putIfAbsent(
            c, PriorityQueue { a: Node, b: Node -> if (a.row != b.row) a.row - b.row else a.`val` - b.`val` }
        )
        map.getValue(c).add(Node(r, cur.`val`))
        helper(cur.left, map, r + 1, c - 1)
        helper(cur.right, map, r + 1, c + 1)
    }
}
