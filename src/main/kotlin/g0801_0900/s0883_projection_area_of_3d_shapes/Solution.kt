package g0801_0900.s0883_projection_area_of_3d_shapes

// #Easy #Array #Math #Matrix #Geometry #2023_04_08_Time_173_ms_(100.00%)_Space_35_MB_(100.00%)

class Solution {
    fun projectionArea(grid: Array<IntArray>): Int {
        val n = grid.size
        val m = grid[0].size
        var sum = n * m
        var count = 0
        for (ints in grid) {
            var max = Int.MIN_VALUE
            for (j in 0 until m) {
                if (ints[j] == 0) {
                    count++
                }
                if (max < ints[j]) {
                    max = ints[j]
                }
            }
            sum += max
        }
        for (i in 0 until n) {
            var max = Int.MIN_VALUE
            for (j in 0 until m) {
                if (max < grid[j][i]) {
                    max = grid[j][i]
                }
            }
            sum += max
        }
        return sum - count
    }
}