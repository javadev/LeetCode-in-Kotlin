package g3801_3900.s3882_minimum_xor_path_in_a_grid

// #Medium #Array #Dynamic_Programming #Matrix #Bit_Manipulation #Staff #Biweekly_Contest_179
// #2026_08_13_Time_8_ms_(100.00%)_Space_48.02_MB_(85.51%)

import kotlin.math.min

class Solution {
    private var ans = 0
    private lateinit var memo: Array<Array<BooleanArray>>

    fun minCost(grid: Array<IntArray>): Int {
        ans = Int.MAX_VALUE
        memo = Array<Array<BooleanArray>>(grid.size) { Array<BooleanArray>(grid[0]!!.size) { BooleanArray(1024) } }
        dfs(grid, 0, 0, 0, grid.size, grid[0]!!.size)
        return ans
    }

    private fun dfs(grid: Array<IntArray>, i: Int, j: Int, xor: Int, m: Int, n: Int) {
        var xor = xor
        xor = xor xor grid[i]!![j]
        if (ans == 0) {
            return
        }
        if (memo[i]!![j]!![xor]) {
            return
        }
        memo[i]!![j]!![xor] = true
        if (i == m - 1 && j == n - 1) {
            ans = min(ans, xor)
            return
        }
        if (i + 1 < m) {
            dfs(grid, i + 1, j, xor, m, n)
        }
        if (j + 1 < n) {
            dfs(grid, i, j + 1, xor, m, n)
        }
    }
}
