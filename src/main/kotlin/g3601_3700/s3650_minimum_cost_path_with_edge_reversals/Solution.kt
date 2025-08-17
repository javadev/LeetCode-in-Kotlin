package g3601_3700.s3650_minimum_cost_path_with_edge_reversals

// #Medium #Biweekly_Contest_163 #2025_08_17_Time_51_ms_(99.85%)_Space_110.03_MB_(49.54%)

import java.util.PriorityQueue

class Solution {
    private var cnt = 0
    private lateinit var head: IntArray
    private lateinit var next: IntArray
    private lateinit var to: IntArray
    private lateinit var weight: IntArray

    private class Dist(var u: Int, var d: Int) : Comparable<Dist> {
        override fun compareTo(other: Dist): Int {
            return d.toLong().compareTo(other.d.toLong())
        }
    }

    private fun init(n: Int, m: Int) {
        head = IntArray(n)
        head.fill(-1)
        next = IntArray(m)
        to = IntArray(m)
        weight = IntArray(m)
    }

    private fun add(u: Int, v: Int, w: Int) {
        to[cnt] = v
        weight[cnt] = w
        next[cnt] = head[u]
        head[u] = cnt++
    }

    private fun dist(s: Int, t: Int, n: Int): Int {
        val queue: PriorityQueue<Dist> = PriorityQueue<Dist>()
        val dist = IntArray(n)
        dist.fill(INF)
        dist[s] = 0
        queue.add(Dist(s, dist[s]))
        while (queue.isNotEmpty()) {
            val d = queue.remove()
            val u = d.u
            if (dist[u] < d.d) {
                continue
            }
            if (u == t) {
                return dist[t]
            }
            var i = head[u]
            while (i != -1) {
                val v = to[i]
                val w = weight[i]
                if (dist[v] > dist[u] + w) {
                    dist[v] = dist[u] + w
                    queue.add(Dist(v, dist[v]))
                }
                i = next[i]
            }
        }
        return INF
    }

    fun minCost(n: Int, edges: Array<IntArray>): Int {
        val m = edges.size
        init(n, 2 * m)
        for (edge in edges) {
            val u = edge[0]
            val v = edge[1]
            val w = edge[2]
            add(u, v, w)
            add(v, u, 2 * w)
        }
        val ans = dist(0, n - 1, n)
        return if (ans == INF) -1 else ans
    }

    companion object {
        private const val INF = Int.Companion.MAX_VALUE / 2 - 1
    }
}
