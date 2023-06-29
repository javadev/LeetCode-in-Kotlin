package g2301_2400.s2312_selling_pieces_of_wood

// #Hard #Backtracking #2023_06_29_Time_396_ms_(100.00%)_Space_55.6_MB_(100.00%)

class Solution {
    fun sellingWood(m: Int, n: Int, prices: Array<IntArray>): Long {
        // dp[i][j] = Maximum profit selling wood of size i*j
        val dp = Array(m) { LongArray(n) }
        for (price in prices) {
            dp[price[0] - 1][price[1] - 1] = dp[price[0] - 1][price[1] - 1].coerceAtLeast(price[2].toLong())
        }
        for (i in 0 until m) {
            for (j in 0 until n) {
                // Cut Vertically
                for (k in 0 until j) {
                    dp[i][j] = dp[i][j].coerceAtLeast(dp[i][k] + dp[i][j - k - 1])
                }
                // Cut Horizontally
                for (k in 0 until i) {
                    dp[i][j] = dp[i][j].coerceAtLeast(dp[k][j] + dp[i - k - 1][j])
                }
            }
        }
        return dp[m - 1][n - 1]
    }
}
