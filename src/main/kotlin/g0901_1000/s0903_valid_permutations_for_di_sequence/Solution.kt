package g0901_1000.s0903_valid_permutations_for_di_sequence

// #Hard #Dynamic_Programming #2023_04_13_Time_140_ms_(100.00%)_Space_34.9_MB_(100.00%)

class Solution {
    fun numPermsDISequence(s: String): Int {
        val n = s.length
        val mod = 1e9.toInt() + 7
        val dp = Array(n + 1) { IntArray(n + 1) }
        for (j in 0..n) {
            dp[0][j] = 1
        }
        for (i in 0 until n) {
            var cur = 0
            if (s[i] == 'I') {
                for (j in 0 until n - i) {
                    cur = (cur + dp[i][j]) % mod
                    dp[i + 1][j] = cur
                }
            } else {
                for (j in n - i - 1 downTo 0) {
                    cur = (cur + dp[i][j + 1]) % mod
                    dp[i + 1][j] = cur
                }
            }
        }
        return dp[n][0]
    }
}
