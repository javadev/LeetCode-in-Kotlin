package g3301_3400.s3361_shift_distance_between_two_strings

// #Medium #Array #String #Prefix_Sum #2024_11_24_Time_425_ms_(100.00%)_Space_41_MB_(100.00%)

import kotlin.math.min

class Solution {
    fun shiftDistance(s: String, t: String, nextCost: IntArray, previousCost: IntArray): Long {
        var sum: Long = 0
        val n = s.length
        for (i in 0..<n) {
            val ch1 = s[i].code - 'a'.code
            val ch2 = t[i].code - 'a'.code
            val forwardDiff = (ch2 - ch1 + 26) % 26
            var forwardCost: Long = 0
            for (j in 0..<forwardDiff) {
                forwardCost += nextCost[(ch1 + j) % 26].toLong()
            }
            val reverseDiff = (26 + ch1 - ch2) % 26
            var backwardCost: Long = 0
            for (j in 0..<reverseDiff) {
                backwardCost += previousCost[(ch1 - j + 26) % 26].toLong()
            }
            sum = sum + min(forwardCost, backwardCost)
        }
        return sum
    }
}
