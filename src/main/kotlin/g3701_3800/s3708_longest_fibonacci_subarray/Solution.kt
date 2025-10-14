package g3701_3800.s3708_longest_fibonacci_subarray

// #Medium #Array #Biweekly_Contest_167 #2025_10_14_Time_3_ms_(100.00%)_Space_74.87_MB_(18.18%)

import kotlin.math.max

class Solution {
    fun longestSubarray(nums: IntArray): Int {
        val n = nums.size
        if (n <= 2) {
            return n
        }
        var ans = 2
        var c = 2
        for (i in 2..<n) {
            if (nums[i] == nums[i - 1] + nums[i - 2]) {
                c++
            } else {
                c = 2
            }
            ans = max(ans, c)
        }
        return ans
    }
}
