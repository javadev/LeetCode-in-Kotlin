package g2801_2900.s2858_minimum_edge_reversals_so_every_node_is_reachable

// #Hard #Dynamic_Programming #Depth_First_Search #Breadth_First_Search #Graph
// #2023_12_21_Time_1161_ms_(100.00%)_Space_139.8_MB_(100.00%)

import java.util.LinkedList
import java.util.Queue

class Solution {
    fun minEdgeReversals(n: Int, edges: Array<IntArray>): IntArray {
        val nexts: Array<MutableList<IntArray>> = Array(n) { ArrayList() }
        for (edge in edges) {
            val u = edge[0]
            val v = edge[1]
            nexts[u].add(intArrayOf(1, v))
            nexts[v].add(intArrayOf(-1, u))
        }
        val res = IntArray(n)
        for (i in 0 until n) {
            res[i] = -1
        }
        res[0] = dfs(nexts, 0, -1)
        val queue: Queue<Int> = LinkedList()
        queue.add(0)
        while (queue.isNotEmpty()) {
            val index = queue.remove()
            val `val` = res[index]
            val next: List<IntArray> = nexts[index]
            for (node in next) {
                if (res[node[1]] == -1) {
                    if (node[0] == 1) {
                        res[node[1]] = `val` + 1
                    } else {
                        res[node[1]] = `val` - 1
                    }
                    queue.add(node[1])
                }
            }
        }
        return res
    }

    private fun dfs(nexts: Array<MutableList<IntArray>>, index: Int, pre: Int): Int {
        var res = 0
        val next: List<IntArray> = nexts[index]
        for (node in next) {
            if (node[1] != pre) {
                if (node[0] == -1) {
                    res++
                }
                res += dfs(nexts, node[1], index)
            }
        }
        return res
    }
}
