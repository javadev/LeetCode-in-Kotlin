package g3801_3900.s3887_incremental_even_weighted_cycle_queries

// #Hard #Union_Find #Graph_Theory #Senior_Staff #Weekly_Contest_495
// #2026_08_13_Time_18_ms_(100.00%)_Space_262.39_MB_(65.96%)

class Solution {
    private lateinit var parent: IntArray
    private lateinit var parity: IntArray

    private fun find(x: Int): Int {
        if (parent[x] == x) {
            return x
        }
        val p = parent[x]
        parent[x] = find(parent[x])
        parity[x] = parity[x] xor parity[p]
        return parent[x]
    }

    fun numberOfEdgesAdded(n: Int, edges: Array<IntArray>): Int {
        parent = IntArray(n)
        val rank = IntArray(n)
        parity = IntArray(n)
        for (i in 0..<n) {
            parent[i] = i
        }
        var ans = 0
        for (e in edges) {
            val u = e[0]
            val v = e[1]
            val w = e[2]
            var ru = find(u)
            var rv = find(v)
            var pu = parity[u]
            var pv = parity[v]
            if (ru == rv) {
                if ((pu xor pv) == w) {
                    ans++
                }
            } else {
                if (rank[ru] < rank[rv]) {
                    var temp = ru
                    ru = rv
                    rv = temp
                    temp = pu
                    pu = pv
                    pv = temp
                }
                parent[rv] = ru
                parity[rv] = pu xor pv xor w
                if (rank[ru] == rank[rv]) {
                    rank[ru]++
                }
                ans++
            }
        }
        return ans
    }
}
