package g0901_1000.s0994_rotting_oranges

// #Medium #Top_100_Liked_Questions #Array #Breadth_First_Search #Matrix
// #Algorithm_I_Day_9_Breadth_First_Search_Depth_First_Search #Level_2_Day_10_Graph/BFS/DFS
// #2023_05_22_Time_164_ms_(82.95%)_Space_36.2_MB_(49.61%)

class Solution {
    fun orangesRotting(grid: Array<IntArray>): Int {
        val queue = ArrayDeque<IntArray>()
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
                val arr: IntArray = queue.removeFirst()
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
