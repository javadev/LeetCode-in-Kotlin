package g2101_2200.s2146_k_highest_ranked_items_within_a_price_range

// #Medium #Array #Sorting #Breadth_First_Search #Matrix #Heap_Priority_Queue
// #2023_06_25_Time_1373_ms_(100.00%)_Space_78_MB_(100.00%)

import java.util.ArrayDeque
import java.util.Collections
import java.util.Deque

class Solution {
    fun highestRankedKItems(grid: Array<IntArray>, pricing: IntArray, start: IntArray, k: Int): List<List<Int>> {
        val m = grid.size
        val n = grid[0].size
        val row = start[0]
        val col = start[1]
        val low = pricing[0]
        val high = pricing[1]
        val items: MutableList<IntArray> = ArrayList()
        if (grid[row][col] in low..high) items.add(intArrayOf(0, grid[row][col], row, col))
        grid[row][col] = 0
        val q: Deque<IntArray> = ArrayDeque()
        q.offer(intArrayOf(row, col, 0))
        val dirs = intArrayOf(-1, 0, 1, 0, -1)
        while (q.isNotEmpty()) {
            val p = q.poll()
            val i = p[0]
            val j = p[1]
            val d = p[2]
            for (l in 0..3) {
                val x = i + dirs[l]
                val y = j + dirs[l + 1]
                if (x in 0 until m && y >= 0 && y < n && grid[x][y] > 0) {
                    if (grid[x][y] in low..high) {
                        items.add(intArrayOf(d + 1, grid[x][y], x, y))
                    }
                    grid[x][y] = 0
                    q.offer(intArrayOf(x, y, d + 1))
                }
            }
        }
        Collections.sort(items) { a: IntArray, b: IntArray ->
            if (a[0] != b[0]) return@sort a[0] - b[0]
            if (a[1] != b[1]) return@sort a[1] - b[1]
            if (a[2] != b[2]) return@sort a[2] - b[2]
            a[3] - b[3]
        }
        val ans: MutableList<List<Int>> = ArrayList()
        var i = 0
        while (i < items.size && i < k) {
            val p = items[i]
            ans.add(listOf(p[2], p[3]))
            ++i
        }
        return ans
    }
}
