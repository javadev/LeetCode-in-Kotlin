package g3101_3200.s3107_minimum_operations_to_make_median_of_array_equal_to_k

// #Medium #Array #Sorting #Greedy #2024_04_13_Time_554_ms_(100.00%)_Space_82.2_MB_(68.00%)

import kotlin.math.abs

class Solution {
    fun minOperationsToMakeMedianK(nums: IntArray, k: Int): Long {
        nums.sort()
        val n = nums.size
        val medianIndex = n / 2
        var result: Long = 0
        var totalElements = 0
        var totalSum: Long = 0
        var i = medianIndex
        if (nums[medianIndex] > k) {
            while (i >= 0 && nums[i] > k) {
                totalElements += 1
                totalSum += nums[i].toLong()
                i -= 1
            }
        } else if (nums[medianIndex] < k) {
            while (i < n && nums[i] < k) {
                totalElements += 1
                totalSum += nums[i].toLong()
                i += 1
            }
        }
        result += abs(totalSum - (totalElements.toLong() * k))
        return result
    }
}
