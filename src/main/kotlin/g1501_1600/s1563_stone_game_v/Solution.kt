package g1501_1600.s1563_stone_game_v

// #Hard #Array #Dynamic_Programming #Math #Game_Theory
class Solution {
    fun stoneGameV(stoneValue: IntArray): Int {
        val n = stoneValue.size
        val ps = IntArray(n)
        ps[0] = stoneValue[0]
        for (i in 1 until n) {
            ps[i] = ps[i - 1] + stoneValue[i]
        }
        return gameDP(ps, 0, n - 1, Array<Array<Int?>>(n) { arrayOfNulls(n) })
    }

    private fun gameDP(ps: IntArray, i: Int, j: Int, dp: Array<Array<Int?>>): Int {
        if (i == j) {
            return 0
        }
        if (dp[i][j] != null) {
            return dp[i][j]!!
        }
        var max = 0
        for (k in i + 1..j) {
            val l = ps[k - 1] - if (i == 0) 0 else ps[i - 1]
            val r = ps[j] - ps[k - 1]
            if (2 * Math.min(l, r) < max) {
                continue
            }
            if (l <= r) {
                max = Math.max(max, l + gameDP(ps, i, k - 1, dp))
            }
            if (l >= r) {
                max = Math.max(max, r + gameDP(ps, k, j, dp))
            }
        }
        dp[i][j] = max
        return max
    }
}
