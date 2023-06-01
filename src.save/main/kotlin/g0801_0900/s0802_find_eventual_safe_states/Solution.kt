package g0801_0900.s0802_find_eventual_safe_states

// #Medium #Depth_First_Search #Breadth_First_Search #Graph #Topological_Sort
// #Graph_Theory_I_Day_9_Standard_Traversal
// #2023_03_16_Time_511_ms_(100.00%)_Space_65.1_MB_(58.33%)

class Solution {
    fun eventualSafeNodes(graph: Array<IntArray>): List<Int> {
        val res: MutableList<Int> = ArrayList()
        val vis = IntArray(graph.size)
        for (i in graph.indices) {
            if (dfs(graph, i, vis)) {
                res.add(i)
            }
        }
        return res
    }

    private fun dfs(graph: Array<IntArray>, src: Int, vis: IntArray): Boolean {
        if (vis[src] != 0) {
            return vis[src] == 2
        }
        vis[src] = 1
        for (x in graph[src]) {
            if (!dfs(graph, x, vis)) {
                return false
            }
        }
        vis[src] = 2
        return true
    }
}
