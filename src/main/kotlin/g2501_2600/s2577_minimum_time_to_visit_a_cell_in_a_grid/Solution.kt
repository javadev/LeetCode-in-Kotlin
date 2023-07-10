package g2501_2600.s2577_minimum_time_to_visit_a_cell_in_a_grid

// #Hard #Array #Matrix #Heap_Priority_Queue #Graph #Shortest_Path #Breadth_First_Search
// #2023_07_10_Time_1446_ms_(100.00%)_Space_62.8_MB_(100.00%)

import java.util.HashMap
import java.util.PriorityQueue

class Solution {
    fun minimumTime(grid: Array<IntArray>): Int {
        if (grid[0][1] <= 1 || grid[1][0] <= 1) {
            val m = grid.size
            val n = grid[0].size
            val pq = PriorityQueue { a: IntArray, b: IntArray ->
                a[0] - b[0]
            }
            val dist: MutableMap<String, Int> = HashMap()
            pq.offer(intArrayOf(0, 0, 0))
            dist.put("0,0", 0)
            while (pq.isNotEmpty()) {
                val curr = pq.poll()
                val x = curr[0]
                val i = curr[1]
                val j = curr[2]
                if (i == m - 1 && j == n - 1) {
                    return x
                }
                val directions =
                    arrayOf(intArrayOf(i - 1, j), intArrayOf(i, j - 1), intArrayOf(i, j + 1), intArrayOf(i + 1, j))
                for (dir in directions) {
                    val ii = dir[0]
                    val jj = dir[1]
                    if (ii in 0 until m && jj >= 0 && jj < n) {
                        val xx = x + 1 + 0.coerceAtLeast((grid[ii][jj] - x) / 2 * 2)
                        val key = "$ii,$jj"
                        if (!dist.containsKey(key) || dist[key]!! > xx) {
                            pq.offer(intArrayOf(xx, ii, jj))
                            dist.put(key, xx)
                        }
                    }
                }
            }
        }
        return -1
    }
}
