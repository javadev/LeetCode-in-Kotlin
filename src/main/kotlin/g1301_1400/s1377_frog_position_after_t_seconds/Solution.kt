package g1301_1400.s1377_frog_position_after_t_seconds

// #Hard #Depth_First_Search #Breadth_First_Search #Tree #Graph
// #2023_06_06_Time_221_ms_(100.00%)_Space_43.8_MB_(100.00%)

import java.util.LinkedList
import java.util.Queue

@Suppress("NAME_SHADOWING")
class Solution {
    fun frogPosition(n: Int, edges: Array<IntArray>, t: Int, target: Int): Double {
        var t = t
        val graph: Array<MutableList<Int>?> = arrayOfNulls(n)
        for (i in 0 until n) {
            graph[i] = ArrayList()
        }
        for (edge in edges) {
            graph[edge[0] - 1]?.add(edge[1] - 1)
            graph[edge[1] - 1]?.add(edge[0] - 1)
        }
        val visited = BooleanArray(n)
        visited[0] = true
        val probabilities = DoubleArray(n)
        probabilities[0] = 1.0
        val queue: Queue<Int> = LinkedList()
        queue.offer(0)
        while (queue.isNotEmpty() && t-- > 0) {
            for (i in queue.size downTo 1) {
                val vertex = queue.poll()
                var nextVerticesCount = 0
                for (next in graph[vertex]!!) {
                    if (!visited[next]) {
                        nextVerticesCount++
                    }
                }
                for (next in graph[vertex]!!) {
                    if (!visited[next] && nextVerticesCount > 0) {
                        visited[next] = true
                        queue.offer(next)
                        probabilities[next] = probabilities[vertex] / nextVerticesCount
                    }
                }
                if (nextVerticesCount > 0) {
                    probabilities[vertex] = 0.0
                }
            }
        }
        return probabilities[target - 1]
    }
}
