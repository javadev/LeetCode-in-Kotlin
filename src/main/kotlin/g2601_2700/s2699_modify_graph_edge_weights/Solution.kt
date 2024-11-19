package g2601_2700.s2699_modify_graph_edge_weights

// #Hard #Heap_Priority_Queue #Graph #Shortest_Path
// #2023_07_29_Time_1592_ms_(40.00%)_Space_65.3_MB_(60.00%)

import java.util.PriorityQueue

class Solution {
    private inner class Edge(var s: Int, var d: Int, var wt: Int)
    private lateinit var g: Array<ArrayList<Edge>?>
    private var n = 0
    private var t = 0
    fun modifiedGraphEdges(
        n: Int,
        edges: Array<IntArray>,
        source: Int,
        destination: Int,
        target: Int,
    ): Array<IntArray> {
        this.n = n
        g = arrayOfNulls(n)
        t = target
        for (i in 0 until n) {
            g[i] = ArrayList()
        }
        for (e in edges) {
            val s = e[0]
            val d = e[1]
            val wt = e[2]
            if (wt == -1) continue
            g[s]!!.add(Edge(s, d, wt))
            g[d]!!.add(Edge(d, s, wt))
        }
        val inc = shortestPath(source, destination)
        if (inc != -1 && inc < target) return Array(0) { IntArray(0) }
        if (inc == target) {
            ntomax(edges)
            return edges
        }
        for (e in edges) {
            if (e[2] == -1) {
                e[2] = 1
                val s = e[0]
                val d = e[1]
                val wt = e[2]
                g[s]!!.add(Edge(s, d, wt))
                g[d]!!.add(Edge(d, s, wt))
                val cost = shortestPath(source, destination)
                if (cost == -1) continue
                if (cost < target) {
                    e[2] = target - cost + 1
                    ntomax(edges)
                    return edges
                }
                if (cost == target) {
                    ntomax(edges)
                    return edges
                }
            }
        }
        return Array(0) { IntArray(0) }
    }

    private fun ntomax(edges: Array<IntArray>) {
        for (e in edges) {
            if (e[2] == -1) {
                e[2] = 1000000000
            }
        }
    }

    private inner class Pair(var s: Int, var cost: Int) : Comparable<Pair?> {
        override operator fun compareTo(other: Pair?): Int {
            return cost - other!!.cost
        }
    }

    private fun shortestPath(s: Int, d: Int): Int {
        val q = PriorityQueue<Pair>()
        q.add(Pair(s, 0))
        val vis = BooleanArray(n)
        while (q.isNotEmpty()) {
            val rem = q.remove()
            vis[rem.s] = true
            if (rem.s == d) return rem.cost
            for (e in g[rem.s]!!) {
                if (!vis[e.d]) {
                    q.add(Pair(e.d, rem.cost + e.wt))
                }
            }
        }
        return -1
    }
}
