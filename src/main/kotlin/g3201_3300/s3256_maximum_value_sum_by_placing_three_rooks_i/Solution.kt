package g3201_3300.s3256_maximum_value_sum_by_placing_three_rooks_i

// #Hard #Array #Dynamic_Programming #Matrix #Enumeration
// #2024_08_21_Time_279_ms_(100.00%)_Space_41.6_MB_(93.33%)

import kotlin.math.max

class Solution {
    fun maximumValueSum(board: Array<IntArray>): Long {
        val n = board.size
        val m = board[0].size
        val tb = Array(n) { IntArray(m) }
        tb[0] = board[0].copyOf(m)
        for (i in 1 until n) {
            for (j in 0 until m) {
                tb[i][j] = max(tb[i - 1][j], board[i][j])
            }
        }
        val bt = Array(n) { IntArray(m) }
        bt[n - 1] = board[n - 1].copyOf(m)
        for (i in n - 2 downTo 0) {
            for (j in 0 until m) {
                bt[i][j] = max(bt[i + 1][j], board[i][j])
            }
        }
        var ans = Long.MIN_VALUE
        for (i in 1 until n - 1) {
            val max3Top = getMax3(tb[i - 1])
            val max3Cur = getMax3(board[i])
            val max3Bottom = getMax3(bt[i + 1])
            for (topCand in max3Top) {
                for (curCand in max3Cur) {
                    for (bottomCand in max3Bottom) {
                        if (topCand[1] != curCand[1] && topCand[1] != bottomCand[1] && curCand[1] != bottomCand[1]) {
                            val cand = topCand[0].toLong() + curCand[0] + bottomCand[0]
                            ans = max(ans, cand)
                        }
                    }
                }
            }
        }
        return ans
    }

    private fun getMax3(row: IntArray): Array<IntArray> {
        val m = row.size
        val ans = Array(3) { IntArray(2) }
        ans.fill(intArrayOf(Int.MIN_VALUE, -1))
        for (j in 0 until m) {
            if (row[j] >= ans[0][0]) {
                ans[2] = ans[1]
                ans[1] = ans[0]
                ans[0] = intArrayOf(row[j], j)
            } else if (row[j] >= ans[1][0]) {
                ans[2] = ans[1]
                ans[1] = intArrayOf(row[j], j)
            } else if (row[j] > ans[2][0]) {
                ans[2] = intArrayOf(row[j], j)
            }
        }
        return ans
    }
}
