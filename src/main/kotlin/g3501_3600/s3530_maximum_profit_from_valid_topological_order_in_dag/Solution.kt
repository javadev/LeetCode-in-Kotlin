package g3501_3600.s3530_maximum_profit_from_valid_topological_order_in_dag

// #Hard #Array #Dynamic_Programming #Bit_Manipulation #Graph #Bitmask #Topological_Sort
// #2025_04_27_Time_833_ms_(100.00%)_Space_78.65_MB_(100.00%)

import kotlin.math.max

class Solution {
    private fun helper(
        mask: Int,
        pos: Int,
        inDegree: IntArray,
        adj: List<List<Int>>,
        score: IntArray,
        dp: IntArray,
        n: Int,
    ): Int {
        if (mask == (1 shl n) - 1) {
            return 0
        }
        if (dp[mask] != -1) {
            return dp[mask]
        }
        var res = 0
        for (i in 0..<n) {
            if ((mask and (1 shl i)) == 0 && inDegree[i] == 0) {
                for (ng in adj[i]) {
                    inDegree[ng]--
                }
                val `val` =
                    (
                        pos * score[i] +
                            helper(mask or (1 shl i), pos + 1, inDegree, adj, score, dp, n)
                        )
                res = max(res, `val`)
                for (ng in adj[i]) {
                    inDegree[ng]++
                }
            }
        }
        dp[mask] = res
        return res
    }

    fun maxProfit(n: Int, edges: Array<IntArray>, score: IntArray): Int {
        val adj: MutableList<MutableList<Int>> = ArrayList<MutableList<Int>>()
        for (i in 0..<n) {
            adj.add(ArrayList<Int>())
        }
        val inDegree = IntArray(n)
        for (e in edges) {
            adj[e[0]].add(e[1])
            inDegree[e[1]]++
        }
        val dp = IntArray(1 shl n)
        dp.fill(-1)
        return helper(0, 1, inDegree, adj, score, dp, n)
    }
}
