package g3401_3500.s3409_longest_subsequence_with_decreasing_adjacent_difference

// #Medium #Array #Dynamic_Programming #2025_01_07_Time_70_(100.00%)_Space_57.87_(85.71%)

import kotlin.math.max

class Solution {
    fun longestSubsequence(nums: IntArray): Int {
        var max = 0
        for (n in nums) {
            max = max(n, max)
        }
        max += 1
        val dp: Array<IntArray> = Array<IntArray>(max) { IntArray(max) }
        for (i in nums) {
            var v = 1
            for (diff in max - 1 downTo 0) {
                if (i + diff < max) {
                    v = max(v, (dp[i + diff][diff] + 1))
                }
                if (i - diff >= 0) {
                    v = max(v, (dp[i - diff][diff] + 1))
                }
                dp[i][diff] = v
            }
        }
        var res = 0
        for (i in dp) {
            for (j in i) {
                res = max(res, j)
            }
        }
        return res
    }
}
