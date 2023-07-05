package g2401_2500.s2476_closest_nodes_queries_in_a_binary_search_tree

// #Medium #Array #Depth_First_Search #Tree #Binary_Search #Binary_Tree
// #2023_07_05_Time_1404_ms_(33.33%)_Space_140.5_MB_(66.67%)

import com_github_leetcode.TreeNode
import java.util.TreeSet

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
    private val set = TreeSet<Int>()
    private fun traverse(root: TreeNode?) {
        if (root == null) {
            return
        }
        traverse(root.left)
        set.add(root.`val`)
        traverse(root.right)
    }

    fun closestNodes(root: TreeNode?, queries: List<Int>): List<List<Int>> {
        traverse(root)
        val ans: MutableList<List<Int>> = ArrayList()
        for (q in queries) {
            val list: MutableList<Int> = ArrayList()
            val min = set.floor(q)
            if (min != null) {
                list.add(min)
            } else {
                list.add(-1)
            }
            val max = set.ceiling(q)
            if (max != null) {
                list.add(max)
            } else {
                list.add(-1)
            }
            ans.add(list)
        }
        return ans
    }
}
