package g1801_1900.s1866_number_of_ways_to_rearrange_sticks_with_k_sticks_visible

// #Hard #Dynamic_Programming #Math #Combinatorics
class Solution {
    fun rearrangeSticks(n: Int, k: Int): Int {
        if (k > n || k < 1) {
            return 0
        }
        if (k == n) {
            return 1
        }
        var dp = LongArray(k + 1)
        dp.fill(1)
        var i = 1
        while (i + k <= n) {
            val dp2 = LongArray(k + 1)
            for (j in 1..k) {
                dp2[j] = (dp2[j - 1] + (i + j - 1) * dp[j]) % MOD
            }
            dp = dp2
            i++
        }
        return dp[k].toInt()
    }

    companion object {
        private const val MOD = 1000000007
    }
}
