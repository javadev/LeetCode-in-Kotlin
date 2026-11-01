package g3901_4000.s3963_create_grid_with_exactly_one_path

// #Easy #Mid_Level #Biweekly_Contest_185 #2026_10_20_Time_2_ms_(92.91%)_Space_45.85_MB_(97.87%)

class Solution {
    fun createGrid(m: Int, n: Int): Array<String> {
        val safeN = maxOf(0, n)
        val firstRow = ".".repeat(safeN)
        val subsequentRow = if (n > 0) {
            "#".repeat(maxOf(0, n - 1)) + "."
        } else {
            "".repeat(safeN)
        }
        return Array(m) { i ->
            if (i == 0) firstRow else subsequentRow
        }
    }
}
