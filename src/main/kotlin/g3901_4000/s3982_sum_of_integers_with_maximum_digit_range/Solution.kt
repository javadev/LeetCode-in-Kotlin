package g3901_4000.s3982_sum_of_integers_with_maximum_digit_range

// #Easy #Array #Math #Mid_Level #Weekly_Contest_509
// #2026_11_03_Time_2_ms_(57.34%)_Space_44.91_MB_(80.07%)

import kotlin.math.max
import kotlin.math.min

class Solution {
    fun maxDigitRange(nums: IntArray): Int {
        val n = nums.size
        val range = nums.clone()
        var maxRange = Int.MIN_VALUE
        for (i in 0..<n) {
            var x = range[i]
            var mn = Int.MAX_VALUE
            var mx = Int.MIN_VALUE
            while (x > 0) {
                val d = x % 10
                mn = min(mn, d)
                mx = max(mx, d)
                x /= 10
            }
            range[i] = mx - mn
            maxRange = max(maxRange, range[i])
        }
        var ans = 0
        for (i in 0..<n) {
            if (range[i] == maxRange) {
                ans += nums[i]
            }
        }
        return ans
    }
}
