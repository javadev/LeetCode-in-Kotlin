package g1201_1300.s1269_number_of_ways_to_stay_in_the_same_place_after_some_steps

// #Hard #Dynamic_Programming
class Solution {
    private var n = 0
    private lateinit var dp: Array<IntArray>

    private fun dfs(i: Int, st: Int): Int {
        if (i < 0 || i >= n) {
            return 0
        }
        if (st == 0) {
            return if (i == 0) 1 else 0
        }
        if (dp[i][st] == -1) {
            val mod = 1000000007
            dp[i][st] = ((dfs(i + 1, st - 1) + dfs(i, st - 1)) % mod + dfs(i - 1, st - 1)) % mod
        }
        return dp[i][st]
    }

    fun numWays(steps: Int, arrLen: Int): Int {
        n = Math.min(steps, arrLen)
        dp = Array(n) { IntArray(steps + 1) }
        for (i in 0 until n) {
            dp[i].fill(-1)
        }
        dfs(0, steps)
        return dp[0][steps]
    }
}
