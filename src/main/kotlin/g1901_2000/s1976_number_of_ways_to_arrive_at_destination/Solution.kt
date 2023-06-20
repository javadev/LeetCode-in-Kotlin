package g1901_2000.s1976_number_of_ways_to_arrive_at_destination

import java.util.PriorityQueue
import java.util.Queue

// #Medium #Dynamic_Programming #Graph #Topological_Sort #Shortest_Path
class Solution {
    private fun dijkstra(roads: Array<IntArray>, n: Int): Int {
        val mod = 1e9.toInt() + 7L
        val pq: Queue<LongArray> = PriorityQueue(Comparator.comparingLong { l: LongArray -> l[1] })
        val ways = LongArray(n)
        val dist = LongArray(n)
        dist.fill(1e18.toLong())
        dist[0] = 0
        ways[0] = 1
        val graph: Array<ArrayList<LongArray>?> = arrayOfNulls<ArrayList<LongArray>>(n)
        for (i in graph.indices) {
            graph[i] = ArrayList()
        }
        for (road in roads) {
            graph[road[0]]?.add(longArrayOf(road[1].toLong(), road[2].toLong()))
            graph[road[1]]?.add(longArrayOf(road[0].toLong(), road[2].toLong()))
        }
        pq.add(longArrayOf(0, 0))
        if (!pq.isEmpty()) {
            while (!pq.isEmpty()) {
                val ele = pq.remove()
                val dis = ele[1]
                val node = ele[0]
                for (e in graph[node.toInt()]!!) {
                    val wt = e[1]
                    val adjNode = e[0]
                    if (wt + dis < dist[adjNode.toInt()]) {
                        dist[adjNode.toInt()] = wt + dis
                        ways[adjNode.toInt()] = ways[node.toInt()]
                        pq.add(longArrayOf(adjNode, dist[adjNode.toInt()]))
                    } else if (wt + dis == dist[adjNode.toInt()]) {
                        ways[adjNode.toInt()] = (ways[node.toInt()] + ways[adjNode.toInt()]) % mod
                    }
                }
            }
        }
        return ways[n - 1].toInt()
    }

    fun countPaths(n: Int, roads: Array<IntArray>): Int {
        return dijkstra(roads, n)
    }
}
