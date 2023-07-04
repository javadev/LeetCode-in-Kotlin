package g2401_2500.s2415_reverse_odd_levels_of_binary_tree

// #Medium #Depth_First_Search #Breadth_First_Search #Tree #Binary_Tree
// #2023_07_04_Time_499_ms_(87.50%)_Space_47.7_MB_(12.50%)

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
    private val list: MutableList<Int> = ArrayList()
    fun reverseOddLevels(root: TreeNode): TreeNode? {
        solve(root)
        return enrich(list, 0)
    }

    private fun enrich(list: List<Int>, i: Int): TreeNode? {
        var root: TreeNode? = null
        if (i < list.size) {
            root = TreeNode(list[i])
            root.left = enrich(list, 2 * i + 1)
            root.right = enrich(list, 2 * i + 2)
        }
        return root
    }

    private fun solve(root: TreeNode) {
        val q: Queue<TreeNode?> = LinkedList()
        q.add(root)
        var level = 0
        while (q.isNotEmpty()) {
            val size = q.size
            val res: MutableList<Int> = ArrayList()
            for (i in 0 until size) {
                val cur = q.remove()
                res.add(cur!!.`val`)
                if (cur.left != null) {
                    q.add(cur.left)
                }
                if (cur.right != null) {
                    q.add(cur.right)
                }
            }
            if (level % 2 != 0) {
                for (i in res.indices.reversed()) {
                    list.add(res[i])
                }
            } else {
                list.addAll(res)
            }
            level++
        }
    }
}
