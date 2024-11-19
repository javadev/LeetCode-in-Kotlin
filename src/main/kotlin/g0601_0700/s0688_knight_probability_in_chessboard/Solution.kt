package g0601_0700.s0688_knight_probability_in_chessboard

// #Medium #Dynamic_Programming #2023_02_20_Time_144_ms_(100.00%)_Space_34.9_MB_(100.00%)

class Solution {
    private val directions = arrayOf(
        intArrayOf(-2, -1),
        intArrayOf(-2, 1),
        intArrayOf(-1, 2),
        intArrayOf(1, 2),
        intArrayOf(2, -1),
        intArrayOf(2, 1),
        intArrayOf(1, -2),
        intArrayOf(-1, -2),
    )
    private lateinit var probabilityGiven: Array<Array<DoubleArray>>
    fun knightProbability(n: Int, k: Int, row: Int, column: Int): Double {
        probabilityGiven = Array(n) {
            Array(n) {
                DoubleArray(
                    k + 1,
                )
            }
        }
        return probability(row, column, k, n)
    }

    private fun probability(row: Int, column: Int, k: Int, n: Int): Double {
        return if (k == 0) {
            1.0
        } else if (probabilityGiven[row][column][k] != 0.0) {
            probabilityGiven[row][column][k]
        } else {
            var p = 0.0
            for (dir in directions) {
                if (isValid(row + dir[0], column + dir[1], n)) {
                    p += probability(row + dir[0], column + dir[1], k - 1, n)
                }
            }
            probabilityGiven[row][column][k] = p / 8.0
            probabilityGiven[row][column][k]
        }
    }

    private fun isValid(row: Int, column: Int, n: Int): Boolean {
        return row in 0 until n && column >= 0 && column < n
    }
}
