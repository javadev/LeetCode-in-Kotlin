package g1701_1800.s1786_number_of_restricted_paths_from_first_to_last_node

import java.util.PriorityQueue

// #Medium #Dynamic_Programming #Heap_Priority_Queue #Graph #Topological_Sort #Shortest_Path
class Solution {
    private class Pair(var v: Int, var cwt: Int) : Comparable<Pair> {
        override fun compareTo(other: Pair): Int {
            return cwt - other.cwt
        }
    }

    private class Edge(var v: Int, var wt: Int)

    private lateinit var dtl: IntArray
    private lateinit var dp: IntArray

    fun countRestrictedPaths(n: Int, edges: Array<IntArray>): Int {
        val graph = buildGraph(n, edges)
        val pq = PriorityQueue<Pair>()
        val vis = BooleanArray(n + 1)
        dtl = IntArray(n + 1)
        pq.add(Pair(n, 0))
        while (!pq.isEmpty()) {
            val rem = pq.remove()
            if (vis[rem.v]) {
                continue
            }
            dtl[rem.v] = rem.cwt
            vis[rem.v] = true
            for (edge in graph[rem.v]) {
                if (!vis[edge.v]) {
                    pq.add(Pair(edge.v, rem.cwt + edge.wt))
                }
            }
        }
        dp = IntArray(n + 1)
        return dfs(graph, 1, BooleanArray(n + 1), n)
    }

    private fun dfs(graph: List<MutableList<Edge>>, vtx: Int, vis: BooleanArray, n: Int): Int {
        if (vtx == n) {
            return 1
        }
        var ans: Long = 0
        vis[vtx] = true
        for (edge in graph[vtx]) {
            if (!vis[edge.v] && dtl[edge.v] < dtl[vtx]) {
                val x = dfs(graph, edge.v, vis, n)
                ans = (ans + x) % M
            } else if (dtl[edge.v] < dtl[vtx] && vis[edge.v]) {
                ans = (ans + dp[edge.v]) % M
            }
        }
        dp[vtx] = ans.toInt()
        return ans.toInt()
    }

    private fun buildGraph(n: Int, edges: Array<IntArray>): List<MutableList<Edge>> {
        val graph: MutableList<MutableList<Edge>> = ArrayList()
        for (i in 0..n) {
            graph.add(ArrayList())
        }
        for (edge in edges) {
            val u = edge[0]
            val v = edge[1]
            val wt = edge[2]
            graph[u].add(Edge(v, wt))
            graph[v].add(Edge(u, wt))
        }
        return graph
    }

    companion object {
        private const val M = 1000000007
    }
}
