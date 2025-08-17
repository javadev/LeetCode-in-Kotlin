package g3601_3700.s3634_minimum_removals_to_balance_array

// #Medium #Array #Sorting #Sliding_Window #Biweekly_Contest_162
// #2025_08_03_Time_43_ms_(100.00%)_Space_66.87_MB_(100.00%)

import kotlin.math.max

class Solution {
    fun minRemoval(nums: IntArray, k: Int): Int {
        // Sort array to maintain order
        nums.sort()
        val n = nums.size
        var maxSize = 0
        var left = 0
        // Use sliding window to find longest valid subarray
        for (right in 0..<n) {
            // While condition is violated, shrink window from left
            while (nums[right] > k.toLong() * nums[left]) {
                left++
            }
            maxSize = max(maxSize, right - left + 1)
        }
        // Return number of elements to remove
        return n - maxSize
    }
}
