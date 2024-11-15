package g3301_3400.s3352_count_k_reducible_numbers_less_than_n

// #Hard #String #Dynamic_Programming #Math #Combinatorics
// #2024_11_15_Time_170_ms_(100.00%)_Space_34.9_MB_(100.00%)

class Solution {
    fun countKReducibleNumbers(s: String, k: Int): Int {
        val n = s.length
        val reducible = IntArray(n + 1)
        for (i in 2.rangeUntil(reducible.size)) {
            reducible[i] = 1 + reducible[Integer.bitCount(i)]
        }
        val dp = LongArray(n + 1)
        var curr = 0
        for (i in 0.rangeUntil(n)) {
            for (j in i - 1 downTo 0) {
                dp[j + 1] += dp[j]
                dp[j + 1] %= MOD.toLong()
            }
            if (s.get(i) == '1') {
                dp[curr]++
                dp[curr] %= MOD.toLong()
                curr++
            }
        }
        var result: Long = 0
        for (i in 1..s.length) {
            if (reducible[i] < k) {
                result += dp[i]
                result %= MOD.toLong()
            }
        }
        return (result % MOD).toInt()
    }

    companion object {
        private val MOD = (1e9 + 7).toInt()
    }
}
