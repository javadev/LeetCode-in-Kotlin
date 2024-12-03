package g3301_3400.s3361_shift_distance_between_two_strings

// #Medium #Array #String #Prefix_Sum #2024_12_03_Time_350_ms_(82.50%)_Space_41.7_MB_(57.50%)

import kotlin.math.min

class Solution {
    fun shiftDistance(s: String, t: String, nextCost: IntArray, previousCost: IntArray): Long {
        val costs = Array<LongArray?>(26) { LongArray(26) }
        var cost: Long
        for (i in 0..25) {
            cost = nextCost[i].toLong()
            var j = if (i == 25) 0 else i + 1
            while (j != i) {
                costs[i]!![j] = cost
                cost += nextCost[j].toLong()
                if (j == 25) {
                    j = -1
                }
                j++
            }
        }
        for (i in 0..25) {
            cost = previousCost[i].toLong()
            var j = if (i == 0) 25 else i - 1
            while (j != i) {
                costs[i]!![j] = min(costs[i]!![j].toDouble(), cost.toDouble()).toLong()
                cost += previousCost[j].toLong()
                if (j == 0) {
                    j = 26
                }
                j--
            }
        }
        val n = s.length
        var ans: Long = 0
        for (i in 0..<n) {
            ans += costs[s[i].code - 'a'.code]!![t[i].code - 'a'.code]
        }
        return ans
    }
}
