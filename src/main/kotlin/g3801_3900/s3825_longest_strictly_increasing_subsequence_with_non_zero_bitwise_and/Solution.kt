package g3801_3900.s3825_longest_strictly_increasing_subsequence_with_non_zero_bitwise_and

// #Medium #Array #Binary_Search #Bit_Manipulation #Enumeration #Staff #Biweekly_Contest_175
// #2026_06_09_Time_327_ms_(92.65%)_Space_111.14_MB_(76.47%)

import kotlin.math.max

class Solution {
    private fun lis(nums: IntArray, n: Int): Int {
        val tails = IntArray(n)
        var sz = 0
        for (i in 0..<n) {
            val x = nums[i]
            var l = 0
            var r = sz
            while (l < r) {
                val m = (l + r) ushr 1
                if (tails[m] >= x) {
                    r = m
                } else {
                    l = m + 1
                }
            }
            tails[l] = x
            if (l == sz) {
                sz++
            }
        }
        return sz
    }

    fun longestSubsequence(nums: IntArray): Int {
        val maxbits = 32
        var result = 0
        val n = nums.size
        val buf = IntArray(n)
        for (bit in 0..<maxbits) {
            var m = 0
            for (x in nums) {
                if (((x shr bit) and 1) != 0) {
                    buf[m++] = x
                }
            }
            result = max(result, lis(buf, m))
        }
        return result
    }
}
