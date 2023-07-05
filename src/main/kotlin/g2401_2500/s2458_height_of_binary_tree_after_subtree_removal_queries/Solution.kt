package g2401_2500.s2458_height_of_binary_tree_after_subtree_removal_queries

// #Hard #Array #Depth_First_Search #Breadth_First_Search #Tree #Binary_Tree
// #2023_07_05_Time_951_ms_(80.00%)_Space_118.6_MB_(80.00%)

import com_github_leetcode.TreeNode

class Solution {
    fun treeQueries(root: TreeNode?, queries: IntArray): IntArray {
        val levels: MutableMap<Int, IntArray> = HashMap()
        val map: MutableMap<Int, IntArray> = HashMap()
        val max = dfs(root, 0, map, levels) - 1
        val n = queries.size
        for (i in 0 until n) {
            val q = queries[i]
            val node = map[q]
            val height = node!![0]
            val level = node[1]
            val lev = levels[level]
            if (lev!![0] == height) {
                if (lev[1] != -1) {
                    queries[i] = max - Math.abs(lev[0] - lev[1])
                } else {
                    queries[i] = max - height - 1
                }
            } else {
                queries[i] = max
            }
        }
        return queries
    }

    private fun dfs(
        root: TreeNode?,
        level: Int,
        map: MutableMap<Int, IntArray>,
        levels: MutableMap<Int, IntArray>
    ): Int {
        if (root == null) {
            return 0
        }
        val left = dfs(root.left, level + 1, map, levels)
        val right = dfs(root.right, level + 1, map, levels)
        val height = Math.max(left, right)
        val lev = levels.getOrDefault(level, intArrayOf(-1, -1))
        if (height >= lev[0]) {
            lev[1] = lev[0]
            lev[0] = height
        } else {
            lev[1] = Math.max(lev[1], height)
        }
        levels[level] = lev
        map[root.`val`] = intArrayOf(height, level)
        return Math.max(left, right) + 1
    }
}
