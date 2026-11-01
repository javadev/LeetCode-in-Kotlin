package g3901_4000.s3928_minimum_cost_to_buy_apples_ii

// #Hard #Array #Heap_Priority_Queue #Shortest_Path #Graph_Theory #Senior_Staff #Weekly_Contest_501
// #2026_09_29_Time_694_ms_(97.40%)_Space_49.62_MB_(84.42%)

import java.util.PriorityQueue

class Solution {
    fun minCost(n: Int, prices: IntArray, roads: Array<IntArray>): IntArray {
        val adj = adjacency(n, roads)
        val ans = prices.copyOf(n)
        for (i in 0..<n) {
            val forward = shortestPath(adj, i, prices[i], true)
            val backward = shortestPath(adj, i, prices[i], false)
            for (j in 0..<n) {
                if (j != i && forward[j] != Long.MAX_VALUE && backward[j] != Long.MAX_VALUE) {
                    val d = forward[j] + prices[j] + backward[j]
                    if (d < ans[i]) {
                        ans[i] = d.toInt()
                    }
                }
            }
        }
        return ans
    }

    private fun shortestPath(
        adj: MutableList<MutableList<Edge>?>,
        src: Int,
        maxPrice: Int,
        forward: Boolean,
    ): LongArray {
        val dist = LongArray(adj.size)
        dist.fill(Long.MAX_VALUE)
        dist[src] = 0L
        val pq = PriorityQueue<Distance>()
        pq.offer(Distance(src, dist[src]))
        while (pq.isNotEmpty() && pq.peek().dist <= maxPrice) {
            val distance = pq.poll()
            if (distance.dist > dist[distance.node]) {
                continue
            }
            for (edge in adj[distance.node]!!) {
                val d = if (forward) edge.forward else edge.backward
                if (dist[edge.node] > dist[distance.node] + d) {
                    dist[edge.node] = dist[distance.node] + d
                    pq.offer(Distance(edge.node, dist[edge.node]))
                }
            }
        }
        return dist
    }

    private fun adjacency(n: Int, roads: Array<IntArray>): MutableList<MutableList<Edge>?> {
        val adj: MutableList<MutableList<Edge>?> = ArrayList<MutableList<Edge>?>()
        for (i in 0..<n) {
            adj.add(ArrayList<Edge>())
        }
        for (r in roads) {
            val f = r[2].toLong()
            val b = f * r[3]
            adj[r[0]]!!.add(Edge(r[1], f, b))
            adj[r[1]]!!.add(Edge(r[0], f, b))
        }
        return adj
    }

    private class Edge(val node: Int, val forward: Long, val backward: Long)

    private class Distance(val node: Int, val dist: Long) : Comparable<Distance> {
        override fun compareTo(other: Distance): Int = this.dist.compareTo(other.dist)
    }
}
