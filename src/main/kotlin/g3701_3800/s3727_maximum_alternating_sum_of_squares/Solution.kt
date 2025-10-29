package g3701_3800.s3727_maximum_alternating_sum_of_squares

// #Medium #Array #Sorting #Greedy #Weekly_Contest_473
// #2025_10_28_Time_9_ms_(100.00%)_Space_90.79_MB_(13.04%)

import kotlin.math.abs
import kotlin.math.min

class Solution {
    fun maxAlternatingSum(nums: IntArray): Long {
        val n = nums.size
        var need = n / 2
        val maxa = 40000
        val freq = IntArray(maxa + 1)
        var total: Long = 0
        for (x in nums) {
            val a = abs(x)
            freq[a]++
            total += 1L * a * a
        }
        var small: Long = 0
        var a = 0
        while (a <= maxa && need > 0) {
            val take = min(freq[a], need)
            if (take > 0) {
                small += 1L * a * a * take
                need -= take
            }
            a++
        }
        return total - 2 * small
    }
}
