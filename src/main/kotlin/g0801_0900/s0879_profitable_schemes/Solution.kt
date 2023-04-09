package g0801_0900.s0879_profitable_schemes

// #Hard #Array #Dynamic_Programming #2023_04_08_Time_198_ms_(75.00%)_Space_35.5_MB_(100.00%)

class Solution {
    fun profitableSchemes(n: Int, minProfit: Int, group: IntArray, profit: IntArray): Int {
        val dp = Array(n + 1) { LongArray(minProfit + 1) }
        val modulus = 1000000007L
        for (i in dp.indices) {
            dp[i][0] = 1
        }
        for (i in group.indices) {
            val currWorker = group[i]
            val currProfit = profit[i]
            for (j in dp.size - 1 downTo currWorker) {
                for (k in dp[j].indices.reversed()) {
                    dp[j][k] = (
                        (dp[j][k] + dp[j - currWorker][(k - currProfit).coerceAtLeast(0)]) %
                            modulus
                        )
                }
            }
        }
        return dp[n][minProfit].toInt()
    }
}
