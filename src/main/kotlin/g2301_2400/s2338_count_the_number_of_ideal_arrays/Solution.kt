package g2301_2400.s2338_count_the_number_of_ideal_arrays

// #Hard #Dynamic_Programming #Math #Number_Theory #Combinatorics
// #2023_07_01_Time_201_ms_(100.00%)_Space_37.8_MB_(100.00%)

import kotlin.math.ln

class Solution {
    fun idealArrays(n: Int, maxValue: Int): Int {
        val mod = (1e9 + 7).toInt()
        val maxDistinct = (ln(maxValue.toDouble()) / ln(2.0)).toInt() + 1
        val dp = Array(maxDistinct + 1) { IntArray(maxValue + 1) }
        dp[1].fill(1)
        dp[1][0] = 0
        for (i in 2..maxDistinct) {
            for (j in 1..maxValue) {
                var k = 2
                while (j * k <= maxValue && dp[i - 1][j * k] != 0) {
                    dp[i][j] += dp[i - 1][j * k]
                    k++
                }
            }
        }
        val sum = IntArray(maxDistinct + 1)
        for (i in 1..maxDistinct) {
            sum[i] = dp[i].sum()
        }
        val invs = LongArray(n.coerceAtMost(maxDistinct) + 1)
        invs[1] = 1
        for (i in 2 until invs.size) {
            invs[i] = mod - mod / i * invs[mod % i] % mod
        }
        var result = maxValue.toLong()
        var comb = n.toLong() - 1
        var i = 2
        while (i <= maxDistinct && i <= n) {
            result += sum[i] * comb % mod
            comb *= (n - i).toLong()
            comb %= mod.toLong()
            comb *= invs[i]
            comb %= mod.toLong()
            i++
        }
        return (result % mod).toInt()
    }
}