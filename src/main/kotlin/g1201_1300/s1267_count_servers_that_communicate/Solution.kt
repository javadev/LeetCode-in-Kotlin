package g1201_1300.s1267_count_servers_that_communicate

// #Medium #Array #Depth_First_Search #Breadth_First_Search #Matrix #Counting #Union_Find
// #2023_06_08_Time_295_ms_(100.00%)_Space_53.9_MB_(75.00%)

class Solution {
    fun countServers(grid: Array<IntArray>): Int {
        val m = grid.size
        val n = grid[0].size
        val rowCount = IntArray(m)
        val columnCount = IntArray(n)
        var total = 0
        for (i in 0 until m) {
            for (j in 0 until n) {
                if (grid[i][j] == 1) {
                    rowCount[i]++
                    columnCount[j]++
                    total++
                }
            }
        }
        for (i in 0 until m) {
            for (j in 0 until n) {
                if (grid[i][j] == 1 && rowCount[i] == 1 && columnCount[j] == 1) {
                    total--
                }
            }
        }
        return total
    }
}
