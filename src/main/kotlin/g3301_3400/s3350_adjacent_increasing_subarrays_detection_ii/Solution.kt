package g3301_3400.s3350_adjacent_increasing_subarrays_detection_ii

// #Medium #Array #Binary_Search #2024_11_15_Time_947_ms_(48.57%)_Space_87.4_MB_(51.43%)

import kotlin.math.max
import kotlin.math.min

class Solution {
    fun maxIncreasingSubarrays(nums: List<Int>): Int {
        val n = nums.size
        val a = IntArray(n)
        for (i in 0..<n) {
            a[i] = nums[i]
        }
        var ans = 1
        var previousLen = Int.Companion.MAX_VALUE
        var i = 0
        while (i < n) {
            var j = i + 1
            while (j < n && a[j - 1] < a[j]) {
                ++j
            }
            val len = j - i
            ans = max(ans, (len / 2))
            if (previousLen != Int.Companion.MAX_VALUE) {
                ans = max(ans, min(previousLen, len))
            }
            previousLen = len
            i = j
        }
        return ans
    }
}
