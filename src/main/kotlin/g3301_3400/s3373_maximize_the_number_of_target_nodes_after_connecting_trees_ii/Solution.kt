package g3301_3400.s3373_maximize_the_number_of_target_nodes_after_connecting_trees_ii

// #Hard #Depth_First_Search #Breadth_First_Search #Tree
// #2024_12_03_Time_26_ms_(98.75%)_Space_114.7_MB_(80.00%)

import kotlin.math.max

class Solution {
    fun maxTargetNodes(edges1: Array<IntArray>, edges2: Array<IntArray>): IntArray {
        val n = edges1.size + 1
        val g1 = packU(n, edges1)
        val m = edges2.size + 1
        val g2 = packU(m, edges2)
        val p2 = parents(g2)
        val eo2 = IntArray(2)
        for (i in 0..<m) {
            eo2[p2[2][i] % 2]++
        }
        val max = max(eo2[0], eo2[1])
        val p1 = parents(g1)
        val eo1 = IntArray(2)
        for (i in 0..<n) {
            eo1[p1[2][i] % 2]++
        }
        val ans = IntArray(n)
        for (i in 0..<n) {
            ans[i] = eo1[p1[2][i] % 2] + max
        }
        return ans
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
