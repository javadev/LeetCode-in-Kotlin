package g3601_3700.s3698_split_array_with_minimum_difference

// #Medium #Array #Prefix_Sum #Weekly_Contest_469
// #2025_10_03_Time_3_ms_(100.00%)_Space_69.93_MB_(52.17%)

import kotlin.math.abs
import kotlin.math.min

class Solution {
    fun splitArray(nums: IntArray): Long {
        var i = 1
        val n = nums.size
        var suml = nums[0].toLong()
        while (i < n && nums[i] > nums[i - 1]) {
            suml += nums[i].toLong()
            i++
        }
        if (i == n) {
            return abs(suml - nums[n - 1] - nums[n - 1])
        }
        val pivot = if (nums[i] == nums[i - 1]) 0 else nums[i - 1]
        var sumr: Long = nums[i].toLong()
        i += 1
        while (i < n && nums[i] < nums[i - 1]) {
            sumr += nums[i].toLong()
            i++
        }
        if (i != n) {
            return -1
        }
        return if (suml <= sumr) {
            sumr - suml
        } else {
            if (suml - sumr - 2L * pivot > 0) {
                suml - sumr - 2L * pivot
            } else {
                min(suml - sumr, abs(suml - sumr - 2L * pivot))
            }
        }
    }
}
