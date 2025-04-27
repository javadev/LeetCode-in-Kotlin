package g3501_3600.s3531_count_covered_buildings

// #Medium #2025_04_27_Time_34_ms_(100.00%)_Space_119.08_MB_(80.00%)

import kotlin.math.max
import kotlin.math.min

class Solution {
    private fun helper(buildings: Array<IntArray>, n: Int): Int {
        val minRow = IntArray(n + 1)
        val maxRow = IntArray(n + 1)
        val minCol = IntArray(n + 1)
        val maxCol = IntArray(n + 1)
        minRow.fill(n + 1)
        minCol.fill(n + 1)
        for (b in buildings) {
            val x = b[0]
            val y = b[1]
            minRow[x] = min(minRow[x], y)
            maxRow[x] = max(maxRow[x], y)
            minCol[y] = min(minCol[y], x)
            maxCol[y] = max(maxCol[y], x)
        }
        var ans = 0
        for (arr in buildings) {
            val x = arr[0]
            val y = arr[1]
            if (minRow[x] < y && maxRow[x] > y && minCol[y] < x && maxCol[y] > x) {
                ans++
            }
        }
        return ans
    }

    fun countCoveredBuildings(n: Int, buildings: Array<IntArray>): Int {
        return helper(buildings, n)
    }
}
