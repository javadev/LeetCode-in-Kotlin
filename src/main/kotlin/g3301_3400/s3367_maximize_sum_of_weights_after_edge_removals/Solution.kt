package g3301_3400.s3367_maximize_sum_of_weights_after_edge_removals

// #Hard #Dynamic_Programming #Depth_First_Search #Tree
// #2024_11_27_Time_118_ms_(100.00%)_Space_140.5_MB_(100.00%)

import java.util.PriorityQueue
import kotlin.math.max

class Solution {
    private lateinit var adj: Array<MutableList<IntArray>>
    private var k = 0

    fun maximizeSumOfWeights(edges: Array<IntArray>, k: Int): Long {
        val n = edges.size + 1
        adj = Array(n) { ArrayList<IntArray>() }
        this.k = k
        for (i in 0..<n) {
            adj[i] = ArrayList<IntArray>()
        }
        for (e in edges) {
            adj[e[0]].add(e)
            adj[e[1]].add(e)
        }
        return dfs(0, -1)[1]
    }

    private fun dfs(v: Int, parent: Int): LongArray {
        var sum: Long = 0
        val pq = PriorityQueue<Long?>()
        for (e in adj[v]) {
            val w = if (e[0] == v) e[1] else e[0]
            if (w == parent) {
                continue
            }
            val res = dfs(w, v)
            val max = max((e[2] + res[0]), res[1])
            sum += max
            pq.add(max - res[1])
        }
        val res = LongArray(2)
        while (pq.size > k) {
            sum -= pq.poll()!!
        }
        res[1] = sum
        while (pq.size > k - 1) {
            sum -= pq.poll()!!
        }
        res[0] = sum
        return res
    }
}
