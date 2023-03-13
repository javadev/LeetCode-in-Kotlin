package g0701_0800.s0790_domino_and_tromino_tiling

class Solution {
    fun numTilings(n: Int): Int {
        val result = when (n) {
            1 -> 1
            2 -> 2
            3 -> 5
            4 -> 11
            5 -> 24
            else -> {
                val dp = LongArray(n + 1)
                dp[0] = 0
                dp[1] = 1
                dp[2] = 2
                dp[3] = 5
                dp[4] = 11
                dp[5] = 24
                dp[6] = 53
                for (i in 7..n) {
                    dp[i] = (dp[i - 1] * 2 + dp[i - 3]) % 1000000007
                }
                return dp[n].toInt() % 1000000007
            }
        }

        return result
    }
}
