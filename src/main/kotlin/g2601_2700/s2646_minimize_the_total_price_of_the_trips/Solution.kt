package g2601_2700.s2646_minimize_the_total_price_of_the_trips

// #Hard #Array #Dynamic_Programming #Depth_First_Search #Tree #Graph
// #2023_07_19_Time_264_ms_(100.00%)_Space_39.6_MB_(100.00%)

class Solution {
    fun minimumTotalPrice(n: Int, edges: Array<IntArray>, price: IntArray, trips: Array<IntArray>): Int {
        val counts = IntArray(n)
        val adj: MutableList<MutableList<Int?>?> = ArrayList()
        for (i in 0 until n) adj.add(ArrayList())
        for (edge in edges) {
            adj[edge[0]]!!.add(edge[1])
            adj[edge[1]]!!.add(edge[0])
        }
        for (trip in trips) {
            val vis = BooleanArray(n)
            dfsTraverse(trip[0], trip[1], counts, adj, vis)
        }
        val dp = IntArray(n)
        for (i in dp.indices) {
            dp[i] = -1
        }
        val paths = BooleanArray(n)
        return dpDFS(n - 1, dp, adj, paths, price, counts)
    }

    private fun dfsTraverse(
        start: Int,
        tgt: Int,
        counts: IntArray,
        adj: MutableList<MutableList<Int?>?>,
        vis: BooleanArray,
    ): Boolean {
        if (vis[start]) return false
        vis[start] = true
        if (start == tgt) {
            counts[start]++
            return true
        }
        var ans = false
        for (adjacent in adj[start]!!) {
            ans = ans or dfsTraverse(adjacent!!, tgt, counts, adj, vis)
        }
        if (ans) {
            counts[start]++
        }
        return ans
    }

    private fun dpDFS(
        node: Int,
        dp: IntArray,
        adj: MutableList<MutableList<Int?>?>,
        paths: BooleanArray,
        prices: IntArray,
        counts: IntArray,
    ): Int {
        if (paths[node]) return 0
        if (dp[node] != -1) return dp[node]
        var ans1 = 0
        var ans2 = 0
        var childval = 0
        paths[node] = true
        for (child1 in adj[node]!!) {
            if (paths[child1!!]) continue
            paths[child1] = true
            for (child2 in adj[child1]!!) {
                val `val` = dpDFS(child2!!, dp, adj, paths, prices, counts)
                ans2 += `val`
            }
            paths[child1] = false
            childval += counts[child1] * prices[child1]
            ans1 += dpDFS(child1, dp, adj, paths, prices, counts)
        }
        val ans = (ans2 + childval + prices[node] * counts[node] / 2).coerceAtMost(ans1 + prices[node] * counts[node])
        paths[node] = false
        return ans.also { dp[node] = it }
    }
}
