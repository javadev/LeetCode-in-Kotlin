package g3101_3200.s3106_lexicographically_smallest_string_after_operations_with_constraint

// #Medium #String #Greedy #2024_04_13_Time_162_ms_(74.19%)_Space_36.2_MB_(77.42%)

import kotlin.math.abs
import kotlin.math.min

@Suppress("NAME_SHADOWING")
class Solution {
    fun getSmallestString(s: String, k: Int): String {
        var k = k
        val sArray = s.toCharArray()
        for (i in sArray.indices) {
            val distToA = cyclicDistance(sArray[i], 'a')
            if (distToA <= k) {
                sArray[i] = 'a'
                k -= distToA
            } else if (k > 0) {
                sArray[i] = (sArray[i].code - k).toChar()
                k = 0
            }
        }
        return String(sArray)
    }

    private fun cyclicDistance(ch1: Char, ch2: Char): Int {
        val dist = abs(ch1.code - ch2.code)
        return min(dist, (26 - dist))
    }
}
