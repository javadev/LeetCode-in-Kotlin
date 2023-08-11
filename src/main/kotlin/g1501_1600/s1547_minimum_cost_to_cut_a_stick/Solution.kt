package g1501_1600.s1547_minimum_cost_to_cut_a_stick

// #Hard #Array #Dynamic_Programming #2023_06_12_Time_187_ms_(92.00%)_Space_37.5_MB_(95.00%)

class Solution {
    fun minCost(n: Int, cuts: IntArray): Int {
        cuts.sort()
        val m = cuts.size
        val dp = Array(m + 1) { IntArray(m + 1) }
        for (i in 1..m) {
            for (j in 0..m - i) {
                val k = j + i
                var min = Int.MAX_VALUE
                for (p in j until k) {
                    min = Math.min(min, dp[j][p] + dp[p + 1][k])
                }
                val len = (if (k == m) n else cuts[k]) - if (j == 0) 0 else cuts[j - 1]
                dp[j][k] = min + len
            }
        }
        return dp[0][m]
    }
}
