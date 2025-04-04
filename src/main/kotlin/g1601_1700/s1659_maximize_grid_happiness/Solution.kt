package g1601_1700.s1659_maximize_grid_happiness

// #Hard #Dynamic_Programming #Bit_Manipulation #Bitmask #Memoization
// #2025_04_04_Time_44_ms_(100.00%)_Space_56.67_MB_(100.00%)

import kotlin.math.max

class Solution {
    private fun maxHappiness(
        index: Int,
        m: Int,
        n: Int,
        introverts: Int,
        extroverts: Int,
        board: Int,
        dp: Array<Array<Array<IntArray>>>,
        tmask: Int,
    ): Int {
        if (index >= m * n) {
            return 0
        }
        if (dp[index][introverts][extroverts][board] != 0) {
            return dp[index][introverts][extroverts][board]
        }
        var introScore = -1
        var extroScore = -1
        if (introverts > 0) {
            val newBoard = ((board shl 2) or INTROVERT) and tmask
            introScore =
                (
                    120 +
                        adjust(board, INTROVERT, n, index) +
                        maxHappiness(
                            index + 1,
                            m,
                            n,
                            introverts - 1,
                            extroverts,
                            newBoard,
                            dp,
                            tmask,
                        )
                    )
        }
        if (extroverts > 0) {
            val newBoard = ((board shl 2) or EXTROVERT) and tmask
            extroScore =
                (
                    40 +
                        adjust(board, EXTROVERT, n, index) +
                        maxHappiness(
                            index + 1,
                            m,
                            n,
                            introverts,
                            extroverts - 1,
                            newBoard,
                            dp,
                            tmask,
                        )
                    )
        }
        val newBoard = ((board shl 2) or NONE) and tmask
        val skip = maxHappiness(index + 1, m, n, introverts, extroverts, newBoard, dp, tmask)
        dp[index][introverts][extroverts][board] =
            max(skip, max(introScore, extroScore))
        return dp[index][introverts][extroverts][board]
    }

    private fun adjust(board: Int, thisIs: Int, col: Int, index: Int): Int {
        val shiftBy = 2 * (col - 1)
        var left = board and 0x03
        if (index % col == 0) {
            left = NONE
        }
        val up = (board shr shiftBy) and 0x03
        val combination = intArrayOf(left, up)
        var adjustment = 0
        for (neighbor in combination) {
            if (neighbor == NONE) {
                continue
            }
            if (neighbor == INTROVERT && thisIs == INTROVERT) {
                adjustment -= 60
            } else if (neighbor == INTROVERT && thisIs == EXTROVERT) {
                adjustment -= 10
            } else if (neighbor == EXTROVERT && thisIs == INTROVERT) {
                adjustment -= 10
            } else if (neighbor == EXTROVERT && thisIs == EXTROVERT) {
                adjustment += 40
            }
        }
        return adjustment
    }

    fun getMaxGridHappiness(m: Int, n: Int, introvertsCount: Int, extrovertsCount: Int): Int {
        val dp = Array<Array<Array<IntArray>>>(m * n) {
            Array<Array<IntArray>>(introvertsCount + 1) {
                Array<IntArray>(extrovertsCount + 1) { IntArray((1 shl (2 * n))) }
            }
        }
        val tmask = (1 shl (2 * n)) - 1
        return maxHappiness(0, m, n, introvertsCount, extrovertsCount, 0, dp, tmask)
    }

    companion object {
        private const val NONE = 0
        private const val INTROVERT = 1
        private const val EXTROVERT = 2
    }
}
