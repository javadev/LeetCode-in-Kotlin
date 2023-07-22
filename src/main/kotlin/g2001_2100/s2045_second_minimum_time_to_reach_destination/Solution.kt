package g2001_2100.s2045_second_minimum_time_to_reach_destination

// #Hard #Breadth_First_Search #Graph #Shortest_Path
// #2023_06_23_Time_862_ms_(100.00%)_Space_57.2_MB_(100.00%)

import java.util.LinkedList
import java.util.Queue

class Solution {
    fun secondMinimum(n: Int, edges: Array<IntArray>, time: Int, change: Int): Int {
        val adj: Array<MutableList<Int>?> = arrayOfNulls(n)
        for (i in adj.indices) {
            adj[i] = ArrayList()
        }
        for (edge in edges) {
            val p = edge[0] - 1
            val q = edge[1] - 1
            adj[p]?.add(q)
            adj[q]?.add(p)
        }
        val dis1 = IntArray(n)
        val dis2 = IntArray(n)
        dis1.fill(Int.MAX_VALUE)
        dis2.fill(Int.MAX_VALUE)
        dis1[0] = 0
        val queue: Queue<IntArray> = LinkedList()
        queue.offer(intArrayOf(0, 0))
        while (queue.isNotEmpty()) {
            val temp = queue.poll()
            val cur = temp[0]
            val path = temp[1]
            for (node in adj[cur]!!) {
                val newPath = path + 1
                if (newPath < dis1[node]) {
                    dis2[node] = dis1[node]
                    dis1[node] = newPath
                    queue.offer(intArrayOf(node, newPath))
                } else if (newPath > dis1[node] && newPath < dis2[node]) {
                    dis2[node] = newPath
                    queue.offer(intArrayOf(node, newPath))
                }
            }
        }
        return helper(dis2[n - 1], time, change)
    }

    private fun helper(pathValue: Int, time: Int, change: Int): Int {
        var sum = 0
        for (i in 0 until pathValue) {
            sum += time
            if (i == pathValue - 1) {
                break
            }
            if (sum / change % 2 != 0) {
                sum = (sum / change + 1) * change
            }
        }
        return sum
    }
}
