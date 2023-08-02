package g1401_1500.s1411_number_of_ways_to_paint_n_3_grid

// #Hard #Dynamic_Programming #2023_06_07_Time_201_ms_(100.00%)_Space_37.1_MB_(100.00%)

class Solution {
    fun numOfWays(n: Int): Int {
        val dp = Array(n + 1) { IntArray(12) }
        dp[1].fill(1)
        val transfer = arrayOf(
            intArrayOf(5, 6, 8, 9, 10), intArrayOf(5, 8, 7, 9, -1),
            intArrayOf(5, 6, 9, 10, 12), intArrayOf(6, 10, 11, 12, -1), intArrayOf(1, 2, 3, 11, 12),
            intArrayOf(1, 3, 4, 11, -1), intArrayOf(2, 9, 10, 12, -1), intArrayOf(1, 2, 10, 11, 12),
            intArrayOf(1, 2, 3, 7, -1), intArrayOf(1, 3, 4, 7, 8), intArrayOf(4, 5, 6, 8, -1),
            intArrayOf(3, 4, 5, 7, 8)
        )
        for (i in 2..n) {
            for (j in 0..11) {
                val prevStates = transfer[j]
                var sum = 0
                for (s in prevStates) {
                    if (s == -1) {
                        break
                    }
                    sum = (sum + dp[i - 1][s - 1]) % MOD
                }
                dp[i][j] = sum
            }
        }
        var total = 0
        for (i in 0..11) {
            total = (total + dp[n][i]) % MOD
        }
        return total
    }

    companion object {
        private const val MOD = 1000000007
    }
}
