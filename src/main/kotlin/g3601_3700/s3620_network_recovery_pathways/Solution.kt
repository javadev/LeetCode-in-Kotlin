package g3601_3700.s3620_network_recovery_pathways

// #Hard #Biweekly_Contest_161 #2025_07_22_Time_212_ms_(66.67%)_Space_150.09_MB_(13.33%)

import kotlin.math.max

class Solution {
    private fun topologicalSort(n: Int, g: List<List<Int>>): List<Int> {
        val indeg = IntArray(n)
        for (i in 0 until n) {
            for (adjNode in g[i]) {
                indeg[adjNode]++
            }
        }
        val q: Queue<Int> = LinkedList()
        val ts = ArrayList<Int>()
        for (i in 0 until n) {
            if (indeg[i] == 0) {
                q.offer(i)
            }
        }
        while (!q.isEmpty()) {
            val u = q.poll()
            ts.add(u)
            for (v in g[u]) {
                indeg[v]--
                if (indeg[v] == 0) {
                    q.offer(v)
                }
            }
        }
        return ts
    }

    private fun check(
        x: Int,
        n: Int,
        adj: List<List<IntArray>>,
        ts: List<Int>,
        online: BooleanArray,
        k: Long,
    ): Boolean {
        val d = LongArray(n)
        Arrays.fill(d, Long.MAX_VALUE)
        d[0] = 0
        for (u in ts) {
            if (d[u] != Long.MAX_VALUE) {
                for (p in adj[u]) {
                    val v = p[0]
                    val c = p[1]
                    if (c < x || !online[v]) {
                        continue
                    }
                    if (d[u] + c < d[v]) {
                        d[v] = d[u] + c
                    }
                }
            }
        }
        return d[n - 1] <= k
    }

    fun findMaxPathScore(edges: Array<IntArray>, online: BooleanArray, k: Long): Int {
        val n = online.size
        // Adjacency list for graph with edge weights
        val adj = ArrayList<ArrayList<IntArray>>()
        for (i in 0 until n) {
            adj.add(ArrayList())
        }
        val g = ArrayList<ArrayList<Int>>()
        for (i in 0 until n) {
            g.add(ArrayList())
        }
        for (e in edges) {
            val u = e[0]
            val v = e[1]
            val c = e[2]
            adj[u].add(intArrayOf(v, c))
            g[u].add(v)
        }
        val ts = topologicalSort(n, g)
        if (!check(0, n, adj, ts, online, k)) {
            return -1
        }
        var l = 0
        var h = 0
        for (e in edges) {
            h = max(h, e[2])
        }
        while (l < h) {
            val md = l + (h - l + 1) / 2
            if (check(md, n, adj, ts, online, k)) {
                l = md
            } else {
                h = md - 1
            }
        }
        return l
    }
}
