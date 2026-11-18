package g3901_4000.s4000_largest_integer_with_given_digit_sum

// #Easy #Math #Greedy #Mid_Level #Weekly_Contest_512
// #2026_11_17_Time_1_ms_(68.99%)_Space_42.00_MB_(64.02%)

import kotlin.math.min

class Solution {
    fun largestInteger(n: Int, s: Int): Int {
        var s = s
        if (9 * n < s) {
            return -1
        }
        if (s == 0) {
            return 0
        }
        val sb = StringBuilder()
        for (i in 0..<n) {
            val d = min(9, s)
            sb.append(d)
            s -= d
        }
        return sb.toString().toInt()
    }
}
