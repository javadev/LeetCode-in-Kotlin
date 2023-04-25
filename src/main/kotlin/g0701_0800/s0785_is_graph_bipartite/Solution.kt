package g0701_0800.s0785_is_graph_bipartite

// #Medium #Depth_First_Search #Breadth_First_Search #Graph #Union_Find
// #Graph_Theory_I_Day_14_Graph_Theory #2023_03_13_Time_215_ms_(82.35%)_Space_36.3_MB_(100.00%)

class Solution {
    fun isBipartite(graph: Array<IntArray>): Boolean {
        val n = graph.size
        val color = IntArray(n)
        for (i in 0 until n) {
            if (color[i] == 0 && !helper(graph, i, -1, color)) {
                return false
            }
        }
        return true
    }

    private fun helper(graph: Array<IntArray>, curr: Int, c: Int, color: IntArray): Boolean {
        if (color[curr] == c) {
            return true
        }
        color[curr] = c
        for (x in graph[curr]) {
            if (color[x] == c || !helper(graph, x, c * -1, color)) {
                return false
            }
        }
        return true
    }
}
