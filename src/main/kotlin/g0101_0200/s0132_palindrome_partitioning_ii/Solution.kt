package g0101_0200.s0132_palindrome_partitioning_ii

// #Hard #String #Dynamic_Programming #2022_10_09_Time_290_ms_(100.00%)_Space_34.6_MB_(76.92%)

import java.util.Arrays

@Suppress("NAME_SHADOWING")
class Solution {
    fun minCut(s: String): Int {
        val n = s.length
        val t = s.toCharArray()
        val dp = IntArray(n + 1)
        Arrays.fill(dp, Int.MAX_VALUE)
        dp[0] = -1
        var i = 0
        while (i < n) {
            expandAround(t, i, i, dp)
            expandAround(t, i, i + 1, dp)
            i++
        }
        return dp[n]
    }

    private fun expandAround(t: CharArray, i: Int, j: Int, dp: IntArray) {
        var i = i
        var j = j
        while (i >= 0 && j < t.size && t[i] == t[j]) {
            dp[j + 1] = Math.min(dp[j + 1], dp[i] + 1)
            i--
            j++
        }
    }
}
