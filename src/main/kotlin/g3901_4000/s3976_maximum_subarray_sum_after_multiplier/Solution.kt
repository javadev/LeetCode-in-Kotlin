package g3901_4000.s3976_maximum_subarray_sum_after_multiplier

// #Medium #Array #Dynamic_Programming #Staff #Weekly_Contest_508
// #2026_11_03_Time_5_ms_(100.00%)_Space_113.06_MB_(81.25%)

import kotlin.math.max

class Solution {
    fun maxSubarraySum(nums: IntArray, k: Int): Long {
        var max = Long.MIN_VALUE
        var used: Long = 0
        var div: Long = 0
        var sum: Long = 0
        for (x in nums) {
            used = max(used, div) + x
            div = max(sum, div) + x / k
            sum += x.toLong()
            max = max(max(max, sum * k), max(used, div))
            sum = max(sum, 0)
        }
        return max
    }
}
