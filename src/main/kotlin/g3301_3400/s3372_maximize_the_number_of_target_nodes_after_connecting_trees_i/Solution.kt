package g3301_3400.s3372_maximize_the_number_of_target_nodes_after_connecting_trees_i

// #Medium #Depth_First_Search #Breadth_First_Search #Tree
// #2024_12_03_Time_50_ms_(99.49%)_Space_75.7_MB_(5.10%)

import kotlin.math.max

class Solution {
    private fun getGraph(edges: Array<IntArray>): Array<ArrayList<Int>> {
        val n = edges.size + 1
        val graph: Array<ArrayList<Int>> = Array<ArrayList<Int>>(n) { ArrayList<Int>() }
        for (edge in edges) {
            val u = edge[0]
            val v = edge[1]
            graph[u].add(v)
            graph[v].add(u)
        }
        return graph
    }

    private fun dfs(graph: Array<ArrayList<Int>>, u: Int, pt: Int, dp: Array<IntArray>, k: Int) {
        for (v in graph[u]) {
            if (v == pt) {
                continue
            }
            dfs(graph, v, u, dp, k)
            for (i in 0..<k) {
                dp[u][i + 1] += dp[v][i]
            }
        }
        dp[u][0] = dp[u][0] + 1
    }

    private fun dfs2(
        graph: Array<ArrayList<Int>>,
        u: Int,
        pt: Int,
        ptv: IntArray,
        fdp: Array<IntArray>,
        dp: Array<IntArray>,
        k: Int,
    ) {
        fdp[u][0] = dp[u][0]
        for (i in 1..k) {
            fdp[u][i] = (dp[u][i] + ptv[i - 1])
        }
        for (v in graph[u]) {
            if (v == pt) {
                continue
            }
            val nptv = IntArray(k + 1)
            for (i in 0..<k) {
                nptv[i + 1] = dp[u][i + 1] - dp[v][i] + ptv[i]
            }
            nptv[0] = 1
            dfs2(graph, v, u, nptv, fdp, dp, k)
        }
    }

    private fun get(edges: Array<IntArray>, k: Int): Array<IntArray> {
        val graph = getGraph(edges)
        val n = graph.size
        val dp = Array<IntArray>(n) { IntArray(k + 1) }
        val fdp = Array<IntArray>(n) { IntArray(k + 1) }
        dfs(graph, 0, -1, dp, k)
        dfs2(graph, 0, -1, IntArray(k + 1), fdp, dp, k)
        for (i in 0..<n) {
            for (j in 1..k) {
                fdp[i][j] += fdp[i][j - 1]
            }
        }
        return fdp
    }

    fun maxTargetNodes(edges1: Array<IntArray>, edges2: Array<IntArray>, k: Int): IntArray {
        val a = get(edges1, k)
        val b = get(edges2, k)
        val n = a.size
        val m = b.size
        val ans = IntArray(n)
        var max = 0
        run {
            var i = 0
            while (k != 0 && i < m) {
                max = max(max.toDouble(), b[i][k - 1].toDouble()).toInt()
                i++
            }
        }
        for (i in 0..<n) {
            ans[i] = a[i][k] + max
        }
        return ans
    }
}
