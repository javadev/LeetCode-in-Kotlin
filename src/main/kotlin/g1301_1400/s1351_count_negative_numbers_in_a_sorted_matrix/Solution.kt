package g1301_1400.s1351_count_negative_numbers_in_a_sorted_matrix

// #Easy #Array #Binary_Search #Matrix #Binary_Search_I_Day_8
// #2023_06_06_Time_206_ms_(71.43%)_Space_38.3_MB_(85.71%)

class Solution {
    fun countNegatives(grid: Array<IntArray>): Int {
        var count = 0
        for (row in grid) {
            for (v in row) {
                if (v < 0) {
                    count++
                }
            }
        }
        return count
    }
}
