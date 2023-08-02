package g1801_1900.s1848_minimum_distance_to_the_target_element

// #Easy #Array #2023_06_22_Time_172_ms_(80.00%)_Space_37_MB_(100.00%)

import kotlin.math.abs

class Solution {
    fun getMinDistance(nums: IntArray, target: Int, start: Int): Int {
        var result = 0
        var minDiff = Int.MAX_VALUE
        for (i in nums.indices) {
            if (nums[i] == target && abs(start - i) < minDiff) {
                minDiff = abs(start - i)
                result = minDiff
            }
        }
        return result
    }
}
