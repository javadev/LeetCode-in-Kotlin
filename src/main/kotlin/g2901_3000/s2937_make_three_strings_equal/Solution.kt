package g2901_3000.s2937_make_three_strings_equal

// #Easy #String #2024_01_03_Time_186_ms_(83.78%)_Space_36.9_MB_(93.24%)

import kotlin.math.min

class Solution {
    fun findMinimumOperations(s1: String, s2: String, s3: String): Int {
        var pos = true
        val n = min(s1.length, min(s2.length, s3.length))
        var ans = 0
        var i = 0
        while (i < n && pos) {
            if (s1[i] == s2[i] && s1[i] == s3[i]) {
                ans++
            } else {
                pos = false
            }
            i++
        }
        return if (ans == 0) -1 else s1.length + s2.length + s3.length - (3 * ans)
    }
}
