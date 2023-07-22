package g2401_2500.s2500_delete_greatest_value_in_each_row

// #Easy #Array #Sorting #Matrix #2023_07_04_Time_204_ms_(80.00%)_Space_43.1_MB_(33.33%)

class Solution {
    fun deleteGreatestValue(grid: Array<IntArray>): Int {
        var sum = 0
        for (i in grid.indices) {
            grid[i].sort()
        }
        for (j in grid[0].indices) {
            var max = Int.MIN_VALUE
            for (i in grid.indices) {
                if (grid[i][j] > max) {
                    max = grid[i][j]
                }
            }
            sum += max
        }
        return sum
    }
}
