package g3501_3600.s3600_maximize_spanning_tree_stability_with_upgrades

// #Hard #Greedy #Binary_Search #Graph #Union_Find #Minimum_Spanning_Tree
// #2025_06_30_Time_34_ms_(100.00%)_Space_152.67_MB_(100.00%)

import kotlin.math.max

class Solution {
    fun maxStability(n: Int, edges: Array<IntArray>, k: Int): Int {
        var low = 0
        var high = 0
        for (edge in edges) {
            high = max(high, edge[2])
        }
        high *= 2
        var ans = -1
        while (low <= high) {
            val mid = (low + high) / 2
            if (feasible(mid, n, edges, k)) {
                ans = mid
                low = mid + 1
            } else {
                high = mid - 1
            }
        }
        return ans
    }

    private fun feasible(t: Int, n: Int, edges: Array<IntArray>, k: Int): Boolean {
        val par = IntArray(n)
        val rnk = IntArray(n)
        val comp = intArrayOf(n)
        for (i in 0..<n) {
            par[i] = i
        }
        val uf = UnionFind(par, rnk, comp)
        var cost = 0
        val half = (t + 1) / 2
        for (edge in edges) {
            val u = edge[0]
            val v = edge[1]
            val s = edge[2]
            val m = edge[3]
            if (m == 1 && (s < t || !uf.union(u, v))) {
                return false
            }
        }
        for (edge in edges) {
            val u = edge[0]
            val v = edge[1]
            val s = edge[2]
            val m = edge[3]
            if (m == 0 && s >= t) {
                uf.union(u, v)
            }
        }
        if (comp[0] == 1) {
            return true
        }
        for (edge in edges) {
            val u = edge[0]
            val v = edge[1]
            val s = edge[2]
            val m = edge[3]
            if (m == 0 && s >= half && s < t && uf.union(u, v)) {
                cost++
                if (cost > k) {
                    return false
                }
            }
        }
        return comp[0] == 1
    }

    private class UnionFind(var par: IntArray, var rnk: IntArray, var comp: IntArray) {
        fun find(x: Int): Int {
            if (par[x] != x) {
                par[x] = find(par[x])
            }
            return par[x]
        }

        fun union(a: Int, b: Int): Boolean {
            var ra = find(a)
            var rb = find(b)
            if (ra == rb) {
                return false
            }
            if (rnk[ra] < rnk[rb]) {
                val temp = ra
                ra = rb
                rb = temp
            }
            par[rb] = ra
            if (rnk[ra] == rnk[rb]) {
                rnk[ra]++
            }
            comp[0]--
            return true
        }
    }
}
