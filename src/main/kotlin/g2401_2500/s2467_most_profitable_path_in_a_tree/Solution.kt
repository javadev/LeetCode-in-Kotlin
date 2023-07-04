package g2401_2500.s2467_most_profitable_path_in_a_tree

// #Medium #Array #Depth_First_Search #Breadth_First_Search #Tree #Graph
class Solution {
    fun mostProfitablePath(edges: Array<IntArray>, bob: Int, amount: IntArray): Int {
        val n = amount.size
        val g = packU(n, edges)
        val pars = parents(g, 0)
        val par = pars[0]
        val ord = pars[1]
        val dep = pars[2]
        var u = bob
        for (i in 0 until (dep[bob] + 1) / 2) {
            amount[u] = 0
            u = par[u]
        }
        if (dep[bob] % 2 == 0) {
            amount[u] /= 2
        }
        val dp = IntArray(n)
        for (i in n - 1 downTo 0) {
            val cur = ord[i]
            if (g[cur]!!.size == 1 && i > 0) {
                dp[cur] = amount[cur]
            } else {
                dp[cur] = Int.MIN_VALUE / 2
                for (e in g[cur]!!) {
                    if (par[cur] == e) {
                        continue
                    }
                    dp[cur] = Math.max(dp[cur], dp[e] + amount[cur])
                }
            }
        }
        return dp[0]
    }

    private fun parents(g: Array<IntArray?>, root: Int): Array<IntArray> {
        val n = g.size
        val par = IntArray(n)
        par.fill(-1)
        val depth = IntArray(n)
        depth[0] = 0
        val q = IntArray(n)
        q[0] = root
        var r = 1
        for (p in 0 until r) {
            val cur = q[p]
            for (nex in g[cur]!!) {
                if (par[cur] != nex) {
                    q[r++] = nex
                    par[nex] = cur
                    depth[nex] = depth[cur] + 1
                }
            }
        }
        return arrayOf(par, q, depth)
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
