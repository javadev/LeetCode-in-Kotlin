package g3301_3400.s3357_minimize_the_maximum_adjacent_element_difference

// #Hard #Array #Greedy #Binary_Search #2024_11_19_Time_13_ms_(100.00%)_Space_53.6_MB_(100.00%)

import kotlin.math.abs
import kotlin.math.max
import kotlin.math.min

class Solution {
    fun minDifference(nums: IntArray): Int {
        val n = nums.size
        var maxAdj = 0
        var mina = Int.Companion.MAX_VALUE
        var maxb = Int.Companion.MIN_VALUE
        for (i in 0.rangeUntil(n - 1)) {
            val a = nums[i]
            val b = nums[i + 1]
            if (a > 0 && b > 0) {
                maxAdj = max(maxAdj, abs((a - b)))
            } else if (a > 0 || b > 0) {
                mina = min(mina, max(a, b))
                maxb = max(maxb, max(a, b))
            }
        }
        var res = 0
        for (i in 0.rangeUntil(n)) {
            if ((i > 0 && nums[i - 1] == -1) || nums[i] > 0) {
                continue
            }
            var j = i
            while (j < n && nums[j] == -1) {
                j++
            }
            var a = Int.Companion.MAX_VALUE
            var b = Int.Companion.MIN_VALUE
            if (i > 0) {
                a = min(a, nums[i - 1])
                b = max(b, nums[i - 1])
            }
            if (j < n) {
                a = min(a, nums[j])
                b = max(b, nums[j])
            }
            if (a <= b) {
                if (j - i == 1) {
                    res = max(res, min((maxb - a), (b - mina)))
                } else {
                    res = max(
                        res,
                        min(
                            maxb - a,
                            min(b - mina, (maxb - mina + 2) / 3 * 2),
                        ),
                    )
                }
            }
        }
        return max(maxAdj, (res + 1) / 2)
    }
}
