package g3501_3600.s3558_number_of_ways_to_assign_edge_weights_i

// #Medium #2025_05_25_Time_160_ms_(100.00%)_Space_149.66_MB_(100.00%)

class Solution {
    fun assignEdgeWeights(edges: Array<IntArray>): Int {
        if (pow2[0] == 0L) {
            pow2[0] = 1
            for (i in 1..<pow2.size) {
                pow2[i] = (pow2[i - 1] shl 1) % mod
            }
        }
        val n = edges.size + 1
        val adj = IntArray(n + 1)
        val degrees = IntArray(n + 1)
        for (edge in edges) {
            val u = edge[0]
            val v = edge[1]
            adj[u] += v
            adj[v] += u
            degrees[u]++
            degrees[v]++
        }
        val que = IntArray(n)
        var write = 0
        var read = 0
        for (i in 2..n) {
            if (degrees[i] == 1) {
                que[write++] = i
            }
        }
        var distance = 0
        while (read < write) {
            distance++
            var size = write - read
            while (size-- > 0) {
                val v = que[read++]
                val u = adj[v]
                adj[u] -= v
                if (--degrees[u] == 1 && u != 1) {
                    que[write++] = u
                }
            }
        }
        return pow2[distance - 1].toInt()
    }

    companion object {
        private const val mod = 1e9.toInt() + 7
        private val pow2 = LongArray(100001)
    }
}
