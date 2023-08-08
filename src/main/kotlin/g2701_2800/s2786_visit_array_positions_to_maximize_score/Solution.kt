package g2701_2800.s2786_visit_array_positions_to_maximize_score

// #Medium #Array #Dynamic_Programming #2023_08_08_Time_625_ms_(84.00%)_Space_68.5_MB_(52.00%)

import kotlin.math.max

class Solution {
    fun maxScore(nums: IntArray, x: Int): Long {
        val dp = longArrayOf(-x.toLong(), -x.toLong())
        dp[nums[0] and 1] = nums[0].toLong()
        for (i in 1 until nums.size) {
            val toggle = dp[nums[i] and 1 xor 1] - x
            val nottoggle = dp[nums[i] and 1]
            dp[nums[i] and 1] = (max(toggle.toDouble(), nottoggle.toDouble()) + nums[i]).toLong()
        }
        return max(dp[0].toDouble(), dp[1].toDouble()).toLong()
    }
}
