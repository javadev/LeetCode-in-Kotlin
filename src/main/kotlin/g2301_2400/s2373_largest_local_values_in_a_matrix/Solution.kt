package g2301_2400.s2373_largest_local_values_in_a_matrix

// #Easy #Array #Matrix
class Solution {
    fun largestLocal(grid: Array<IntArray>): Array<IntArray> {
        val n = grid.size
        val res = Array(n - 2) { IntArray(n - 2) }
        for (i in 0 until n - 2) {
            for (j in 0 until n - 2) {
                for (p in i until i + 3) {
                    for (q in j until j + 3) {
                        res[i][j] = Math.max(res[i][j], grid[p][q])
                    }
                }
            }
        }
        return res
    }
}
