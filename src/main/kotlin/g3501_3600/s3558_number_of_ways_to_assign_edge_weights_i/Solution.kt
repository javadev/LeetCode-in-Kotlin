package g3501_3600.s3558_number_of_ways_to_assign_edge_weights_i

import java.util.*

// #Medium #2025_05_25_Time_118_ms_(100.00%)_Space_122.30_MB_(100.00%)

class Solution {
    fun assignEdgeWeights(edges: Array<IntArray>): Int {
        val n = edges.size + 1
        val adj: MutableList<MutableList<Int?>?> = ArrayList<MutableList<Int?>?>()
        for (i in 0..n) {
            adj.add(ArrayList<Int?>())
        }
        for (i in edges) {
            adj.get(i[0])!!.add(i[1])
            adj.get(i[1])!!.add(i[0])
        }
        val l = IntArray(n + 1)
        var max = 0
        Arrays.fill(l, -1)
        val q: Queue<IntArray?> = LinkedList<IntArray?>()
        q.offer(intArrayOf(1, 0))
        l[1] = 0
        while (!q.isEmpty()) {
            val curr = q.peek()!![0]
            val level = q.peek()!![1]
            if (l[max] < l[curr]) {
                max = curr
            }
            q.remove()
            for (next in adj.get(curr)!!) {
                if (l[next!!] != -1) {
                    continue
                }
                q.offer(intArrayOf(next, level + 1))
                l[next] = level + 1
            }
        }
        val dp: Array<IntArray> = Array<IntArray>(l[max]) { IntArray(2) }
        for (i in dp) {
            Arrays.fill(i, -1)
        }
        return solve(0, 0, dp)
    }

    private fun solve(ind: Int, odd: Int, dp: Array<IntArray>): Int {
        if (ind == dp.size) {
            if (odd == 1) {
                return 1
            } else {
                return 0
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
        private val MOD = 1e9.toInt() + 7
    }
}
