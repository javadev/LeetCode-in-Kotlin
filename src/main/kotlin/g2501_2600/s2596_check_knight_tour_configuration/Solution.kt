package g2501_2600.s2596_check_knight_tour_configuration

// #Medium #Array #Matrix #Simulation #Depth_First_Search #Breadth_First_Search
// #2023_07_12_Time_179_ms_(100.00%)_Space_39.1_MB_(100.00%)

class Solution {
    fun checkValidGrid(grid: Array<IntArray>): Boolean {
        if (grid[0][0] != 0) {
            return false
        }
        val n = grid.size
        val m = grid[0].size
        val rmove = intArrayOf(2, 2, -2, -2, 1, 1, -1, -1)
        val cmove = intArrayOf(1, -1, 1, -1, 2, -2, 2, -2)
        var cnt = 0
        for (i in 0 until n) {
            for (j in 0 until m) {
                val `val` = grid[i][j]
                var isPoss = false
                for (d in 0..7) {
                    val r = i + rmove[d]
                    val c = j + cmove[d]
                    if (r >= 0 && c >= 0 && r < n && c < m && grid[r][c] == `val` + 1) {
                        isPoss = true
                    }
                }
                if (!isPoss) {
                    cnt++
                }
                if (cnt > 1) return false
            }
        }
        return true
    }
}
