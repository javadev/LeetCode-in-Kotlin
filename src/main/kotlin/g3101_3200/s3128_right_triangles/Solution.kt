package g3101_3200.s3128_right_triangles // #Medium #Array #Hash_Table #Math #Counting #Combinatorics
// #2024_05_02_Time_6_ms_(100.00%)_Space_145.9_MB_(90.67%)

class Solution {
    fun numberOfRightTriangles(grid: Array<IntArray>): Long {
        val n = grid.size
        val m = grid[0].size
        val columns = IntArray(n)
        val rows = IntArray(m)
        var sum: Long = 0
        for (i in 0 until n) {
            for (j in 0 until m) {
                columns[i] += grid[i][j]
                rows[j] += grid[i][j]
            }
        }
        for (i in 0 until n) {
            for (j in 0 until m) {
                sum += grid[i][j].toLong() * (rows[j] - 1) * (columns[i] - 1)
            }
        }
        return sum
    }
}
