package g1101_1200.s1129_shortest_path_with_alternating_colors

// #Medium #Breadth_First_Search #Graph #Graph_Theory_I_Day_10_Standard_Traversal
// #2023_10_02_Time_208_ms_(80.00%)_Space_39.9_MB_(70.00%)

import java.util.LinkedList
import java.util.Queue

@Suppress("NAME_SHADOWING")
class Solution {
    private class Pair(var node: Int, var color: Int)

    private fun bfs(
        q: Queue<Int>,
        vis: Array<BooleanArray>,
        graph: List<MutableList<Pair>>,
        blue: Boolean,
        shortestPaths: IntArray,
    ) {
        var blue = blue
        var level = 0
        q.add(0)
        if (blue) {
            vis[0][1] = true
        } else {
            vis[0][0] = true
        }
        while (q.isNotEmpty()) {
            var size = q.size
            while (size-- > 0) {
                val curr = q.poll()
                shortestPaths[curr] = Math.min(level, shortestPaths[curr])
                for (nextNode in graph[curr]) {
                    if (nextNode.color == 1 && blue && !vis[nextNode.node][1]) {
                        q.add(nextNode.node)
                        vis[nextNode.node][1] = true
                    }
                    if (!blue && nextNode.color == 0 && !vis[nextNode.node][0]) {
                        q.add(nextNode.node)
                        vis[nextNode.node][0] = true
                    }
                }
            }
            blue = !blue
            level++
        }
    }

    fun shortestAlternatingPaths(n: Int, redEdges: Array<IntArray>, blueEdges: Array<IntArray>): IntArray {
        val graph: MutableList<MutableList<Pair>> = ArrayList()
        for (i in 0 until n) {
            graph.add(mutableListOf())
        }
        for (edge in redEdges) {
            val a = edge[0]
            val b = edge[1]
            // red -> 0
            graph[a].add(Pair(b, 0))
        }
        for (edge in blueEdges) {
            val u = edge[0]
            val v = edge[1]
            // blue -> 1
            graph[u].add(Pair(v, 1))
        }
        val shortestPaths = IntArray(n)
        val q: Queue<Int> = LinkedList()
        shortestPaths.fill(Int.MAX_VALUE)
        bfs(q, Array(n) { BooleanArray(2) }, graph, true, shortestPaths)
        bfs(q, Array(n) { BooleanArray(2) }, graph, false, shortestPaths)
        for (i in 0 until n) {
            if (shortestPaths[i] == Int.MAX_VALUE) {
                shortestPaths[i] = -1
            }
        }
        return shortestPaths
    }
}
