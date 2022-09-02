package g0001_0100.s0084_largest_rectangle_in_histogram

import kotlin.math.max

// #Hard #Top_100_Liked_Questions #Top_Interview_Questions #Array #Stack #Monotonic_Stack
// #2022_09_01_Time_525_ms_(100.00%)_Space_50.7_MB_(98.51%)

class Solution {
    fun largestRectangleArea(heights: IntArray): Int {
        return largestArea(heights, 0, heights.size)
    }

    private fun largestArea(a: IntArray, start: Int, limit: Int): Int {
        if (a.isEmpty()) {
            return 0
        }
        if (start == limit) {
            return 0
        }
        if (limit - start == 1) {
            return a[start]
        }
        if (limit - start == 2) {
            val maxOfTwoBars = Math.max(a[start], a[start + 1])
            val areaFromTwo = Math.min(a[start], a[start + 1]) * 2
            return Math.max(maxOfTwoBars, areaFromTwo)
        }
        return if (checkIfSorted(a, start, limit)) {
            var maxWhenSorted = 0
            for (i in start until limit) {
                if (a[i] * (limit - i) > maxWhenSorted) {
                    maxWhenSorted = a[i] * (limit - i)
                }
            }
            maxWhenSorted
        } else {
            val minInd = findMinInArray(a, start, limit)
            maxOfThreeNums(
                largestArea(a, start, minInd),
                a[minInd] * (limit - start),
                largestArea(a, minInd + 1, limit)
            )
        }
    }

    private fun findMinInArray(a: IntArray, start: Int, limit: Int): Int {
        var min = Int.MAX_VALUE
        var minIndex = -1
        for (index in start until limit) {
            if (a[index] < min) {
                min = a[index]
                minIndex = index
            }
        }
        return minIndex
    }

    private fun checkIfSorted(a: IntArray, start: Int, limit: Int): Boolean {
        for (i in start + 1 until limit) {
            if (a[i] < a[i - 1]) {
                return false
            }
        }
        return true
    }

    private fun maxOfThreeNums(a: Int, b: Int, c: Int): Int {
        return max(max(a, b), c)
    }
}
