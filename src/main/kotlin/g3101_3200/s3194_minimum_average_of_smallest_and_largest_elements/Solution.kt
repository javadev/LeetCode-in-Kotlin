package g3101_3200.s3194_minimum_average_of_smallest_and_largest_elements

// #Easy #Array #Sorting #Two_Pointers #2024_06_29_Time_192_ms_(94.25%)_Space_41_MB_(49.43%)

import kotlin.math.min

class Solution {
    fun minimumAverage(nums: IntArray): Double {
        nums.sort()
        var m = 102.0
        var i = 0
        val l = nums.size
        while (i < l / 2) {
            m = min(m, nums[i] + nums[l - i - 1].toDouble())
            i++
        }
        return m / 2.0
    }
}
