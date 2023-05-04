package g0901_1000.s0960_delete_columns_to_make_sorted_iii

// #Hard #Array #String #Dynamic_Programming
// #2023_05_04_Time_200_ms_(100.00%)_Space_38.1_MB_(100.00%)

class Solution {
    fun minDeletionSize(strs: Array<String>): Int {
        val n = strs[0].length
        val dp = Array(n + 1) { IntArray(2) }
        for (i in 1..n) {
            dp[i][0] = 1 + dp[i - 1][0].coerceAtMost(dp[i - 1][1])
            var min = i - 1
            var j: Int = i - 1
            while (j > 0) {
                var lexico = true
                for (str in strs) {
                    if (str[i - 1] < str[j - 1]) {
                        lexico = false
                        break
                    }
                }
                if (lexico) {
                    min = min.coerceAtMost(dp[j][1] + i - j - 1)
                }
                j--
            }
            dp[i][1] = min
        }
        return dp[n][0].coerceAtMost(dp[n][1])
    }
}
