package g2801_2900.s2809_minimum_time_to_make_array_sum_at_most_x

// #Hard #Array #Dynamic_Programming #Sorting
// #2023_12_06_Time_325_ms_(100.00%)_Space_42.6_MB_(100.00%)

import kotlin.math.max

class Solution {
    fun minimumTime(nums1: List<Int?>, nums2: List<Int?>, x: Int): Int {
        val n = nums1.size
        val nums = Array(n) { IntArray(2) }
        for (i in 0 until n) {
            nums[i] = intArrayOf(nums1[i]!!, nums2[i]!!)
        }
        nums.sortWith { a: IntArray, b: IntArray -> a[1] - b[1] }
        val dp = IntArray(n + 1)
        var sum1: Long = 0
        var sum2: Long = 0
        for (i in 0 until n) {
            sum1 += nums[i][0].toLong()
            sum2 += nums[i][1].toLong()
        }
        if (sum1 <= x) {
            return 0
        }
        for (j in 0 until n) {
            for (i in j + 1 downTo 1) {
                dp[i] = max(dp[i].toDouble(), (nums[j][0] + nums[j][1] * i + dp[i - 1]).toDouble())
                    .toInt()
            }
        }
        for (i in 1..n) {
            if (sum1 + sum2 * i - dp[i] <= x) {
                return i
            }
        }
        return -1
    }
}
