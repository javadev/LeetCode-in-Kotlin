package g3401_3500.s3432_count_partitions_with_even_sum_difference

// #Easy #Array #Math #Prefix_Sum #2025_01_26_Time_2_ms_(100.00%)_Space_35.68_MB_(100.00%)

import kotlin.math.abs

class Solution {
    fun countPartitions(nums: IntArray): Int {
        var ct = 0
        val n = nums.size
        for (i in 0..<n - 1) {
            var sum1 = 0
            var sum2 = 0
            for (j in 0..i) {
                sum1 += nums[j]
            }
            for (k in i + 1..<n) {
                sum2 += nums[k]
            }
            if (abs(sum1 - sum2) % 2 == 0) {
                ct++
            }
        }
        return ct
    }
}
