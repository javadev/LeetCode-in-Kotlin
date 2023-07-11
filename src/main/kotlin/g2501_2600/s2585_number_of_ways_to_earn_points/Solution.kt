package g2501_2600.s2585_number_of_ways_to_earn_points

// #Hard #Array #Dynamic_Programming #2023_07_11_Time_263_ms_(100.00%)_Space_39.2_MB_(100.00%)

class Solution {
    fun waysToReachTarget(target: Int, types: Array<IntArray>): Int {
        val kMod = 1000000007
        val dp = Array(types.size + 1) { IntArray(target + 1) }
        dp[0][0] = 1
        for (i in 1..types.size) {
            val count = types[i - 1][0]
            val mark = types[i - 1][1]
            for (j in 0..target) for (solved in 0..count) if (j - solved * mark >= 0) {
                dp[i][j] += dp[i - 1][j - solved * mark]
                dp[i][j] %= kMod
            }
        }
        return dp[types.size][target]
    }
}
