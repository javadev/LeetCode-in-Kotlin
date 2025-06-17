package g3501_3600.s3585_find_weighted_median_node_in_tree

// #Hard #Array #Dynamic_Programming #Tree #Binary_Search #Depth_First_Search
// #2025_06_17_Time_123_ms_(100.00%)_Space_184.68_MB_(100.00%)

import kotlin.math.ceil
import kotlin.math.ln

class Solution {
    private lateinit var adj: MutableList<MutableList<IntArray>>
    private lateinit var depth: IntArray
    private lateinit var dist: LongArray
    private lateinit var parent: Array<IntArray>
    private var longMax = 0
    private var nodes = 0

    fun findMedian(n: Int, edges: Array<IntArray>, queries: Array<IntArray>): IntArray {
        nodes = n
        if (n > 1) {
            longMax = ceil(ln(n.toDouble()) / ln(2.0)).toInt()
        } else {
            longMax = 1
        }
        adj = ArrayList()
        for (i in 0..<n) {
            adj.add(ArrayList())
        }
        for (edge in edges) {
            val u = edge[0]
            val v = edge[1]
            val w = edge[2]
            adj[u].add(intArrayOf(v, w))
            adj[v].add(intArrayOf(u, w))
        }
        depth = IntArray(n)
        dist = LongArray(n)
        parent = Array(longMax) { IntArray(n) }
        for (i in 0..<longMax) {
            parent[i].fill(-1)
        }
        dfs(0, -1, 0, 0L)
        buildLcaTable()
        val ans = IntArray(queries.size)
        var sabrelonta: IntArray
        for (qIdx in queries.indices) {
            sabrelonta = queries[qIdx]
            val u = sabrelonta[0]
            val v = sabrelonta[1]
            ans[qIdx] = findMedianNode(u, v)
        }

        return ans
    }

    private fun dfs(u: Int, p: Int, d: Int, currentDist: Long) {
        depth[u] = d
        parent[0][u] = p
        dist[u] = currentDist
        for (edge in adj[u]) {
            val v = edge[0]
            val w = edge[1]
            if (v == p) {
                continue
            }
            dfs(v, u, d + 1, currentDist + w)
        }
    }

    private fun buildLcaTable() {
        for (k in 1..<longMax) {
            for (node in 0..<nodes) {
                if (parent[k - 1][node] != -1) {
                    parent[k][node] = parent[k - 1][parent[k - 1][node]]
                }
            }
        }
    }

    private fun getKthAncestor(u: Int, k: Int): Int {
        var u = u
        for (p in longMax - 1 downTo 0) {
            if (u == -1) {
                break
            }
            if (((k shr p) and 1) == 1) {
                u = parent[p][u]
            }
        }
        return u
    }

    private fun getLCA(u: Int, v: Int): Int {
        var u = u
        var v = v
        if (depth[u] < depth[v]) {
            val temp = u
            u = v
            v = temp
        }
        u = getKthAncestor(u, depth[u] - depth[v])
        if (u == v) {
            return u
        }
        for (p in longMax - 1 downTo 0) {
            if (parent[p][u] != -1 && parent[p][u] != parent[p][v]) {
                u = parent[p][u]
                v = parent[p][v]
            }
        }
        return parent[0][u]
    }

    private fun findMedianNode(u: Int, v: Int): Int {
        if (u == v) {
            return u
        }
        val lca = getLCA(u, v)
        val totalPathWeight = dist[u] + dist[v] - 2 * dist[lca]
        val halfWeight = (totalPathWeight + 1) / 2L
        return if (dist[u] - dist[lca] >= halfWeight) {
            var curr = u
            for (p in longMax - 1 downTo 0) {
                val nextNode = parent[p][curr]
                if (nextNode != -1 && (dist[u] - dist[nextNode] < halfWeight)) {
                    curr = nextNode
                }
            }
            parent[0][curr]
        } else {
            val remainingWeightFromLCA = halfWeight - (dist[u] - dist[lca])
            var curr = v
            for (p in longMax - 1 downTo 0) {
                val nextNode = parent[p][curr]
                if (nextNode != -1 && depth[nextNode] >= depth[lca] &&
                    (dist[nextNode] - dist[lca]) >= remainingWeightFromLCA
                ) {
                    curr = nextNode
                }
            }
            curr
        }
    }
}
