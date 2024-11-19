package g2301_2400.s2360_longest_cycle_in_a_graph

// #Hard #Depth_First_Search #Graph #Topological_Sort
// #2023_07_02_Time_517_ms_(80.00%)_Space_59.3_MB_(100.00%)

class Solution {
    fun longestCycle(edges: IntArray): Int {
        val n = edges.size
        val vis = BooleanArray(n)
        val dfsvis = BooleanArray(n)
        val path = IntArray(n)
        var maxLength = -1
        for (i in 0 until n) {
            if (!vis[i]) {
                path[i] = 1
                maxLength = Math.max(maxLength, dfs(i, 1, path, vis, dfsvis, edges))
            }
        }
        return maxLength
    }

    private fun dfs(
        node: Int,
        pathLength: Int,
        path: IntArray,
        vis: BooleanArray,
        dfsvis: BooleanArray,
        edges: IntArray,
    ): Int {
        vis[node] = true
        dfsvis[node] = true
        var length = -1
        if (edges[node] != -1 && !vis[edges[node]]) {
            path[edges[node]] = pathLength + 1
            length = dfs(edges[node], pathLength + 1, path, vis, dfsvis, edges)
        } else if (edges[node] != -1 && dfsvis[edges[node]]) {
            length = pathLength - path[edges[node]] + 1
        }
        dfsvis[node] = false
        return length
    }
}
