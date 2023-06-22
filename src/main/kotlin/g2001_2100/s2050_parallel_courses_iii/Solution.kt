package g2001_2100.s2050_parallel_courses_iii

import java.util.ArrayDeque
import java.util.Queue

// #Hard #Dynamic_Programming #Graph #Topological_Sort
class Solution {
    fun minimumTime(n: Int, relations: Array<IntArray>, time: IntArray): Int {
        val v = time.size
        val adj: MutableList<MutableList<Int>> = ArrayList()
        for (i in 0 until v) {
            adj.add(ArrayList())
        }
        val indegree = IntArray(v)
        val requiredTime = IntArray(v)
        for (relation in relations) {
            val vertices = adj[relation[0] - 1]
            vertices.add(relation[1] - 1)
            indegree[relation[1] - 1]++
        }
        val q: Queue<Int> = ArrayDeque()
        for (i in 0 until v) {
            if (indegree[i] == 0) {
                q.add(i)
                requiredTime[i] = time[i]
            }
        }
        while (q.isNotEmpty()) {
            val vertex = q.poll()
            val edges: List<Int> = adj[vertex]
            for (e in edges) {
                indegree[e]--
                if (indegree[e] == 0) {
                    q.add(e)
                }
                val totalTime = time[e] + requiredTime[vertex]
                if (requiredTime[e] < totalTime) {
                    requiredTime[e] = totalTime
                }
            }
        }
        var maxMonth = 0
        for (i in 0 until n) {
            maxMonth = Math.max(maxMonth, requiredTime[i])
        }
        return maxMonth
    }
}
