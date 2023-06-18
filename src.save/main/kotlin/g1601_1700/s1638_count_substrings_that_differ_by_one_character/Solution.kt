package g1601_1700.s1638_count_substrings_that_differ_by_one_character

// #Medium #String #Hash_Table #Dynamic_Programming
// #2023_06_17_Time_143_ms_(100.00%)_Space_34.5_MB_(100.00%)

class Solution {
    fun countSubstrings(s: String, t: String): Int {
        var ans = 0
        val n = s.length
        val m = t.length
        val dp = Array(n + 1) { IntArray(m + 1) }
        val tp = Array(n + 1) { IntArray(m + 1) }
        for (i in n - 1 downTo 0) {
            for (j in m - 1 downTo 0) {
                if (s[i] == t[j]) {
                    dp[i][j] = dp[i + 1][j + 1] + 1
                    tp[i][j] = tp[i + 1][j + 1]
                } else {
                    tp[i][j] = dp[i + 1][j + 1] + 1
                }
                ans += tp[i][j]
            }
        }
        return ans
    }
}
