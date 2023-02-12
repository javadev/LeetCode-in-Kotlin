package g0601_0700.s0643_maximum_average_subarray_i

// #Easy #Array #Sliding_Window #2023_02_11_Time_494_ms_(98.65%)_Space_45.8_MB_(95.95%)

class Solution {
    fun findMaxAverage(nums: IntArray, k: Int): Double {
        var windowSum = 0.0
        var windowStart = 0
        var max = Int.MIN_VALUE.toDouble()
        for (windowEnd in nums.indices) {
            windowSum += nums[windowEnd].toDouble()
            if (windowEnd >= k - 1) {
                val candidate = windowSum / k
                max = Math.max(candidate, max)
                windowSum -= nums[windowStart].toDouble()
                windowStart++
            }
        }
        return max
    }
}
