package g2801_2900.s2846_minimum_edge_weight_equilibrium_queries_in_a_tree

// #Hard #Array #Tree #Graph #Strongly_Connected_Component
// #2023_12_18_Time_982_ms_(100.00%)_Space_72.6_MB_(66.67%)

import kotlin.math.ln
import kotlin.math.max

class Solution {
    private class Node(var v: Int, var w: Int)

    fun minOperationsQueries(n: Int, edges: Array<IntArray>, queries: Array<IntArray>): IntArray {
        val graph = createGraph(edges, n)
        val queryCount = queries.size
        val res = IntArray(queryCount)
        val parent = IntArray(n)
        val level = IntArray(n)
        val weightFreq = Array(n) { IntArray(27) }
        val freq = IntArray(27)
        val height = (ln(n.toDouble()) / ln(2.0)).toInt() + 1
        val up = Array(n) { IntArray(height) }
        for (arr in up) {
            arr.fill(-1)
        }
        dfs(graph, 0, 0, -1, parent, level, weightFreq, freq)
        for (i in 0 until n) {
            up[i][0] = parent[i]
        }
        for (i in 1 until height) {
            for (j in 0 until n) {
                if (up[j][i - 1] == -1) {
                    up[j][i] = -1
                    continue
                }
                up[j][i] = up[up[j][i - 1]][i - 1]
            }
        }
        for (i in 0 until queryCount) {
            val src = queries[i][0]
            val dest = queries[i][1]
            val lcaNode = lca(src, dest, up, height, level)
            res[i] = processResult(weightFreq[src], weightFreq[dest], weightFreq[lcaNode])
        }
        return res
    }

    private fun lca(src: Int, dest: Int, up: Array<IntArray>, height: Int, level: IntArray): Int {
        var curr1 = src
        var curr2 = dest
        val minlevel: Int
        if (level[curr1] > level[curr2]) {
            minlevel = level[curr2]
            curr1 = getKthAncestor(curr1, level[curr1] - level[curr2], up, height)
        } else if (level[curr1] <= level[curr2]) {
            minlevel = level[curr1]
            curr2 = getKthAncestor(curr2, level[curr2] - level[curr1], up, height)
        } else {
            minlevel = level[curr1]
        }
        if (curr1 == curr2) {
            return curr1
        }
        var l = 0
        var h = level[curr2]
        while (l <= h) {
            val mid = l + (h - l) / 2
            val p1 = getKthAncestor(curr1, minlevel - mid, up, height)
            val p2 = getKthAncestor(curr2, minlevel - mid, up, height)
            if (p1 == p2) {
                l = mid + 1
            } else {
                h = mid - 1
            }
        }
        return getKthAncestor(curr1, minlevel - l + 1, up, height)
    }

    private fun getKthAncestor(node: Int, k: Int, up: Array<IntArray>, height: Int): Int {
        var curr = node
        var i = 0
        while (i < height && k shr i != 0) {
            if (((1 shl i) and k) != 0) {
                if (curr == -1) {
                    return -1
                }
                curr = up[curr][i]
            }
            i++
        }
        return curr
    }

    private fun processResult(freqSrc: IntArray, freqDest: IntArray, freqLCA: IntArray): Int {
        val freqPath = IntArray(27)
        for (i in 1..26) {
            freqPath[i] = freqSrc[i] + freqDest[i] - 2 * freqLCA[i]
        }
        var max = 0
        var pathlen = 0
        for (i in 1..26) {
            max = max(max.toDouble(), freqPath[i].toDouble()).toInt()
            pathlen += freqPath[i]
        }
        return pathlen - max
    }

    private fun dfs(
        graph: List<MutableList<Node>>,
        src: Int,
        currlevel: Int,
        p: Int,
        parent: IntArray,
        level: IntArray,
        weightFreq: Array<IntArray>,
        freq: IntArray
    ) {
        parent[src] = p
        level[src] = currlevel
        System.arraycopy(freq, 0, weightFreq[src], 0, freq.size)
        for (node in graph[src]) {
            val v = node.v
            val w = node.w
            if (v != p) {
                freq[w]++
                dfs(graph, v, currlevel + 1, src, parent, level, weightFreq, freq)
                freq[w]--
            }
        }
    }

    private fun createGraph(edges: Array<IntArray>, n: Int): List<MutableList<Node>> {
        val graph: MutableList<MutableList<Node>> = ArrayList()
        for (i in 0 until n) {
            graph.add(ArrayList())
        }
        for (edge in edges) {
            val u = edge[0]
            val v = edge[1]
            val w = edge[2]
            graph[u].add(Node(v, w))
            graph[v].add(Node(u, w))
        }
        return graph
    }
}
