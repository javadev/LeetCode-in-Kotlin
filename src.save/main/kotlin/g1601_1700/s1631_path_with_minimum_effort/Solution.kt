package g1601_1700.s1631_path_with_minimum_effort

// #Medium #Array #Depth_First_Search #Breadth_First_Search #Binary_Search #Matrix
// #Heap_Priority_Queue #Union_Find #2023_06_17_Time_384_ms_(100.00%)_Space_39.5_MB_(100.00%)

import java.util.PriorityQueue
import kotlin.math.abs

class Solution {
    private class Pair internal constructor(var row: Int, var col: Int, var diff: Int) : Comparable<Pair> {
        override fun compareTo(other: Pair): Int {
            return diff - other.diff
        }
    }

    fun minimumEffortPath(heights: Array<IntArray>): Int {
        val n = heights.size
        val m = heights[0].size
        val pq = PriorityQueue<Pair>()
        pq.add(Pair(0, 0, 0))
        val vis = Array(n) { BooleanArray(m) }
        val dx = intArrayOf(-1, 0, 1, 0)
        val dy = intArrayOf(0, 1, 0, -1)
        var min = Int.MAX_VALUE
        while (pq.isNotEmpty()) {
            val p = pq.remove()
            val row = p.row
            val col = p.col
            val diff = p.diff
            if (vis[row][col]) {
                continue
            }
            vis[row][col] = true
            if (row == n - 1 && col == m - 1) {
                min = min.coerceAtMost(diff)
            }
            for (i in 0..3) {
                val r = row + dx[i]
                val c = col + dy[i]
                if (r < 0 || c < 0 || r >= n || c >= m || vis[r][c]) {
                    continue
                }
                pq.add(
                    Pair(
                        r, c,
                        diff.coerceAtLeast(
                            abs(
                                heights[r][c] - heights[row][col]
                            )
                        )
                    )
                )
            }
        }
        return min
    }
}
