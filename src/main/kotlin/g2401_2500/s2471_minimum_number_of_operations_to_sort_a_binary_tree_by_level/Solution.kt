package g2401_2500.s2471_minimum_number_of_operations_to_sort_a_binary_tree_by_level

// #Medium #Breadth_First_Search #Tree #Binary_Tree
// #2025_03_14_Time_117_ms_(100.00%)_Space_72.60_MB_(_%)

import com_github_leetcode.TreeNode
import java.util.ArrayDeque

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
    fun minimumOperations(root: TreeNode): Int {
        val q = ArrayDeque<TreeNode>()
        var count = 0
        if (root.left != null && root.right != null && root.left!!.`val` > root.right!!.`val`) {
            count++
        }
        if (root.left != null) {
            q.add(root.left)
        }
        if (root.right != null) {
            q.add(root.right)
        }
        while (q.isNotEmpty()) {
            var size = q.size
            val al: MutableList<Int> = ArrayList()
            while (size-- > 0) {
                val node = q.poll()!!
                if (node.left != null) {
                    al.add(node.left!!.`val`)
                    q.add(node.left)
                }
                if (node.right != null) {
                    al.add(node.right!!.`val`)
                    q.add(node.right)
                }
            }
            count += helper(al)
        }
        return count
    }

    private fun helper(list: MutableList<Int>): Int {
        var swaps = 0
        val sorted = IntArray(list.size)
        for (i in sorted.indices) {
            sorted[i] = list[i]
        }
        sorted.sort()
        val ind: MutableMap<Int, Int> = HashMap()
        for (i in list.indices) {
            ind[list[i]] = i
        }
        for (i in list.indices) {
            if (list[i] != sorted[i]) {
                swaps++
                ind[list[i]] = ind[sorted[i]]!!
                list[ind[sorted[i]]!!] = list[i]
            }
        }
        return swaps
    }
}
