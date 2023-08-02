package g2601_2700.s2617_minimum_number_of_visited_cells_in_a_grid

// #Hard #Array #Dynamic_Programming #Binary_Search #Stack #Union_Find #Segment_Tree
// #Binary_Indexed_Tree #2023_07_14_Time_1255_ms_(100.00%)_Space_99.7_MB_(100.00%)

import java.util.LinkedList
import java.util.Queue

class Solution {
    fun minimumVisitedCells(grid: Array<IntArray>): Int {
        val len = Array(grid.size) { IntArray(grid[0].size) }
        for (ints in len) {
            ints.fill(-1)
        }
        val q: Queue<IntArray> = LinkedList()
        q.add(intArrayOf(0, 0))
        len[0][0] = 1
        while (q.isNotEmpty()) {
            val tmp = q.poll()
            val i = tmp[0]
            val j = tmp[1]
            var c = 0
            for (k in Math.min(grid[0].size - 1, grid[i][j] + j) downTo j + 1) {
                if (len[i][k] != -1) {
                    c++
                    if (c > LIMIT) {
                        break
                    }
                } else {
                    len[i][k] = len[i][j] + 1
                    q.add(intArrayOf(i, k))
                }
            }
            if (len[grid.size - 1][grid[0].size - 1] != -1) {
                return len[grid.size - 1][grid[0].size - 1]
            }
            c = 0
            for (k in Math.min(grid.size - 1, grid[i][j] + i) downTo i + 1) {
                if (len[k][j] != -1) {
                    c++
                    if (c > LIMIT) {
                        break
                    }
                } else {
                    len[k][j] = len[i][j] + 1
                    q.add(intArrayOf(k, j))
                }
            }
            if (len[grid.size - 1][grid[0].size - 1] != -1) {
                return len[grid.size - 1][grid[0].size - 1]
            }
        }
        return -1
    }

    companion object {
        private const val LIMIT = 2
    }
}
