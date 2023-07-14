package g2601_2700.s2608_shortest_cycle_in_a_graph

// #Hard #Graph #Breadth_First_Search #2023_07_14_Time_1061_ms_(100.00%)_Space_54.9_MB_(100.00%)

import java.util.ArrayList
import java.util.HashSet
import java.util.LinkedList
import java.util.Queue

class Solution {
    private var min = Int.MAX_VALUE
    fun findShortestCycle(n: Int, edges: Array<IntArray>): Int {
        val adj: MutableList<MutableList<Int>> = ArrayList()
        for (i in 0 until n) adj.add(ArrayList())
        for (edge in edges) {
            adj[edge[0]].add(edge[1])
            adj[edge[1]].add(edge[0])
        }
        for (i in 0 until n) {
            dfs(adj, HashSet<Int?>(), i)
        }
        return if (min == Int.MAX_VALUE) -1 else min
    }

    private fun dfs(adj: List<MutableList<Int>>, set: HashSet<Int?>, node: Int) {
        val queue: Queue<IntArray> = LinkedList()
        set.add(node)
        queue.add(intArrayOf(node, node))
        val distance = IntArray(adj.size)
        distance.fill(-1)
        distance[node] = 0
        while (queue.isNotEmpty()) {
            val arr: IntArray = queue.poll()
            val topNode = arr[0]
            val from = arr[1]
            for (i in adj[topNode]) {
                if (i == from) continue
                if (set.contains(i)) {
                    min = min.coerceAtMost(distance[topNode] + distance[i] + 1)
                    continue
                }
                set.add(i)
                distance[i] = distance[topNode] + 1
                queue.add(intArrayOf(i, topNode))
            }
        }
    }
}
