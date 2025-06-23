package g3501_3600.s3593_minimum_increments_to_equalize_leaf_paths

// #Medium #Array #Dynamic_Programming #Depth_First_Search #Tree
// #2025_06_23_Time_37_ms_(100.00%)_Space_105.50_MB_(100.00%)

import kotlin.math.max

class Solution {
    fun minIncrease(n: Int, edges: Array<IntArray>, cost: IntArray): Int {
        val g = packU(n, edges)
        val pars = parents(g)
        val par = pars[0]
        val ord = pars[1]
        val dp = LongArray(n)
        var ret = 0
        for (i in n - 1 downTo 0) {
            val cur = ord[i]
            var max: Long = -1
            for (e in g[cur]) {
                if (par[cur] != e) {
                    max = max(max, dp[e])
                }
            }
            for (e in g[cur]) {
                if (par[cur] != e && dp[e] != max) {
                    ret++
                }
            }
            dp[cur] = max + cost[cur]
        }
        return ret
    }

    private fun parents(g: Array<IntArray>): Array<IntArray> {
        val n = g.size
        val par = IntArray(n)
        par.fill(-1)
        val depth = IntArray(n)
        depth[0] = 0
        val q = IntArray(n)
        q[0] = 0
        var p = 0
        var r = 1
        while (p < r) {
            val cur = q[p]
            for (nex in g[cur]) {
                if (par[cur] != nex) {
                    q[r++] = nex
                    par[nex] = cur
                    depth[nex] = depth[cur] + 1
                }
            }
            p++
        }
        return arrayOf<IntArray>(par, q, depth)
    }

    private fun packU(n: Int, ft: Array<IntArray>): Array<IntArray> {
        val g = Array<IntArray>(n) { IntArray(0) }
        val p = IntArray(n)
        for (u in ft) {
            p[u[0]]++
            p[u[1]]++
        }
        for (i in 0..<n) {
            g[i] = IntArray(p[i])
        }
        for (u in ft) {
            g[u[0]][--p[u[0]]] = u[1]
            g[u[1]][--p[u[1]]] = u[0]
        }
        return g
    }
}
