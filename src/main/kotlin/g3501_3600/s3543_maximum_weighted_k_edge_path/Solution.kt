package g3501_3600.s3543_maximum_weighted_k_edge_path

// #Medium #2025_05_11_Time_680_ms_(100.00%)_Space_308.89_MB_(100.00%)

import kotlin.math.max

class Solution {
    private lateinit var dp: Array<Array<IntArray>>

    private class Pair(var node: Int, var wt: Int)

    fun maxWeight(n: Int, edges: Array<IntArray>, k: Int, t: Int): Int {
        if (k == 0) {
            return 0
        }
        dp = Array<Array<IntArray>>(n) { Array<IntArray>(k + 1) { IntArray(t + 1) } }
        for (i in 0..<n) {
            for (j in 0..k) {
                dp[i][j].fill(Int.Companion.MIN_VALUE)
            }
        }
        val adj: MutableList<MutableList<Pair>> = ArrayList<MutableList<Pair>>()
        for (i in 0..<n) {
            adj.add(ArrayList<Pair>())
        }
        for (edge in edges) {
            adj.get(edge[0]).add(Pair(edge[1], edge[2]))
        }
        var ans = -1
        for (start in 0..<n) {
            val res = dfs(adj, start, k, t, 0)
            ans = max(ans, res)
        }
        return ans
    }

    private fun dfs(adj: MutableList<MutableList<Pair>>, u: Int, stepsRemaining: Int, t: Int, currentSum: Int): Int {
        if (currentSum >= t) {
            return -1
        }
        if (stepsRemaining == 0) {
            return currentSum
        }
        val memo = dp[u][stepsRemaining][currentSum]
        if (memo != Int.Companion.MIN_VALUE) {
            return memo
        }
        var best = -1
        for (p in adj.get(u)) {
            val res = dfs(adj, p.node, stepsRemaining - 1, t, currentSum + p.wt)
            best = max(best, res)
        }
        dp[u][stepsRemaining][currentSum] = best
        return best
    }
}
