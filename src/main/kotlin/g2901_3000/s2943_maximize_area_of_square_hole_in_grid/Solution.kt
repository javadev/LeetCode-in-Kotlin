package g2901_3000.s2943_maximize_area_of_square_hole_in_grid

// #Medium #Array #Sorting #2024_01_07_Time_180_ms_(86.67%)_Space_38.1_MB_(60.00%)

import kotlin.math.max
import kotlin.math.min

class Solution {
    fun maximizeSquareHoleArea(n: Int, m: Int, hBars: IntArray, vBars: IntArray): Int {
        val x = find(hBars)
        val y = find(vBars)
        val res = min(x, y) + 1
        return res * res
    }

    private fun find(arr: IntArray): Int {
        arr.sort()
        var res = 1
        var i = 0
        val n = arr.size
        while (i < n) {
            var count = 1
            while (i + 1 < n && arr[i] + 1 == arr[i + 1]) {
                i++
                count++
            }
            i++
            res = max(res, count)
        }
        return res
    }
}
