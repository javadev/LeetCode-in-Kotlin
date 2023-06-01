package g0601_0700.s0633_sum_of_square_numbers

// #Medium #Math #Binary_Search #Two_Pointers #Binary_Search_I_Day_10
// #2023_02_09_Time_126_ms_(100.00%)_Space_33_MB_(90.00%)

import kotlin.math.sqrt

class Solution {
    fun judgeSquareSum(c: Int): Boolean {
        val right = sqrt(c.toDouble()).toInt()
        val left = sqrt(c.toDouble() / 2).toInt()
        for (i in left..right) {
            val j = sqrt(c - (i * i).toDouble()).toInt()
            if (i * i + j * j == c) {
                return true
            }
        }
        return false
    }
}
