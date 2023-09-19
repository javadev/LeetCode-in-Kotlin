package g2601_2700.s2684_maximum_number_of_moves_in_a_grid

// #Medium #Array #Dynamic_Programming #Matrix
// #2023_09_19_Time_509_ms_(100.00%)_Space_67.9_MB_(25.00%)

class Solution {
    fun maxMoves(grid: Array<IntArray>): Int {
        val h = grid.size
        var dp1 = BooleanArray(h)
        var dp2 = BooleanArray(h)
        var rtn = 0
        dp1.fill(true)
        for (col in 1 until grid[0].size) {
            var f = false
            for (row in 0 until h) {
                val pr = row - 1
                val nr = row + 1
                dp2[row] = false
                if (pr >= 0 && dp1[pr] && grid[pr][col - 1] < grid[row][col]) {
                    dp2[row] = true
                    f = true
                }
                if (nr < h && dp1[nr] && grid[nr][col - 1] < grid[row][col]) {
                    dp2[row] = true
                    f = true
                }
                if (dp1[row] && grid[row][col - 1] < grid[row][col]) {
                    dp2[row] = true
                    f = true
                }
            }
            val t = dp1
            dp1 = dp2
            dp2 = t
            if (!f) break
            rtn++
        }
        return rtn
    }
}
