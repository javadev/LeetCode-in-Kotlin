package g2101_2200.s2127_maximum_employees_to_be_invited_to_a_meeting

// #Hard #Depth_First_Search #Graph #Topological_Sort
// #2023_06_25_Time_572_ms_(100.00%)_Space_58.1_MB_(100.00%)

import java.util.LinkedList
import java.util.Queue

class Solution {
    fun maximumInvitations(favorite: IntArray): Int {
        if (favorite.isEmpty()) return 0
        val n = favorite.size
        var cycle = 0
        var cycleDepth = 0
        val indegree = IntArray(n)
        val depth = IntArray(n)
        val visited = BooleanArray(n)
        val q: Queue<Int> = LinkedList()
        for (i in 0 until n) {
            indegree[favorite[i]]++
            depth[i] = 1
        }
        for (i in 0 until n) {
            if (indegree[i] == 0) {
                q.add(i)
                visited[i] = true
            }
        }
        while (q.isNotEmpty()) {
            val curr = q.poll()
            val next = favorite[curr]
            indegree[next]--
            if (indegree[next] == 0) {
                q.add(next)
                visited[next] = true
            }
            depth[next] = depth[curr] + 1
        }
        for (i in 0 until n) {
            if (visited[i]) continue
            var j = i
            var count = 0
            while (!visited[j]) {
                visited[j] = true
                j = favorite[j]
                count++
            }
            if (count > 2) {
                cycle = Math.max(cycle, count)
            } else {
                cycleDepth += depth[i] + depth[favorite[i]]
            }
        }
        return Math.max(cycle, cycleDepth)
    }
}
