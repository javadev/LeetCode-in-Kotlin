package g2601_2700.s2642_design_graph_with_shortest_path_calculator

import java.util.PriorityQueue

class Graph(n: Int, edges: Array<IntArray>) {
    private val adj = HashMap<Int, ArrayList<Pair<Int, Int>>>().apply {
        for (i in 0 until n)
            this[i] = ArrayList<Pair<Int, Int>>()

        for ((u, v, cost) in edges) {
            this[u] = getOrDefault(u, ArrayList<Pair<Int, Int>>()).apply { this.add(v to cost) }
        }
    }

    fun addEdge(edge: IntArray) {
        val (u, v, cost) = edge
        adj[u] = adj.getOrDefault(u, ArrayList<Pair<Int, Int>>()).apply { this.add(v to cost) }
    }

    fun shortestPath(node1: Int, node2: Int): Int {
        val minHeap = PriorityQueue<Pair<Int, Int>> { a, b -> a.second - b.second }
        val distance = IntArray(adj.size) { Integer.MAX_VALUE }
        minHeap.add(node1 to 0)
        distance[node1] = 0
        while (minHeap.isNotEmpty()) {
            val (node, cost) = minHeap.poll()
            if (node == node2) return cost
            if (cost > distance[node]) continue
            adj[node]?.let {
                for ((next, nextCost) in adj[node]!!) {
                    if (cost + nextCost < distance[next]) {
                        distance[next] = cost + nextCost
                        minHeap.add(next to cost + nextCost)
                    }
                }
            }
        }
        return -1
    }
}

/*
 * Your Graph object will be instantiated and called as such:
 * var obj = Graph(n, edges)
 * obj.addEdge(edge)
 * var param_2 = obj.shortestPath(node1,node2)
 */
