package g3801_3900.s3824_minimum_k_to_reduce_array_within_limit

// #Medium #Array #Binary_Search #Staff #Biweekly_Contest_175
// #2026_06_09_Time_16_ms_(100.00%)_Space_130.89_MB_(86.74%)

import kotlin.math.cbrt
import kotlin.math.ceil
import kotlin.math.max
import kotlin.math.sqrt

class Solution {
    fun minimumK(nums: IntArray): Int {
        val n = nums.size
        var mx = 0
        for (x in nums) {
            mx = max(mx, x)
        }
        var total: Long = 0
        for (x in nums) {
            total += x.toLong()
        }
        var left = max(ceil(sqrt(n.toDouble())).toInt(), ceil(cbrt(total.toDouble())).toInt()) - 1
        var right = ceil(sqrt(nonPositive(nums, left + 1).toDouble())).toInt()
        while (left + 1 < right) {
            val k = (left + right) / 2
            if (nonPositive(nums, k) <= k.toLong() * k) {
                right = k
            } else {
                left = k
            }
        }
        return left + 1
    }

    private fun nonPositive(nums: IntArray, k: Int): Long {
        var sum = nums.size.toLong()
        for (x in nums) {
            sum += ((x - 1) / k).toLong()
        }
        return sum
    }
}
