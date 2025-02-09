package g3401_3500.s3423_maximum_difference_between_adjacent_elements_in_a_circular_array

// #Easy #Array #2025_01_19_Time_2_ms_(100.00%)_Space_38.80_MB_(100.00%)

import kotlin.math.abs
import kotlin.math.max

class Solution {
    fun maxAdjacentDistance(nums: IntArray): Int {
        var maxDiff = 0
        for (i in nums.indices) {
            val nextIndex = (i + 1) % nums.size
            val diff = abs((nums[i] - nums[nextIndex]))
            maxDiff = max(maxDiff, diff)
        }
        return maxDiff
    }
}
