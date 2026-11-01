package g3901_4000.s3952_maximum_total_value_of_covered_indices

// #Medium #Array #String #Dynamic_Programming #Greedy #Staff #Biweekly_Contest_184
// #2026_10_20_Time_8_ms_(93.94%)_Space_127.68_MB_(89.39%)

import kotlin.math.min

class Solution {
    fun maxTotal(nums: IntArray, s: String): Long {
        val n = nums.size
        var mn = 100000
        var res: Long = 0
        for (i in n - 1 downTo 0) {
            res += nums[i].toLong()
            mn = min(mn, nums[i])
            if (s[i] == '0') {
                res -= mn.toLong()
                mn = 100000
            }
        }
        return res
    }
}
