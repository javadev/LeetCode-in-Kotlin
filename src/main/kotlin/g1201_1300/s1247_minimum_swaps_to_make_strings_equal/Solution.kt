package g1201_1300.s1247_minimum_swaps_to_make_strings_equal

// #Medium #String #Math #Greedy #2023_06_09_Time_134_ms_(66.67%)_Space_33.9_MB_(66.67%)

class Solution {
    fun minimumSwap(s1: String, s2: String): Int {
        val len = s1.length
        var countX1 = 0
        var countY1 = 0
        var countX2 = 0
        var countY2 = 0
        for (i in 0 until len) {
            if (s1[i] != s2[i]) {
                if (s1[i] == 'x') {
                    countX1++
                } else {
                    countY1++
                }
                if (s2[i] == 'x') {
                    countX2++
                } else {
                    countY2++
                }
            }
        }
        if ((countX1 + countX2) % 2 == 1) {
            return -1
        }
        return if (countX1 + countX2 > countY1 + countY2) {
            Math.ceil(countY1 * 1.0 / 2).toInt() + Math.ceil(countY2 * 1.0 / 2).toInt()
        } else {
            Math.ceil(countX1 * 1.0 / 2).toInt() + Math.ceil(countX2 * 1.0 / 2).toInt()
        }
    }
}
