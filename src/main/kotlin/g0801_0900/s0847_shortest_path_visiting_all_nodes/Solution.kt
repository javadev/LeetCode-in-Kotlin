package g0801_0900.s0847_shortest_path_visiting_all_nodes

// #Hard #Dynamic_Programming #Breadth_First_Search #Bit_Manipulation #Graph #Bitmask
// #Graph_Theory_I_Day_10_Standard_Traversal
// #2023_03_29_Time_164_ms_(100.00%)_Space_35.8_MB_(88.89%)

import java.util.LinkedList
import java.util.Objects
import java.util.Queue

class Solution {
    fun shortestPathLength(graph: Array<IntArray>): Int {
        val target = (1 shl graph.size) - 1
        val q: Queue<IntArray> = LinkedList()
        for (i in graph.indices) {
            q.offer(intArrayOf(i, 1 shl i))
        }
        var steps = 0
        val visited = Array(graph.size) {
            BooleanArray(
                target + 1
            )
        }
        while (q.isNotEmpty()) {
            val size = q.size
            for (i in 0 until size) {
                val curr = q.poll()
                val currNode = Objects.requireNonNull(curr)[0]
                val currState = curr[1]
                if (currState == target) {
                    return steps
                }
                for (n in graph[currNode]) {
                    val newState = currState or (1 shl n)
                    if (visited[n][newState]) {
                        continue
                    }
                    visited[n][newState] = true
                    q.offer(intArrayOf(n, newState))
                }
            }
            ++steps
        }
        return -1
    }
}
