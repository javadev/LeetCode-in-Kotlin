package g4001_4100.s4040_minimum_operations_to_form_subset_sum_i

// #Medium #Array #Dynamic_Programming #Staff #Weekly_Contest_517
// #2026_11_25_Time_64_ms_(91.80%)_Space_46.09_MB_(90.16%)

import kotlin.math.min

class Solution {
    fun minOperations(nums: IntArray, sum: Int): Int {
        var dp = IntArray(sum + 1)
        dp.fill(INF)
        dp[0] = 0
        for (x in nums) {
            val next = dp.clone()
            var value = x.toLong()
            var cost = 0
            while (value <= sum) {
                val v = value.toInt()
                for (s in v..sum) {
                    if (dp[s - v] != INF) {
                        next[s] = min(next[s], dp[s - v] + cost)
                    }
                }
                value *= 2
                cost++
            }
            value = x.toLong()
            cost = 0
            while (value > 1) {
                value /= 2
                cost++
                val v = value.toInt()
                for (s in v..sum) {
                    if (dp[s - v] != INF) {
                        next[s] = min(next[s], dp[s - v] + cost)
                    }
                }
            }
            dp = next
        }
        return if (dp[sum] == INF) -1 else dp[sum]
    }

    companion object {
        private const val INF = 1000000
    }
}
