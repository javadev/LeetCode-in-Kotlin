package g3301_3400.s3389_minimum_operations_to_make_character_frequencies_equal

// #Hard #2024_12_15_Time_88_ms_(100.00%)_Space_40.7_MB_(100.00%)

import kotlin.math.max
import kotlin.math.min

class Solution {
    fun makeStringGood(s: String): Int {
        val n = s.length
        val a = IntArray(110)
        for (ch in s.toCharArray()) {
            a[ch.code - 'a'.code + 1]++
        }
        val f: Array<IntArray> = Array<IntArray>(30) { IntArray(3) }
        val inf = Int.Companion.MAX_VALUE / 2
        var ans = inf
        for (avg in 1..n) {
            for (row in f) {
                row.fill(inf)
            }
            f[0][0] = 0
            for (i in 1..26) {
                f[i][0] = min(min(f[i - 1][0], f[i - 1][1]), f[i - 1][2]) + a[i]
                if (a[i] <= avg) {
                    f[i][1] = min(
                        min(
                            (f[i - 1][0] + max(avg - a[i - 1] - a[i], 0)),
                            (f[i - 1][1] + (avg - a[i])),
                        ),
                        (f[i - 1][2] + max(avg - (a[i - 1] - avg) - a[i], 0)),
                    ).toInt()
                }
                if (a[i] >= avg) {
                    f[i][2] =
                        min(min(f[i - 1][0], f[i - 1][1]), f[i - 1][2]) + (a[i] - avg)
                }
            }
            ans = min(ans, min(f[26][0], min(f[26][1], f[26][2])))
        }
        return if (ans == inf) -1 else ans
    }
}
