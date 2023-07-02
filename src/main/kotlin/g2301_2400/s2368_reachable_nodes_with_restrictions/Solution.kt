package g2301_2400.s2368_reachable_nodes_with_restrictions

import java.util.ArrayDeque
import java.util.Queue

// #Medium #Array #Hash_Table #Depth_First_Search #Breadth_First_Search #Tree #Graph
class Solution {
    fun reachableNodes(n: Int, edges: Array<IntArray>, restricted: IntArray): Int {
        val graph: Array<MutableList<Int>?> = arrayOfNulls(n)
        for (i in 0 until n) {
            graph[i] = ArrayList()
        }
        for (edge in edges) {
            val src = edge[0]
            val dest = edge[1]
            graph[src]?.add(dest)
            graph[dest]?.add(src)
        }
        val q: Queue<Int> = ArrayDeque()
        val visited = BooleanArray(n)
        q.offer(0)
        visited[0] = true
        for (node in restricted) {
            visited[node] = true
        }
        var ans = 0
        while (q.isNotEmpty()) {
            val vertex = q.poll()
            ans++
            for (neighbour in graph[vertex]!!) {
                if (!visited[neighbour]) {
                    q.offer(neighbour)
                    visited[neighbour] = true
                }
            }
        }
        return ans
    }
}
