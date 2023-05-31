package g1101_1200.s1139_largest_1_bordered_square

// #Medium #Array #Dynamic_Programming #Matrix
// #2023_05_31_Time_224_ms_(100.00%)_Space_49.8_MB_(100.00%)

class Solution {
    fun largest1BorderedSquare(grid: Array<IntArray>): Int {
        val rightToLeft = arrayOfNulls<IntArray>(grid.size)
        val bottomToUp = arrayOfNulls<IntArray>(grid.size)
        for (i in grid.indices) {
            rightToLeft[i] = grid[i].clone()
            bottomToUp[i] = grid[i].clone()
        }
        val row = grid.size
        val col = grid[0].size
        for (i in 0 until row) {
            for (j in col - 2 downTo 0) {
                if (grid[i][j] == 1) {
                    rightToLeft[i]!![j] = rightToLeft[i]!![j + 1] + 1
                }
            }
        }
        for (j in 0 until col) {
            for (i in row - 2 downTo 0) {
                if (grid[i][j] == 1) {
                    bottomToUp[i]!![j] = bottomToUp[i + 1]!![j] + 1
                }
            }
        }
        var res = 0
        for (i in 0 until row) {
            for (j in 0 until col) {
                val curLen = rightToLeft[i]!![j]
                for (k in curLen downTo 1) {
                    if (bottomToUp[i]!![j] >= k && rightToLeft[i + k - 1]!![j] >= k &&
                        bottomToUp[i]!![j + k - 1] >= k
                    ) {
                        if (k > res) {
                            res = k
                        }
                        break
                    }
                }
            }
        }
        return res * res
    }
}
