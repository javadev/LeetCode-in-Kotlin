package g2601_2700.s2639_find_the_width_of_columns_of_a_grid

// #Easy #Array #Matrix #2023_07_18_Time_222_ms_(100.00%)_Space_38.6_MB_(90.00%)

class Solution {
    fun findColumnWidth(grid: Array<IntArray>): IntArray {
        val ans = IntArray(grid[0].size) { 1 }
        for (j in 0 until grid[0].size) {
            var max = 1
            for (i in 0 until grid.size) {
                var num = grid[i][j]
                var neg = false
                if (num < 0) {
                    neg = true
                    num *= -1
                }
                var size = 0
                while (num > 0) {
                    num /= 10
                    size++
                }
                if (neg) {
                    size += 1
                }
                max = maxOf(max, size)
            }
            ans[j] = max
        }
        return ans
    }
}
