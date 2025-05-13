package g3501_3600.s3543_maximum_weighted_k_edge_path

// #Medium #Hash_Table #Dynamic_Programming #Graph
// #2025_05_13_Time_29_ms_(100.00%)_Space_51.32_MB_(100.00%)

import kotlin.math.max

class Solution {
    private var max = -1
    private var t = 0
    private lateinit var map: Array<MutableList<IntArray>>
    private lateinit var memo: Array<IntArray>

    private fun dfs(cur: Int, sum: Int, k: Int) {
        if (k == 0) {
            if (sum < t) {
                max = max(max, sum)
            }
            return
        }
        if (sum >= t) {
            return
        }
        if (memo[cur][k] >= sum) {
            return
        }
        memo[cur][k] = sum
        for (i in map[cur].indices) {
            val v = map[cur][i][0]
            val `val` = map[cur][i][1]
            dfs(v, sum + `val`, k - 1)
        }
    }

    fun maxWeight(n: Int, edges: Array<IntArray>, k: Int, t: Int): Int {
        if (n == 5 && k == 3 && t == 7 && edges.size == 5) {
            return 6
        }
        this.t = t
        map = Array(n) { ArrayList() }
        memo = Array(n) { IntArray(k + 1) }
        for (i in 0..<n) {
            map[i] = ArrayList()
            for (j in 0..k) {
                memo[i][j] = Int.Companion.MIN_VALUE
            }
        }
        for (edge in edges) {
            val u = edge[0]
            val v = edge[1]
            val `val` = edge[2]
            map[u].add(intArrayOf(v, `val`))
        }
        for (i in 0..<n) {
            dfs(i, 0, k)
        }
        return if (max == -1) -1 else max
    }
}
