package g2901_3000.s2925_maximum_score_after_applying_operations_on_a_tree

// #Medium #Dynamic_Programming #Depth_First_Search #Tree
// #2024_01_16_Time_706_ms_(81.82%)_Space_84.7_MB_(27.27%)

import kotlin.math.min

class Solution {
    fun maximumScoreAfterOperations(edges: Array<IntArray>, values: IntArray): Long {
        var sum: Long = 0
        val n = values.size
        val adj: MutableList<MutableList<Int>> = ArrayList()
        for (i in 0 until n) {
            adj.add(ArrayList())
        }
        for (edge in edges) {
            adj[edge[0]].add(edge[1])
            adj[edge[1]].add(edge[0])
        }
        for (value in values) {
            sum += value.toLong()
        }
        val x = dfs(0, -1, adj, values)
        return sum - x
    }

    private fun dfs(node: Int, parent: Int, adj: List<MutableList<Int>>, values: IntArray): Long {
        if (adj[node].size == 1 && node != 0) {
            return values[node].toLong()
        }
        var sum: Long = 0
        for (child in adj[node]) {
            if (child != parent) {
                sum += dfs(child, node, adj, values)
            }
        }
        return min(sum, values[node].toLong())
    }
}
