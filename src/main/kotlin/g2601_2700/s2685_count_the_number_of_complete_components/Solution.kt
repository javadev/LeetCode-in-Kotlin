package g2601_2700.s2685_count_the_number_of_complete_components

// #Medium #Array #Dynamic_Programming #Depth_First_Search #Breadth_First_Search #Matrix #Graph
// #2023_07_28_Time_436_ms_(100.00%)_Space_58.6_MB_(66.67%)

@Suppress("NAME_SHADOWING")
class Solution {
    fun countCompleteComponents(n: Int, edges: Array<IntArray>): Int {
        val adj = HashMap<Int, ArrayList<Int>>().apply {
            for ((u, v) in edges) {
                this[u] = getOrDefault(u, arrayListOf()).apply { add(v) }
                this[v] = getOrDefault(v, arrayListOf()).apply { add(u) }
            }
        }
        val visited = BooleanArray(n)
        fun bfs(i: Int): Pair<Int, Int> {
            if (visited[i]) return 0 to 0
            visited[i] = true
            var nodes = 1
            var edges = (adj[i]?.size ?: 0)
            adj[i]?.forEach {
                val (nodes2, edges2) = bfs(it)
                nodes += nodes2
                edges += edges2
            }
            return nodes to edges
        }
        var res = 0
        for (i in 0 until n) {
            if (!visited[i]) {
                val (nodes, edges) = bfs(i)
                if ((nodes * (nodes - 1)) == edges) {
                    res++
                }
            }
        }
        return res
    }
}
