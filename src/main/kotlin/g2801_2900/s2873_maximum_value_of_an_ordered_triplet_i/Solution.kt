package g2801_2900.s2873_maximum_value_of_an_ordered_triplet_i

// #Easy #Array #2023_12_21_Time_157_ms_(94.12%)_Space_35_MB_(100.00%)

import kotlin.math.max

class Solution {
    fun maximumTripletValue(nums: IntArray): Long {
        val n = nums.size
        val iNumMaxs = IntArray(n)
        var prev = 0
        for (i in 0 until n) {
            if (nums[i] <= prev) {
                iNumMaxs[i] = prev
            } else {
                iNumMaxs[i] = nums[i]
                prev = iNumMaxs[i]
            }
        }
        var result: Long = 0
        var kNumMax = nums[n - 1]
        for (j in n - 2 downTo 1) {
            result = max(
                result.toDouble(),
                ((iNumMaxs[j - 1] - nums[j]).toLong() * kNumMax).toDouble(),
            ).toLong()
            if (nums[j] > kNumMax) {
                kNumMax = nums[j]
            }
        }
        return result
    }
}
