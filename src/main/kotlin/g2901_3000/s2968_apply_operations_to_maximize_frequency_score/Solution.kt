package g2901_3000.s2968_apply_operations_to_maximize_frequency_score

// #Hard #Array #Sorting #Binary_Search #Prefix_Sum #Sliding_Window
// #2024_01_19_Time_566_ms_(90.00%)_Space_64.8_MB_(85.00%)

import kotlin.math.abs
import kotlin.math.max

class Solution {
    fun maxFrequencyScore(nums: IntArray, k: Long): Int {
        nums.sort()
        var left = 0
        var cost = 0L
        var median = nums[0]
        var maxLen = 1
        for (right in 1 until nums.size) {
            cost += abs(median - nums[right])
            median = nums[(right + left + 1) / 2]
            while (cost > k) {
                cost -= abs(median - nums[left])
                left++
                median = nums[(right + left + 1) / 2]
            }
            maxLen = max(maxLen, right - left + 1)
        }
        return maxLen
    }
}
