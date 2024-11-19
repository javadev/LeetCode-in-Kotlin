package g2901_3000.s2919_minimum_increment_operations_to_make_array_beautiful

// #Medium #Array #Dynamic_Programming #2023_12_31_Time_520_ms_(62.50%)_Space_80.7_MB_(25.00%)

import kotlin.math.max
import kotlin.math.min

class Solution {
    fun minIncrementOperations(nums: IntArray, k: Int): Long {
        val dp = LongArray(nums.size)
        dp[0] = max(0, (k - nums[0]).toLong())
        dp[1] = max(0, (k - nums[1]).toLong())
        dp[2] = max(0, (k - nums[2]).toLong())
        for (i in 3 until nums.size) {
            dp[i] = (
                max(0, k - nums[i]) + min(
                    min(
                        dp[i - 3],
                        dp[i - 2],
                    ),
                    dp[i - 1],
                )
                )
        }
        return min(
            min(dp[nums.size - 3], dp[nums.size - 2]),
            dp[nums.size - 1],
        )
    }
}
