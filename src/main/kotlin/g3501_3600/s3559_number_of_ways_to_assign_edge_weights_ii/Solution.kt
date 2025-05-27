package g3501_3600.s3559_number_of_ways_to_assign_edge_weights_ii

// #Hard #Array #Dynamic_Programming #Math #Depth_First_Search #Tree
// #2025_05_25_Time_197_ms_(100.00%)_Space_158.27_MB_(100.00%)

import kotlin.math.ceil
import kotlin.math.ln

class Solution {
    private lateinit var adj: MutableList<MutableList<Int>>
    private lateinit var level: IntArray
    private lateinit var jumps: Array<IntArray?>

    private fun mark(node: Int, par: Int) {
        for (neigh in adj[node]) {
            if (neigh == par) {
                continue
            }
            level[neigh] = level[node] + 1
            jumps[neigh]!![0] = node
            mark(neigh, node)
        }
    }

    fun lift(u: Int, diff: Int): Int {
        var u = u
        var diff = diff
        while (diff > 0) {
            val rightmost = diff xor (diff and (diff - 1))
            val jump = (ln(rightmost.toDouble()) / ln(2.0)).toInt()
            u = jumps[u]!![jump]
            diff -= rightmost
        }
        return u
    }

    private fun findLca(u: Int, v: Int): Int {
        var u = u
        var v = v
        if (level[u] > level[v]) {
            val temp = u
            u = v
            v = temp
        }
        v = lift(v, level[v] - level[u])
        if (u == v) {
            return u
        }
        for (i in jumps[0]!!.indices.reversed()) {
            if (jumps[u]!![i] != jumps[v]!![i]) {
                u = jumps[u]!![i]
                v = jumps[v]!![i]
            }
        }
        return jumps[u]!![0]
    }

    private fun findDist(a: Int, b: Int): Int {
        return level[a] + level[b] - 2 * level[findLca(a, b)]
    }

    fun assignEdgeWeights(edges: Array<IntArray>, queries: Array<IntArray>): IntArray {
        val n = edges.size + 1
        adj = ArrayList<MutableList<Int>>()
        level = IntArray(n)
        for (i in 0..<n) {
            adj.add(ArrayList<Int>())
        }
        for (i in edges) {
            adj[i[0] - 1].add(i[1] - 1)
            adj[i[1] - 1].add(i[0] - 1)
        }
        val m = (ceil(ln(n - 1.0) / ln(2.0))).toInt() + 1
        jumps = Array<IntArray?>(n) { IntArray(m) }
        mark(0, -1)
        for (j in 1..<m) {
            for (i in 0..<n) {
                val p = jumps[i]!![j - 1]
                jumps[i]!![j] = jumps[p]!![j - 1]
            }
        }
        val pow = IntArray(n + 1)
        pow[0] = 1
        for (i in 1..n) {
            pow[i] = (pow[i - 1] * 2) % MOD
        }
        val q = queries.size
        val ans = IntArray(q)
        for (i in 0..<q) {
            val d = findDist(queries[i][0] - 1, queries[i][1] - 1)
            ans[i] = if (d > 0) pow[d - 1] else 0
        }
        return ans
    }

    companion object {
        private const val MOD = 1000000007
    }
}
