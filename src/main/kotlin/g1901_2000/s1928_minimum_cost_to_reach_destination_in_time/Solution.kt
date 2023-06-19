package g1901_2000.s1928_minimum_cost_to_reach_destination_in_time

import java.util.PriorityQueue

// #Hard #Dynamic_Programming #Graph
class Solution {
    fun minCost(maxTime: Int, edges: Array<IntArray>, passingFees: IntArray): Int {
        val pq = PriorityQueue { a: Tuple, b: Tuple -> if (a.cost == b.cost) a.time - b.time else a.cost - b.cost }
        val n = passingFees.size
        val minTime = IntArray(n)
        minTime.fill(Int.MAX_VALUE)
        val graph = Graph()
        for (edge in edges) {
            graph.addEdge(edge[0], edge[1], edge[2])
        }
        pq.offer(Tuple(0, passingFees[0], 0))
        while (!pq.isEmpty()) {
            val curr = pq.poll()
            if (curr.time <= maxTime && curr.time < minTime[curr.node]) {
                minTime[curr.node] = curr.time
                if (curr.node == n - 1) {
                    return curr.cost
                }
                for (edge in graph.getEdges(curr.node)) {
                    val time = curr.time + edge.weight
                    if (time > maxTime || time >= minTime[edge.dst]) {
                        continue
                    }
                    pq.offer(Tuple(edge.dst, curr.cost + passingFees[edge.dst], time))
                }
            }
        }
        return -1
    }

    private class Graph {
        private val edges: MutableMap<Int, MutableList<Edge>> = HashMap()
        fun addEdge(src: Int, dst: Int, weight: Int) {
            edges.computeIfAbsent(src) { _: Int? -> ArrayList() }.add(Edge(dst, weight))
            edges.computeIfAbsent(dst) { _: Int? -> ArrayList() }.add(Edge(src, weight))
        }

        fun getEdges(node: Int): List<Edge> {
            return edges.getOrDefault(node, ArrayList())
        }
    }

    private class Edge(val dst: Int, val weight: Int)
    private class Tuple(val node: Int, val cost: Int, val time: Int)
}
