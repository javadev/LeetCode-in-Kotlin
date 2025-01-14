package g3401_3500.s3417_zigzag_grid_traversal_with_skip

// #Easy #2025_01_14_Time_2_(100.00%)_Space_43.72_(76.92%)

class Solution {
    fun zigzagTraversal(grid: Array<IntArray>): List<Int> {
        val ans: MutableList<Int> = ArrayList<Int>()
        val m = grid.size
        val n = grid[0].size
        var i = 0
        var flag = true
        var skip = false
        while (i < m) {
            if (flag) {
                for (j in 0..<n) {
                    if (!skip) {
                        ans.add(grid[i][j])
                    }
                    skip = !skip
                }
            } else {
                for (j in n - 1 downTo 0) {
                    if (!skip) {
                        ans.add(grid[i][j])
                    }
                    skip = !skip
                }
            }
            flag = !flag
            i++
        }
        return ans
    }
}
