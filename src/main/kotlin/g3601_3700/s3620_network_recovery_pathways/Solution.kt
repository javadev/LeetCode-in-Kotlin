package g3601_3700.s3620_network_recovery_pathways

import kotlin.math.max
import kotlin.math.min

// #Hard #2025_07_20_Time_18_ms_(100.00%)_Space_120.24_MB_(100.00%)

class Solution {
    private var ans = -1
    private var d = 0
    private var k: Long = 0

    fun findMaxPathScore(edges: Array<IntArray>, online: BooleanArray, k: Long): Int {
        val n = online.size
        this.k = k
        this.d = n - 1
        val g: Array<ArrayList<P>> = Array(n) { ArrayList() }
        for (i in edges) {
            if (online[i[0]] && online[i[1]]) {
                g[i[0]].add(P(i[1], i[2]))
            }
        }
        dfs(g, 0, 0L, Int.Companion.MAX_VALUE)
        return ans
    }

    private fun dfs(g: Array<ArrayList<P>>, s: Int, tc: Long, max: Int) {
        if (s == d) {
            if (ans == -1) {
                ans = max
            } else {
                ans = max(ans, max)
            }
            return
        }
        for (i in g[s]) {
            val cost = tc + i.c
            if (ans != -1 && ans >= max) {
                return
            }
            if (cost <= k) {
                dfs(g, i.d, cost, min(max, i.c))
            }
        }
    }

    private class P(var d: Int, var c: Int)
}
