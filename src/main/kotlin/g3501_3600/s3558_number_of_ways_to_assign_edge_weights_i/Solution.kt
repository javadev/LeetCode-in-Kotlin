package g3501_3600.s3558_number_of_ways_to_assign_edge_weights_i

// #Medium #2025_05_25_Time_160_ms_(100.00%)_Space_149.66_MB_(100.00%)

import java.util.LinkedList
import java.util.Queue

class Solution {
    fun assignEdgeWeights(edges: Array<IntArray>): Int {
        val n = edges.size + 1
        val adj: MutableList<MutableList<Int>> = ArrayList<MutableList<Int>>()
        for (i in 0..n) {
            adj.add(ArrayList<Int>())
        }
        for (i in edges) {
            adj[i[0]].add(i[1])
            adj[i[1]].add(i[0])
        }
        val l = IntArray(n + 1)
        var max = 0
        l.fill(-1)
        val q: Queue<IntArray> = LinkedList<IntArray>()
        q.offer(intArrayOf(1, 0))
        l[1] = 0
        while (q.isNotEmpty()) {
            val curr = q.peek()!![0]
            val level = q.peek()!![1]
            if (l[max] < l[curr]) {
                max = curr
            }
            q.remove()
            for (next in adj[curr]) {
                if (l[next] != -1) {
                    continue
                }
                q.offer(intArrayOf(next, level + 1))
                l[next] = level + 1
            }
        }
        val dp: Array<IntArray> = Array<IntArray>(l[max]) { IntArray(2) }
        for (i in dp) {
            i.fill(-1)
        }
        return solve(0, 0, dp)
    }

    private fun solve(ind: Int, odd: Int, dp: Array<IntArray>): Int {
        if (ind == dp.size) {
            return if (odd == 1) {
                1
            } else {
                0
            }
        }
        if (dp[ind][odd] != -1) {
            return dp[ind][odd]
        }
        dp[ind][odd] =
            (solve(ind + 1, odd, dp) % MOD + solve(ind + 1, (odd + 1) % 2, dp) % MOD) % MOD
        return dp[ind][odd]
    }

    companion object {
        private const val MOD = 1e9.toInt() + 7
    }
}
