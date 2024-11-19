package g3201_3300.s3203_find_minimum_diameter_after_merging_two_trees

// #Hard #Depth_First_Search #Breadth_First_Search #Tree #Graph
// #2024_07_06_Time_1156_ms_(100.00%)_Space_119.4_MB_(80.00%)

import kotlin.math.max

class Solution {
    fun minimumDiameterAfterMerge(edges1: Array<IntArray>, edges2: Array<IntArray>): Int {
        val n = edges1.size + 1
        val g = packU(n, edges1)
        val m = edges2.size + 1
        val h = packU(m, edges2)
        val d1 = diameter(g)
        val d2 = diameter(h)
        var ans = max(d1[0], d2[0])
        ans = max(
            ((d1[0] + 1) / 2 + ((d2[0] + 1) / 2) + 1),
            ans,
        )
        return ans
    }

    private fun diameter(g: Array<IntArray?>): IntArray {
        val n = g.size
        val f0: Int
        val f1: Int
        val d01: Int
        val q = IntArray(n)
        val ved = BooleanArray(n)
        var qp = 0
        q[qp++] = 0
        ved[0] = true
        run {
            var i = 0
            while (i < qp) {
                val cur = q[i]
                for (e in g[cur]!!) {
                    if (!ved[e]) {
                        ved[e] = true
                        q[qp++] = e
                    }
                }
                i++
            }
        }
        f0 = q[n - 1]
        val d = IntArray(n)
        qp = 0
        ved.fill(false)
        q[qp++] = f0
        ved[f0] = true
        var i = 0
        while (i < qp) {
            val cur = q[i]
            for (e in g[cur]!!) {
                if (!ved[e]) {
                    ved[e] = true
                    q[qp++] = e
                    d[e] = d[cur] + 1
                }
            }
            i++
        }
        f1 = q[n - 1]
        d01 = d[f1]
        return intArrayOf(d01, f0, f1)
    }

    private fun packU(n: Int, ft: Array<IntArray>): Array<IntArray?> {
        val g = arrayOfNulls<IntArray>(n)
        val p = IntArray(n)
        for (u in ft) {
            p[u[0]]++
            p[u[1]]++
        }
        for (i in 0 until n) {
            g[i] = IntArray(p[i])
        }
        for (u in ft) {
            g[u[0]]!![--p[u[0]]] = u[1]
            g[u[1]]!![--p[u[1]]] = u[0]
        }
        return g
    }
}
