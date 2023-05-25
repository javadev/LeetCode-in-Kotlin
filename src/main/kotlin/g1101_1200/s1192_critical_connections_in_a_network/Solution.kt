package g1101_1200.s1192_critical_connections_in_a_network

// #Hard #Depth_First_Search #Graph #Biconnected_Component

class Solution {
    fun criticalConnections(n: Int, connections: List<List<Int>>): List<List<Int>> {
        val graph: MutableList<MutableList<Int>> = ArrayList()
        for (i in 0 until n) {
            graph.add(ArrayList())
        }
        // build graph
        for (conn in connections) {
            val x = conn[0]
            val y = conn[1]
            graph[x].add(y)
            graph[y].add(x)
        }
        // record rank
        val rank = IntArray(n)
        // store result
        val res: MutableList<List<Int>> = ArrayList()
        dfs(graph, 0, 1, -1, rank, res)
        return res
    }

    // rank[] records the each node's smallest rank(min (it's natural rank, neighbors's smallest
    // rank))
    private fun dfs(
        graph: List<MutableList<Int>>,
        node: Int,
        time: Int,
        parent: Int,
        rank: IntArray,
        res: MutableList<List<Int>>
    ): Int {
        if (rank[node] > 0) {
            return rank[node]
        }
        // record the current natural rank for current node
        rank[node] = time
        for (nei in graph[node]) {
            // skip the parent, since this is undirected graph
            if (nei == parent) {
                continue
            }
            // step1 : run dfs to get the rank of this nei, if it is visited before, it will reach
            // base case immediately
            val neiTime = dfs(graph, nei, time + 1, node, rank, res)
            // if neiTime is strictly larger than current node's rank, there is no cycle,
            // connections between node and nei is a critically connection.
            if (neiTime > time) {
                res.add(listOf(nei, node))
            }
            // keep updating current node's rank with nei's smaller ranks
            rank[node] = Math.min(rank[node], neiTime)
        }
        // return current node's rank to caller
        return rank[node]
    }
}
