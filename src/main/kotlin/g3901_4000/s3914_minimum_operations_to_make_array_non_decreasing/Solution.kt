package g3901_4000.s3914_minimum_operations_to_make_array_non_decreasing

// #Medium #Array #Greedy #Staff #Weekly_Contest_499
// #2026_09_17_Time_2_ms_(100.00%)_Space_87.58_MB_(31.66%)

import kotlin.math.max

class Solution {
    fun minOperations(nums: IntArray): Long {
        val n = nums.size
        var ans: Long = 0
        for (i in 1..<n) {
            ans += max(nums[i - 1] - nums[i], 0).toLong()
        }
        return ans
    }
}
