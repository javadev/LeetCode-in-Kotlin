package g2501_2600.s2579_count_total_number_of_colored_cells

// #Medium #Math #2023_07_10_Time_109_ms_(100.00%)_Space_32.9_MB_(100.00%)

class Solution {
    fun coloredCells(n: Int): Long {
        return Math.pow(n.toDouble(), 2.0).toLong() + Math.pow((n - 1).toDouble(), 2.0).toLong()
    }
}
