package g2301_2400.s2327_number_of_people_aware_of_a_secret

// #Medium #Dynamic_Programming #Simulation #Queue
// #2023_07_01_Time_121_ms_(100.00%)_Space_35.3_MB_(100.00%)

class Solution {
    fun peopleAwareOfSecret(n: Int, delay: Int, forget: Int): Int {
        val dp = Array(n + forget) { LongArray(3) }
        // 0: people who currently know the secret (includes [1] below)
        // 1: people who start sharing the secret on this day
        // 2: people who forget on this day
        val mod = 1e9.toLong() + 7
        dp[forget][2] = 1
        dp[delay][1] = dp[forget][2]
        dp[0][0] = dp[delay][1]
        for (i in 1 until n) {
            // dp[i][1] was originally just the i - delay newcomers
            dp[i][1] = (dp[i][1] + dp[i - 1][1] - dp[i][2] + mod) % mod
            // these people forget on i + forget day
            dp[i + forget][2] = dp[i][1]
            // these people start sharing on i + delay day
            dp[i + delay][1] = dp[i][1]
            // today's total people who know the secret
            dp[i][0] = (dp[i - 1][0] + dp[i][1] - dp[i][2] + mod) % mod
        }
        return dp[n - 1][0].toInt()
    }
}
