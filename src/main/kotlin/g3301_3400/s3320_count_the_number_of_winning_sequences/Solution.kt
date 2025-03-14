package g3301_3400.s3320_count_the_number_of_winning_sequences

// #Hard #String #Dynamic_Programming #2024_10_15_Time_335_ms_(100.00%)_Space_78.8_MB_(66.67%)

class Solution {
    fun countWinningSequences(s: String): Int {
        val n = s.length
        val dp = Array<Array<IntArray>>(n) { Array<IntArray>(3) { IntArray(2 * n + 1) } }
        if (s[0] == 'F') {
            dp[0][0][n] = 1
            dp[0][1][1 + n] = 1
            dp[0][2][-1 + n] = 1
        } else if (s[0] == 'W') {
            dp[0][0][-1 + n] = 1
            dp[0][1][n] = 1
            dp[0][2][1 + n] = 1
        } else if (s[0] == 'E') {
            dp[0][0][1 + n] = 1
            dp[0][1][-1 + n] = 1
            dp[0][2][n] = 1
        }
        for (i in 1 until n) {
            if (s[i] == 'F') {
                for (j in 0 until 2 * n + 1) {
                    dp[i][0][j] = (dp[i - 1][1][j] + dp[i - 1][2][j]) % MOD
                }
                for (j in 1 until 2 * n + 1) {
                    dp[i][1][j] = (dp[i - 1][0][j - 1] + dp[i - 1][2][j - 1]) % MOD
                }
                for (j in 0 until 2 * n) {
                    dp[i][2][j] = (dp[i - 1][0][j + 1] + dp[i - 1][1][j + 1]) % MOD
                }
            } else if (s[i] == 'W') {
                for (j in 0 until 2 * n + 1) {
                    dp[i][1][j] = (dp[i - 1][0][j] + dp[i - 1][2][j]) % MOD
                }
                for (j in 1 until 2 * n + 1) {
                    dp[i][2][j] = (dp[i - 1][0][j - 1] + dp[i - 1][1][j - 1]) % MOD
                }
                for (j in 0 until 2 * n) {
                    dp[i][0][j] = (dp[i - 1][1][j + 1] + dp[i - 1][2][j + 1]) % MOD
                }
            } else if (s[i] == 'E') {
                for (j in 0 until 2 * n) {
                    dp[i][2][j] = (dp[i - 1][0][j] + dp[i - 1][1][j]) % MOD
                }
                for (j in 1 until 2 * n + 1) {
                    dp[i][0][j] = (dp[i - 1][1][j - 1] + dp[i - 1][2][j - 1]) % MOD
                }
                for (j in 0 until 2 * n) {
                    dp[i][1][j] = (dp[i - 1][0][j + 1] + dp[i - 1][2][j + 1]) % MOD
                }
            }
        }
        var count = 0
        for (j in n + 1 until 2 * n + 1) {
            count = (count + dp[n - 1][0][j]) % MOD
            count = (count + dp[n - 1][1][j]) % MOD
            count = (count + dp[n - 1][2][j]) % MOD
        }
        return count % MOD
    }

    companion object {
        private const val MOD = 1e9.toInt() + 7
    }
}
