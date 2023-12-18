package g2801_2900.s2826_sorting_three_groups

// #Medium #Array #Dynamic_Programming #2023_12_18_Time_250_ms_(100.00%)_Space_45_MB_(100.00%)

import kotlin.math.max

class Solution {
    fun minimumOperations(nums: List<Int>): Int {
        val n = nums.size
        val arr = IntArray(3)
        var max = 0
        for (num in nums) {
            var locMax = 0
            val value = num
            for (j in 0 until value) {
                locMax = max(locMax, arr[j])
            }
            locMax++
            arr[value - 1] = locMax
            if (locMax > max) {
                max = locMax
            }
        }
        return n - max
    }
}
