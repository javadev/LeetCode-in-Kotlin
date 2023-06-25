package g2101_2200.s2132_stamping_the_grid

// #Hard #Array #Greedy #Matrix #Prefix_Sum
// #2023_06_25_Time_1158_ms_(100.00%)_Space_103.6_MB_(100.00%)

class Solution {
    private fun canPaved(grid: Array<IntArray>, `is`: Int, js: Int, ie: Int, je: Int): Boolean {
        for (i in `is`..ie) {
            for (j in js..je) {
                if (grid[i][j] == 1) {
                    return true
                }
            }
        }
        return false
    }

    fun possibleToStamp(grid: Array<IntArray>, h: Int, w: Int): Boolean {
        val rl = grid[0].size
        for (i in grid.indices) {
            val row = grid[i]
            var prev = -1
            for (j in row.indices) {
                if (row[j] == 0) {
                    if (j + 1 < rl && row[j + 1] == 1 && j - w + 1 >= 0 &&
                        i + 1 < grid.size && grid[i + 1][j] == 1 && i - h + 1 >= 0 && canPaved(
                                grid,
                                i - h + 1,
                                j - w + 1,
                                i,
                                j
                            )
                    ) {
                        return false
                    }
                    continue
                }
                if (j - prev in 2..w) {
                    return false
                }
                prev = j
            }
            if (row.size - prev in 2..w) {
                return false
            }
        }
        for (i in 0 until rl) {
            var prev = -1
            for (j in grid.indices) {
                if (grid[j][i] == 0) {
                    continue
                }
                if (j - prev in 2..h) {
                    return false
                }
                prev = j
            }
            if (grid.size - prev in 2..h) {
                return false
            }
        }
        return true
    }
}
