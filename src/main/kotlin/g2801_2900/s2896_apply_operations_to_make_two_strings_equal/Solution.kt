package g2801_2900.s2896_apply_operations_to_make_two_strings_equal

// #Medium #String #Dynamic_Programming #2023_12_21_Time_181_ms_(66.67%)_Space_36.5_MB_(100.00%)

import kotlin.math.min

class Solution {
    fun minOperations(s1: String, s2: String, x: Int): Int {
        val n = s1.length
        val diffs = ArrayList<Int>()
        for (i in 0 until n) {
            if (s1[i] != s2[i]) {
                diffs.add(i)
            }
        }
        val m = diffs.size
        if ((m and 1) == 1) {
            return -1
        } else if (m == 0) {
            return 0
        }
        val dp = IntArray(m)
        dp[0] = 0
        dp[1] = min(x.toDouble(), (diffs[1] - diffs[0]).toDouble()).toInt()
        for (i in 2 until m) {
            if ((i and 1) == 1) {
                dp[i] = min((dp[i - 1] + x).toDouble(), (dp[i - 2] + diffs[i] - diffs[i - 1]).toDouble())
                    .toInt()
            } else {
                dp[i] = min(dp[i - 1].toDouble(), (dp[i - 2] + diffs[i] - diffs[i - 1]).toDouble())
                    .toInt()
            }
        }
        return dp[m - 1]
    }
}
