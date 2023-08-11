package g1001_1100.s1014_best_sightseeing_pair

// #Medium #Array #Dynamic_Programming #Dynamic_Programming_I_Day_7
// #2023_05_17_Time_336_ms_(66.67%)_Space_77.2_MB_(16.67%)

class Solution {
    fun maxScoreSightseeingPair(values: IntArray): Int {
        var bestPrevious = values[0]
        var maxSum = 0
        for (i in 1 until values.size) {
            maxSum = maxSum.coerceAtLeast(bestPrevious + values[i] - i)
            bestPrevious = bestPrevious.coerceAtLeast(values[i] + i)
        }
        return maxSum
    }
}
