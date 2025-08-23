package g3601_3700.s3654_minimum_sum_after_divisible_sum_deletions

// #Medium #Weekly_Contest_463 #2025_08_17_Time_17_ms_(98.16%)_Space_60.80_MB_(48.62%)

import kotlin.math.min

class Solution {
    fun minArraySum(nums: IntArray, k: Int): Long {
        val dp = LongArray(k)
        dp.fill(Long.Companion.MAX_VALUE)
        dp[0] = 0
        var res: Long = 0
        for (a in nums) {
            res += a.toLong()
            val index = (res % k).toInt()
            dp[index] = min(dp[index], res)
            res = dp[index]
        }
        return res
    }
}
