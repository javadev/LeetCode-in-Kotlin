package g0701_0800.s0743_network_delay_time

// #Medium #Depth_First_Search #Breadth_First_Search #Heap_Priority_Queue #Graph #Shortest_Path
// #2023_03_04_Time_321_ms_(98.55%)_Space_46.4_MB_(94.20%)

import java.util.LinkedList
import java.util.Queue

class Solution {
    fun networkDelayTime(times: Array<IntArray>, n: Int, k: Int): Int {
        val graph = Array(n + 1) { IntArray(n + 1) }
        for (g in graph) {
            g.fill(-1)
        }
        for (t in times) {
            graph[t[0]][t[1]] = t[2]
        }
        val visited = BooleanArray(n + 1)
        val dist = IntArray(n + 1)
        dist.fill(Int.MAX_VALUE)
        dist[k] = 0
        val spf: Queue<Int> = LinkedList()
        spf.add(k)
        visited[k] = true
        while (!spf.isEmpty()) {
            val curr = spf.poll()
            visited[curr] = false
            for (i in 1..n) {
                if (graph[curr][i] != -1 && dist[i] > dist[curr] + graph[curr][i]) {
                    dist[i] = dist[curr] + graph[curr][i]
                    if (!visited[i]) {
                        spf.add(i)
                        visited[i] = true
                    }
                }
            }
        }
        var result = 0
        for (i in 1..n) {
            result = dist[i].coerceAtLeast(result)
        }
        return if (result == Int.MAX_VALUE) -1 else result
    }
}
