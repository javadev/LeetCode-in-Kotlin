package g0701_0800.s0799_champagne_tower

// #Medium #Dynamic_Programming #2023_03_15_Time_153_ms_(100.00%)_Space_35_MB_(100.00%)

class Solution {
    fun champagneTower(poured: Int, queryRow: Int, queryGlass: Int): Double {
        var curRow = 0
        // first row
        var cur = doubleArrayOf(poured.toDouble())
        // second row
        var next = DoubleArray(2)
        var spilled: Boolean
        do {
            spilled = false
            for (i in cur.indices) {
                // spilling, put the excess into the next row.
                if (cur[i] > 1) {
                    val spilledAmount = cur[i] - 1
                    cur[i] = 1.0
                    next[i] += spilledAmount / 2
                    next[i + 1] = spilledAmount / 2
                    spilled = true
                }
            }
            // got to the desired row, return the glass amount
            if (curRow == queryRow) {
                return cur[queryGlass]
            }
            cur = next
            curRow++
            next = DoubleArray(curRow + 2)
        } while (spilled)
        // spill did not happen to the desired row
        return 0.0
    }
}
