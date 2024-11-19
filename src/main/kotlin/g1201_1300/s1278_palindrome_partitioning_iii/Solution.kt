package g1201_1300.s1278_palindrome_partitioning_iii

// #Hard #String #Dynamic_Programming #2023_06_08_Time_137_ms_(100.00%)_Space_35.4_MB_(50.00%)

class Solution {
    fun palindromePartition(s: String, k: Int): Int {
        val n = s.length
        val pal = Array(n + 1) { IntArray(n + 1) }
        fillPal(s, n, pal)
        val dp = Array(n + 1) { IntArray(k + 1) }
        for (row in dp) {
            row.fill(-1)
        }
        return calculateMinCost(s, 0, n, k, pal, dp)
    }

    private fun calculateMinCost(
        s: String,
        index: Int,
        n: Int,
        k: Int,
        pal: Array<IntArray>,
        dp: Array<IntArray>,
    ): Int {
        if (index == n) {
            return n
        }
        if (k == 1) {
            return pal[index][n - 1]
        }
        if (dp[index][k] != -1) {
            return dp[index][k]
        }
        var ans = Int.MAX_VALUE
        for (i in index until n) {
            ans = Math.min(ans, pal[index][i] + calculateMinCost(s, i + 1, n, k - 1, pal, dp))
        }
        dp[index][k] = ans
        return ans
    }

    private fun fillPal(s: String, n: Int, pal: Array<IntArray>) {
        for (gap in 0 until n) {
            var i = 0
            var j = gap
            while (j < n) {
                if (gap == 0) {
                    pal[i][i] = 0
                } else if (gap == 1) {
                    if (s[i] == s[i + 1]) {
                        pal[i][i + 1] = 0
                    } else {
                        pal[i][i + 1] = 1
                    }
                } else {
                    if (s[i] == s[j]) {
                        pal[i][j] = pal[i + 1][j - 1]
                    } else {
                        pal[i][j] = pal[i + 1][j - 1] + 1
                    }
                }
                i++
                j++
            }
        }
    }
}
