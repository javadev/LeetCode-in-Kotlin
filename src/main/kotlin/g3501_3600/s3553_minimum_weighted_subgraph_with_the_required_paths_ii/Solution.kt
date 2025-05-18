package g3501_3600.s3553_minimum_weighted_subgraph_with_the_required_paths_ii

// #Hard #2025_05_18_Time_142_ms_(100.00%)_Space_131.32_MB_(100.00%)

import kotlin.math.max

class Solution {
    private lateinit var graph: Array<MutableList<IntArray>?>
    private lateinit var euler: IntArray
    private lateinit var depth: IntArray
    private lateinit var firstcome: IntArray
    private lateinit var sparseT: Array<IntArray?>
    private var times = 0
    private lateinit var dists: LongArray

    fun minimumWeight(edges: Array<IntArray>, queries: Array<IntArray>): IntArray {
        var p = 0
        for (e in edges) {
            p = max(p, max(e[0], e[1]))
        }
        p++
        graph = Array(p) { ArrayList() }
        for (e in edges) {
            val u = e[0]
            val v = e[1]
            val w = e[2]
            graph[u]!!.add(intArrayOf(v, w))
            graph[v]!!.add(intArrayOf(u, w))
        }
        val m = 2 * p - 1
        euler = IntArray(m)
        depth = IntArray(m)
        firstcome = IntArray(p)
        firstcome.fill(-1)
        dists = LongArray(p)
        times = 0
        dfs(0, -1, 0, 0L)
        buildSparseTable(m)
        val answer = IntArray(queries.size)
        for (i in queries.indices) {
            val a = queries[i][0]
            val b = queries[i][1]
            val c = queries[i][2]
            val d1 = distBetween(a, b)
            val d2 = distBetween(b, c)
            val d3 = distBetween(a, c)
            answer[i] = ((d1 + d2 + d3) / 2).toInt()
        }
        return answer
    }

    private fun dfs(node: Int, parent: Int, d: Int, distSoFar: Long) {
        euler[times] = node
        depth[times] = d
        if (firstcome[node] == -1) {
            firstcome[node] = times
        }
        times++
        dists[node] = distSoFar
        for (edge in graph[node]!!) {
            val nxt = edge[0]
            val w = edge[1]
            if (nxt == parent) {
                continue
            }
            dfs(nxt, node, d + 1, distSoFar + w)
            euler[times] = node
            depth[times] = d
            times++
        }
    }

    private fun buildSparseTable(length: Int) {
        var log = 1
        while ((1 shl log) <= length) {
            log++
        }
        sparseT = Array(log) { IntArray(length) }
        for (i in 0..<length) {
            sparseT[0]!![i] = i
        }
        for (k in 1..<log) {
            var i = 0
            while (i + (1 shl k) <= length) {
                val left = sparseT[k - 1]!![i]
                val right = sparseT[k - 1]!![i + (1 shl (k - 1))]
                sparseT[k]!![i] = if (depth[left] < depth[right]) left else right
                i++
            }
        }
    }

    private fun rmq(l: Int, r: Int): Int {
        var l = l
        var r = r
        if (l > r) {
            val tmp = l
            l = r
            r = tmp
        }
        val length = r - l + 1
        val k = 31 - Integer.numberOfLeadingZeros(length)
        val left = sparseT[k]!![l]
        val right = sparseT[k]!![r - (1 shl k) + 1]
        return if (depth[left] < depth[right]) left else right
    }

    private fun lca(u: Int, v: Int): Int {
        val left = firstcome[u]
        val right = firstcome[v]
        val idx = rmq(left, right)
        return euler[idx]
    }

    private fun distBetween(u: Int, v: Int): Long {
        val ancestor = lca(u, v)
        return dists[u] + dists[v] - 2 * dists[ancestor]
    }
}
