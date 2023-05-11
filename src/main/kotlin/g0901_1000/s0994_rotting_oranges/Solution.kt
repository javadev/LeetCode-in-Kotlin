package g0901_1000.s0994_rotting_oranges

// #Medium #Array #Breadth_First_Search #Matrix
// #Algorithm_I_Day_9_Breadth_First_Search_Depth_First_Search #Level_2_Day_10_Graph/BFS/DFS
// #2022_09_13_Time_308_ms_(57.93%)_Space_41.8_MB_(26.83%)

import java.util.LinkedList
import java.util.Queue

class Solution {
    fun orangesRotting(grid: Array<IntArray>): Int {
        val queue: Queue<IntArray> = LinkedList()
        val row = grid.size
        val col: Int = grid[0].size
        var countActive = 0
        for (i in 0 until row) {
            for (j in 0 until col) {
                if (grid[i][j] == 2) {
                    queue.add(intArrayOf(i, j))
                }
                if (grid[i][j] != 0) {
                    countActive++
                }
            }
        }
        if (countActive == 0) {
            return 0
        }
        var countCurrent = 0
        var count = 0
        val dx = intArrayOf(0, 0, 1, -1)
        val dy = intArrayOf(1, -1, 0, 0)
        while (queue.isNotEmpty()) {
            val size: Int = queue.size
            count += size
            for (i in 0 until size) {
                val arr: IntArray = queue.poll()
                for (j in 0..3) {
                    val x = arr[0] + dx[j]
                    val y = arr[1] + dy[j]
                    if (x < 0 || y < 0 || x >= row || y >= col || grid[x][y] != 1) {
                        continue
                    }
                    grid[x][y] = 2
                    queue.add(intArrayOf(x, y))
                }
            }
            if (queue.isNotEmpty()) {
                countCurrent++
            }
        }
        return if (countActive == count) countCurrent else -1
    }
}
