package g1001_1100.s1030_matrix_cells_in_distance_order

// #Easy #Array #Math #Sorting #Matrix #Geometry
// #2023_05_24_Time_426_ms_(100.00%)_Space_99.9_MB_(100.00%)

import java.util.TreeMap
import kotlin.math.abs

class Solution {
    fun allCellsDistOrder(rows: Int, cols: Int, rCenter: Int, cCenter: Int): Array<IntArray?> {
        val map: MutableMap<Int, MutableList<IntArray>> = TreeMap()
        for (i in 0 until rows) {
            for (j in 0 until cols) {
                map.computeIfAbsent(
                    abs(i - rCenter) + abs(j - cCenter),
                ) { ArrayList() }
                    .add(intArrayOf(i, j))
            }
        }
        val res = arrayOfNulls<IntArray>(rows * cols)
        var i = 0
        for (list in map.values) {
            for (each in list) {
                res[i++] = each
            }
        }
        return res
    }
}
