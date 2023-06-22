package g2001_2100.s2017_grid_game

// #Medium #Array #Matrix #Prefix_Sum
class Solution {
    fun gridGame(grid: Array<IntArray>): Long {
        val n = grid[0].size
        val cum0 = LongArray(n + 1)
        val cum1 = LongArray(n + 1)
        for (i in 0 until n) {
            cum0[i + 1] = cum0[i] + grid[0][i]
            cum1[i + 1] = cum1[i] + grid[1][i]
        }
        var ans = Long.MAX_VALUE
        for (i in 0 until n) {
            ans = Math.min(ans, Math.max(cum0[n] - cum0[i + 1], cum1[i]))
        }
        return ans
    }
}
