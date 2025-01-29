package g0601_0700.s0637_average_of_levels_in_binary_tree

// #Easy #Depth_First_Search #Breadth_First_Search #Tree #Binary_Tree
// #Top_Interview_150_Binary_Tree_BFS #2023_02_10_Time_249_ms_(100.00%)_Space_39.5_MB_(72.73%)

import com_github_leetcode.TreeNode

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
    fun averageOfLevels(root: TreeNode?): List<Double> {
        val map: MutableMap<Int, Array<Double>> = HashMap()
        helper(root, map, 0)
        val result: MutableList<Double> = ArrayList()
        for (pair in map.values) {
            val avg = pair[1] / pair[0]
            result.add(avg)
        }
        return result
    }

    private fun helper(root: TreeNode?, map: MutableMap<Int, Array<Double>>, level: Int) {
        if (root == null) {
            return
        }
        val pair = if (map.containsKey(level)) map[level]!! else arrayOf(0.0, 0.0)
        pair[0] += 1.0
        pair[1] = pair[1] + root.`val`
        map[level] = pair
        helper(root.left, map, level + 1)
        helper(root.right, map, level + 1)
    }
}
