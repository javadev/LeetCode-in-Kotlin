package g3001_3100.s3095_shortest_subarray_with_or_at_least_k_i

// #Easy #Array #Bit_Manipulation #Sliding_Window
// #2024_04_18_Time_161_ms_(95.65%)_Space_35.3_MB_(71.74%)

import kotlin.math.min

class Solution {
    fun minimumSubarrayLength(nums: IntArray, k: Int): Int {
        val n = nums.size
        var maxL = n + 1
        var `val`: Int
        for (i in 0 until n) {
            `val` = 0
            for (j in i until n) {
                `val` = `val` or nums[j]
                if (`val` >= k) {
                    maxL = min(maxL, (j - i + 1))
                }
            }
        }
        return if (maxL == n + 1) -1 else maxL
    }
}
