package g3701_3800.s3713_longest_balanced_substring_i

// #Medium #String #Hash_Table #Counting #Enumeration #Weekly_Contest_471
// #2025_10_14_Time_35_ms_(100.00%)_Space_47.17_MB_(95.00%)

import kotlin.math.max

class Solution {
    fun longestBalanced(s: String): Int {
        val n = s.length
        var r = 0
        for (i in 0..<n) {
            val f = IntArray(26)
            var k = 0
            var m = 0
            for (j in i..<n) {
                val x = s[j].code - 'a'.code
                if (++f[x] == 1) {
                    ++k
                }
                m = max(f[x], m)
                if (m * k == j - i + 1) {
                    r = max(r, j - i + 1)
                }
            }
        }
        return r
    }
}
