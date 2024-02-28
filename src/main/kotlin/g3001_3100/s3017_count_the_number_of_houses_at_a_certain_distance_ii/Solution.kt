package g3001_3100.s3017_count_the_number_of_houses_at_a_certain_distance_ii

// #Hard #Breadth_First_Search #Graph #Prefix_Sum
// #2024_02_28_Time_414_ms_(50.00%)_Space_51_MB_(50.00%)

import kotlin.math.max
import kotlin.math.min

class Solution {
    fun countOfPairs(n: Int, x: Int, y: Int): LongArray {
        val result = LongArray(n)
        val leftCount = (min(x, y) - 1)
        val rightCount = (n - max(x, y))
        val circleCount = n - leftCount - rightCount
        circleInternal(circleCount, result)
        lineToCircle(leftCount, circleCount, result)
        lineToCircle(rightCount, circleCount, result)
        lineToLine(leftCount, rightCount, if (x == y) 1 else 2, result)
        lineInternal(leftCount, result)
        lineInternal(rightCount, result)
        return result
    }

    private fun lineToCircle(lineCount: Int, circleCount: Int, curRes: LongArray) {
        val circleLen = circleCount / 2 + 1
        var curModifier = 0
        for (i in 1 until circleLen + lineCount) {
            if (i <= min(lineCount, circleLen)) {
                curModifier += 4
            } else if (i > max(lineCount, circleLen)) {
                curModifier -= 4
            }
            curRes[i - 1] += curModifier.toLong()
            if (i <= lineCount) {
                curRes[i - 1] = curRes[i - 1] - 2
            }
            if (i >= circleLen && circleCount % 2 == 0) {
                curRes[i - 1] = curRes[i - 1] - 2
            }
        }
    }

    private fun lineToLine(lineCount1: Int, lineCount2: Int, initialDis: Int, curRes: LongArray) {
        var curModifier = 0
        for (i in 1 until lineCount1 + lineCount2) {
            if (i <= min(lineCount1, lineCount2)) {
                curModifier += 2
            } else if (i > max(lineCount1, lineCount2)) {
                curModifier -= 2
            }
            curRes[i - 1 + initialDis] += curModifier.toLong()
        }
    }

    private fun lineInternal(lineCount: Int, curRes: LongArray) {
        for (i in 1 until lineCount) {
            curRes[i - 1] += (lineCount - i) * 2L
        }
    }

    private fun circleInternal(circleCount: Int, curRes: LongArray) {
        for (i in 0 until circleCount / 2) {
            if (circleCount % 2 == 0 && i + 1 == circleCount / 2) {
                curRes[i] += circleCount.toLong()
            } else {
                curRes[i] += circleCount * 2L
            }
        }
    }
}
