package g3701_3800.s3772_maximum_subgraph_score_in_a_tree

// #Hard #Array #Dynamic_Programming #Depth_First_Search #Tree #Senior_Staff #Weekly_Contest_479
// #2026_05_08_Time_35_ms_(100.00%)_Space_279.46_MB_(74.36%)

import kotlin.math.max

class Solution {
    fun maxSubgraphScore(n: Int, edges: Array<IntArray>, good: IntArray): IntArray {
        val h = IntArray(n)
        val e = IntArray(2 * (n - 1))
        val ne = IntArray(2 * (n - 1))
        var idx = 0
        h.fill(-1)
        for (ed in edges) {
            val a = ed[0]
            val b = ed[1]
            e[idx] = b
            ne[idx] = h[a]
            h[a] = idx
            idx++
            e[idx] = a
            ne[idx] = h[b]
            h[b] = idx
            idx++
        }
        val v = IntArray(n)
        for (i in 0..<n) {
            v[i] = if (good[i] == 1) 1 else -1
        }
        val dp = IntArray(n)
        val p = IntArray(n)
        val ord = IntArray(n)
        var top = 0
        p.fill(-1)
        val st = IntArray(n)
        var sp = 0
        val vis = BooleanArray(n)
        st[sp++] = 0
        vis[0] = true
        while (sp > 0) {
            val u = st[--sp]
            ord[top++] = u
            var i = h[u]
            while (i != -1) {
                val w = e[i]
                if (!vis[w]) {
                    vis[w] = true
                    p[w] = u
                    st[sp++] = w
                }
                i = ne[i]
            }
        }
        for (i in n - 1 downTo 0) {
            val u = ord[i]
            dp[u] = v[u]
            var j = h[u]
            while (j != -1) {
                val w = e[j]
                if (p[w] == u && dp[w] > 0) {
                    dp[u] += dp[w]
                }
                j = ne[j]
            }
        }
        val ans = IntArray(n)
        ans[0] = dp[0]
        for (i in 1..<n) {
            val u = ord[i]
            val par = p[u]
            val pc = ans[par] - max(0, dp[u])
            ans[u] = dp[u] + max(0, pc)
        }
        return ans
    }
}
