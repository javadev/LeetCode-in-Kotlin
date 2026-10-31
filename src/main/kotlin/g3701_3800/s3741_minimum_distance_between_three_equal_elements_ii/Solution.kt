package g3701_3800.s3741_minimum_distance_between_three_equal_elements_ii

// #Medium #Array #Hash_Table #Senior #Weekly_Contest_475
// #2026_04_26_Time_6_ms_(99.60%)_Space_161.24_MB_(96.23%)

import kotlin.math.min

class Solution {
    fun minimumDistance(nums: IntArray): Int {
        val n = nums.size
        var ans = Int.MAX_VALUE
        val prev1 = IntArray(n + 1)
        val prev2 = IntArray(n + 1)
        for (i in 0..<n + 1) {
            prev2[i] = -1
            prev1[i] = prev2[i]
        }
        for (i in 0..<n) {
            val value = nums[i]
            if (prev2[value] != -1) {
                ans = min(ans, (i - prev2[value]))
            }
            prev2[value] = prev1[value]
            prev1[value] = i
        }
        if (ans < 100002) {
            return ans * 2
        }
        return -1
    }
}
