package g3201_3300.s3300_minimum_element_after_replacement_with_digit_sum

// #Easy #Array #Math #2024_10_01_Time_153_ms_(100.00%)_Space_36.5_MB_(95.24%)

import kotlin.math.min

class Solution {
    fun minElement(nums: IntArray): Int {
        var min = Int.Companion.MAX_VALUE
        for (x in nums) {
            min = min(min, solve(x))
        }
        return min
    }

    private fun solve(x: Int): Int {
        var x = x
        var sum = 0
        while (x != 0) {
            sum += x % 10
            x /= 10
        }
        return sum
    }
}
