package g0701_0800.s0754_reach_a_number

// #Medium #Math #Binary_Search #2023_03_07_Time_134_ms_(100.00%)_Space_33_MB_(100.00%)

import kotlin.math.abs
import kotlin.math.sqrt

@Suppress("NAME_SHADOWING")
class Solution {
    fun reachNumber(target: Int): Int {
        var target = target
        target = abs(target)
        var `val` = (sqrt(1.0 + 8 * target.toLong()).toInt() - 1) / 2
        var sum = `val` * (`val` + 1) / 2
        while (sum < target || (sum - target) % 2 != 0) {
            `val`++
            sum += `val`
        }
        return `val`
    }
}
