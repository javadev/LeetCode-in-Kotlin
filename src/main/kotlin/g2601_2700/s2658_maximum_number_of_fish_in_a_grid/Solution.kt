package g2601_2700.s2658_maximum_number_of_fish_in_a_grid

// #Medium #Array #Matrix #Union_Find #Depth_First_Search #Breadth_First_Search
// #2023_07_21_Time_269_ms_(80.00%)_Space_45.4_MB_(80.00%)

class Solution {
    fun findMaxFish(grid: Array<IntArray>): Int {
        val visited = Array(grid.size) { BooleanArray(grid[0].size) }
        val dir = arrayOf(
            intArrayOf(0, 1),
            intArrayOf(0, -1),
            intArrayOf(1, 0),
            intArrayOf(-1, 0)
        )

        fun isValid(x: Int, y: Int) = x in (0..grid.lastIndex) && y in (0..grid[0].lastIndex) &&
            grid[x][y] != 0 && !visited[x][y]

        fun dfs(x: Int, y: Int): Int {
            if (!isValid(x, y)) {
                return 0
            }
            visited[x][y] = true
            var total = grid[x][y]
            for (d in dir) {
                total += dfs(x + d[0], y + d[1])
            }
            return total
        }

        var res = 0
        for (i in grid.indices) {
            for (j in grid[0].indices) {
                if (grid[i][j] != 0)
                    res = maxOf(res, dfs(i, j))
            }
        }

        return res
    }
}
