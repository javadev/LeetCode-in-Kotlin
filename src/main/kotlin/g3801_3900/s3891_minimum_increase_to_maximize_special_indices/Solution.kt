package g3801_3900.s3891_minimum_increase_to_maximize_special_indices

import kotlin.math.max
import kotlin.math.min

// #Medium #Array #Dynamic_Programming #Greedy #Prefix_Sum #Staff #Weekly_Contest_496
// #2026_08_13_Time_2_ms_(100.00%)_Space_97.78_MB_(97.44%)

class Solution {
    fun minIncrease(nums: IntArray): Long {
        val n = nums.size
        var min: Long = 0
        if ((n and 1) == 1) {
            var i = 1
            while (i < n) {
                min += max(max(nums[i - 1], nums[i + 1]) + 1 - nums[i], 0).toLong()
                i += 2
            }
        } else {
            val starting = longArrayOf(0, 0)
            var i = 1
            while (i < n - 1) {
                val firstOp = max(max(nums[i - 1], nums[i + 1]) + 1 - nums[i], 0)
                val secondOp = max(max(nums[i], nums[i + 2]) + 1 - nums[i + 1], 0)
                starting[1] = min(starting[0], starting[1]) + secondOp
                starting[0] += firstOp.toLong()
                i += 2
            }
            min = min(starting[0], starting[1])
        }
        return min
    }
}
