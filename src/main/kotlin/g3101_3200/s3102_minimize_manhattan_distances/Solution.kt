package g3101_3200.s3102_minimize_manhattan_distances

// #Hard #Array #Math #2024_04_23_Time_701_ms_(95.83%)_Space_100.4_MB_(75.00%)

import kotlin.math.abs
import kotlin.math.max
import kotlin.math.min

class Solution {
    private fun manhattan(points: Array<IntArray>, i: Int, j: Int): Int {
        return (
            abs(points[i][0] - points[j][0]) + abs(
                points[i][1] - points[j][1]
            )
            )
    }

    private fun maxManhattanDistance(points: Array<IntArray>, remove: Int): IntArray {
        val n = points.size
        var maxSum = Int.MIN_VALUE
        var minSum = Int.MAX_VALUE
        var maxDiff = Int.MIN_VALUE
        var minDiff = Int.MAX_VALUE
        var maxSumIndex = -1
        var minSumIndex = -1
        var maxDiffIndex = -1
        var minDiffIndex = -1
        for (i in 0 until n) {
            if (i != remove) {
                val sum = points[i][0] + points[i][1]
                val diff = points[i][0] - points[i][1]
                if (sum > maxSum) {
                    maxSumIndex = i
                    maxSum = sum
                }
                if (sum < minSum) {
                    minSumIndex = i
                    minSum = sum
                }
                if (diff > maxDiff) {
                    maxDiffIndex = i
                    maxDiff = diff
                }
                if (diff < minDiff) {
                    minDiffIndex = i
                    minDiff = diff
                }
            }
        }
        return if (max(maxSum - minSum, maxDiff - minDiff) == maxSum - minSum
        ) intArrayOf(maxSumIndex, minSumIndex)
        else intArrayOf(maxDiffIndex, minDiffIndex)
    }

    fun minimumDistance(points: Array<IntArray>): Int {
        val m = maxManhattanDistance(points, -1)
        val m1 = maxManhattanDistance(points, m[0])
        val m2 = maxManhattanDistance(points, m[1])
        return min(
            manhattan(points, m1[0], m1[1]),
            manhattan(points, m2[0], m2[1])
        )
    }
}
