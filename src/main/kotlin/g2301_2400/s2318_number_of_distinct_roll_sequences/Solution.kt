package g2301_2400.s2318_number_of_distinct_roll_sequences

// #Hard #Dynamic_Programming #Memoization #2023_06_30_Time_441_ms_(100.00%)_Space_49.6_MB_(100.00%)

class Solution {
    private val memo = Array(10001) { Array(7) { IntArray(7) } }
    private val mod = 1000000007
    private val m = arrayOf(
        intArrayOf(1, 2, 3, 4, 5, 6),
        intArrayOf(2, 3, 4, 5, 6),
        intArrayOf(1, 3, 5),
        intArrayOf(1, 2, 4, 5),
        intArrayOf(1, 3, 5),
        intArrayOf(1, 2, 3, 4, 6),
        intArrayOf(1, 5)
    )

    fun distinctSequences(n: Int): Int {
        return dp(n, 0, 0)
    }

    private fun dp(n: Int, prev: Int, pprev: Int): Int {
        if (n == 0) {
            return 1
        }
        if (memo[n][prev][pprev] != 0) {
            return memo[n][prev][pprev]
        }
        var ans = 0
        for (x in m[prev]) {
            if (x != pprev) {
                ans = (ans + dp(n - 1, x, prev)) % mod
            }
        }
        memo[n][prev][pprev] = ans
        return ans
    }
}
