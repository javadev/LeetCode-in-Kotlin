package g2701_2800.s2711_difference_of_number_of_distinct_values_on_diagonals

// #Medium #Array #Hash_Table #Matrix #2023_07_31_Time_281_ms_(100.00%)_Space_44.5_MB_(70.00%)

class Solution {
    fun differenceOfDistinctValues(grid: Array<IntArray>): Array<IntArray> {
        val m = grid.size
        val n = grid[0].size
        val arrTopLeft = Array(m) { IntArray(n) }
        val arrBotRight = Array(m) { IntArray(n) }
        for (i in m - 1 downTo 0) {
            var c = 0
            var r: Int = i
            val set: MutableSet<Int> = HashSet()
            while (cellExists(r, c, grid)) {
                arrTopLeft[r][c] = set.size
                set.add(grid[r++][c++])
            }
        }
        for (i in 1 until n) {
            var r = 0
            var c: Int = i
            val set: MutableSet<Int> = HashSet()
            while (cellExists(r, c, grid)) {
                arrTopLeft[r][c] = set.size
                set.add(grid[r++][c++])
            }
        }
        for (i in 0 until n) {
            var r = m - 1
            var c: Int = i
            val set: MutableSet<Int> = HashSet()
            while (cellExists(r, c, grid)) {
                arrBotRight[r][c] = set.size
                set.add(grid[r--][c--])
            }
        }
        for (i in m - 1 downTo 0) {
            var c = n - 1
            var r: Int = i
            val set: MutableSet<Int> = HashSet()
            while (cellExists(r, c, grid)) {
                arrBotRight[r][c] = set.size
                set.add(grid[r--][c--])
            }
        }
        for (r in 0 until m) {
            for (c in 0 until n) {
                grid[r][c] = kotlin.math.abs(arrTopLeft[r][c] - arrBotRight[r][c])
            }
        }
        return grid
    }

    private fun cellExists(r: Int, c: Int, grid: Array<IntArray>): Boolean {
        return r >= 0 && r < grid.size && c >= 0 && c < grid[0].size
    }
}
