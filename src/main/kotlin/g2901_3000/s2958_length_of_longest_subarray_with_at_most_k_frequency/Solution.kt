package g2901_3000.s2958_length_of_longest_subarray_with_at_most_k_frequency

// #Medium #Array #Hash_Table #Sliding_Window #2024_01_16_Time_485_ms_(100.00%)_Space_168_MB_(6.25%)

import kotlin.math.max
import kotlin.math.min

class Solution {
    fun maxSubarrayLength(nums: IntArray, k: Int): Int {
        var m1 = Int.MIN_VALUE
        var m2 = Int.MAX_VALUE
        for (num in nums) {
            m1 = max(m1.toDouble(), num.toDouble()).toInt()
            m2 = min(m2.toDouble(), num.toDouble()).toInt()
        }
        var max = 0
        val f = IntArray(m1 - m2 + 1)
        var l = 0
        var r = 0
        while (r < nums.size) {
            f[nums[r] - m2]++
            while (count(f, nums[r] - m2) > k) {
                f[nums[l] - m2]--
                l++
            }
            max = max(max.toDouble(), (r - l + 1).toDouble()).toInt()
            r++
        }
        return max
    }

    private fun count(f: IntArray, n: Int): Int {
        return f[n]
    }
}
