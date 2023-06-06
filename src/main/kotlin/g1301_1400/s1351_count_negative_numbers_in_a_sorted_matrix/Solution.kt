package g1301_1400.s1351_count_negative_numbers_in_a_sorted_matrix

// #Easy #Array #Binary_Search #Matrix #Binary_Search_I_Day_8
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
