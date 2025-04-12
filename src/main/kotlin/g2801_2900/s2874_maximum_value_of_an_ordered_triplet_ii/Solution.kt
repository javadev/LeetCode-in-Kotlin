package g2801_2900.s2874_maximum_value_of_an_ordered_triplet_ii

// #Medium #Array #2023_12_25_Time_508_ms_(100.00%)_Space_63.7_MB_(50.00%)

import kotlin.math.max

class Solution {
    fun maximumTripletValue(nums: IntArray): Long {
        val diff = IntArray(nums.size)
        var tempMax = nums[0]
        for (i in 1 until diff.size - 1) {
            diff[i] = tempMax - nums[i]
            tempMax = max(tempMax, nums[i])
        }
        var max = Long.MIN_VALUE
        tempMax = nums[nums.size - 1]
        for (i in nums.size - 2 downTo 1) {
            max = max(max, tempMax.toLong() * diff[i])
            tempMax = max(tempMax, nums[i])
        }
        return max(max, 0)
    }
}
