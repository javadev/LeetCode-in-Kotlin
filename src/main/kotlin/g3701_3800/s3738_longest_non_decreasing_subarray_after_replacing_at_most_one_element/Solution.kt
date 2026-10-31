package g3701_3800.s3738_longest_non_decreasing_subarray_after_replacing_at_most_one_element

// #Medium #Array #Dynamic_Programming #Staff #Biweekly_Contest_169
// #2026_04_26_Time_7_ms_(99.28%)_Space_123.88_MB_(5.07%)

import kotlin.math.max
import kotlin.math.min

class Solution {
    fun longestSubarray(nums: IntArray): Int {
        val n = nums.size
        if (n < 3) {
            return n
        }
        var i = 0
        var len1: Int
        var len2 = 0
        var ans = 2
        while (i < n) {
            val l = if (i == 0) -1000 * 1000 * 10 else nums[i - 1]
            val r = if (i == n - 1) 1000 * 1000 * 10 else nums[i + 1]
            if (l <= nums[i]) {
                len2++
                ans = max(len2 + 1, ans)
            } else if (r >= nums[i]) {
                var j = i
                len1 = len2
                while (j < n - 1 && nums[j] <= nums[j + 1]) {
                    j++
                }
                len2 = j - i + 1
                ans = max(len2 + 1, ans)
                if (l <= r || (len1 > 1 && nums[i - 2] <= nums[i])) {
                    ans = max(len1 + len2, ans)
                }
                i = j
            } else {
                len2 = 0
            }
            i++
        }
        ans = min(ans, n)
        return ans
    }
}
