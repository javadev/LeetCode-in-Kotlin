package g2001_2100.s2065_maximum_path_quality_of_a_graph

// #Hard #Array #Graph #Backtracking #2023_06_26_Time_429_ms_(100.00%)_Space_46.7_MB_(100.00%)

class Solution {
    private var maxQuality = 0

    internal class Node(var i: Int, var time: Int)

    fun maximalPathQuality(values: IntArray, edges: Array<IntArray>, maxTime: Int): Int {
        val graph: MutableList<MutableList<Node>> = ArrayList()
        for (i in values.indices) {
            graph.add(ArrayList())
        }
        for (edge in edges) {
            val u = edge[0]
            val v = edge[1]
            val time = edge[2]
            val node1 = Node(u, time)
            val node2 = Node(v, time)
            graph[u].add(node2)
            graph[v].add(node1)
        }
        maxQuality = 0
        dfs(graph, 0, 0, maxTime, values[0], values)
        return maxQuality
    }

    private fun dfs(
        graph: List<MutableList<Node>>,
        start: Int,
        curTime: Int,
        maxTime: Int,
        curValue: Int,
        values: IntArray
    ) {
        if (curTime > maxTime) {
            return
        }
        if (curTime == maxTime && start != 0) {
            return
        }
        if (start == 0) {
            maxQuality = maxQuality.coerceAtLeast(curValue)
        }
        val tmp = values[start]
        if (tmp != 0) {
            values[start] = 0
        }
        for (node in graph[start]) {
            val v = node.i
            val time = node.time
            val value = values[v]
            if (value != 0) {
                values[v] = 0
            }
            dfs(graph, v, curTime + time, maxTime, curValue + value, values)
            if (value != 0) {
                values[v] = value
            }
        }
        if (tmp != 0) {
            values[start] = tmp
        }
    }
}
