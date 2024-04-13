package g3101_3200.s3105_longest_strictly_increasing_or_strictly_decreasing_subarray

// #Easy #Array #2024_04_13_Time_159_ms_(94.00%)_Space_36.4_MB_(92.00%)

import kotlin.math.max

class Solution {
    fun longestMonotonicSubarray(nums: IntArray): Int {
        var inc = 1
        var dec = 1
        var res = 1
        for (i in 1 until nums.size) {
            if (nums[i] > nums[i - 1]) {
                inc += 1
                dec = 1
            } else if (nums[i] < nums[i - 1]) {
                dec += 1
                inc = 1
            } else {
                inc = 1
                dec = 1
            }
            res = max(res, max(inc, dec))
        }
        return res
    }
}
