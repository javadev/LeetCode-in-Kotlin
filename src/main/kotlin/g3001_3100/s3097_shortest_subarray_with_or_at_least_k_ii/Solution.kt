package g3001_3100.s3097_shortest_subarray_with_or_at_least_k_ii

// #Medium #Array #Bit_Manipulation #Sliding_Window
// #2024_04_20_Time_489_ms_(93.33%)_Space_79.6_MB_(13.33%)

import kotlin.math.min

class Solution {
    fun minimumSubarrayLength(nums: IntArray, k: Int): Int {
        val n = nums.size
        if (nums[0] >= k) {
            return 1
        }
        var res = Int.MAX_VALUE
        for (i in 1 until n) {
            if (nums[i] >= k) {
                return 1
            }
            var j = i - 1
            while (j >= 0 && (nums[i] or nums[j]) != nums[j]) {
                nums[j] = nums[j] or nums[i]
                if (nums[j] >= k) {
                    res = min(res, (i - j + 1))
                }
                j--
            }
        }
        if (res == Int.MAX_VALUE) {
            return -1
        }
        return res
    }
}
