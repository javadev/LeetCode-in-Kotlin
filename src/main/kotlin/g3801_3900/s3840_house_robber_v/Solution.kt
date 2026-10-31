package g3801_3900.s3840_house_robber_v

// #Medium #Array #Dynamic_Programming #Staff #Biweekly_Contest_176
// #2026_07_21_Time_2_ms_(100.00%)_Space_153.66_MB_(42.76%)

import kotlin.math.max

class Solution {
    fun rob(nums: IntArray, colors: IntArray): Long {
        val n = nums.size
        var dp0: Long = 0
        var dp1 = nums[0].toLong()
        for (i in 1..<n) {
            val new0: Long
            val new1: Long
            if (colors[i] == colors[i - 1]) {
                new1 = dp0 + nums[i]
                new0 = max(dp0, dp1)
            } else {
                new0 = max(dp1, dp0)
                new1 = max(dp0, dp1) + nums[i]
            }
            dp0 = new0
            dp1 = new1
        }
        return max(dp0, dp1)
    }
}
