package g1601_1700.s1627_graph_connectivity_with_threshold

// #Hard #Array #Math #Union_Find #2023_06_16_Time_703_ms_(100.00%)_Space_87.8_MB_(100.00%)

class Solution {
    fun areConnected(n: Int, threshold: Int, queries: Array<IntArray>): List<Boolean> {
        if (n < 1 || queries.isEmpty()) {
            return ArrayList()
        }
        var j: Int
        var k: Int
        var x: Int
        val set = DisjointSetUnion(n + 1)
        val edges = queries.size
        var i: Int = threshold + 1
        while (i <= n) {
            k = n / i
            x = i
            j = 2
            while (j <= k) {
                x += i
                set.union(i, x)
                j++
            }
            i++
        }
        val result: MutableList<Boolean> = ArrayList(edges)
        for (query in queries) {
            result.add(set.find(query[0]) == set.find(query[1]))
        }
        return result
    }

    private class DisjointSetUnion(n: Int) {
        private val rank: IntArray
        private val parent: IntArray

        init {
            rank = IntArray(n)
            parent = IntArray(n)
            for (i in 0 until n) {
                rank[i] = 1
                parent[i] = i
            }
        }

        fun find(u: Int): Int {
            var x = u
            while (x != parent[x]) {
                x = parent[x]
            }
            parent[u] = x
            return x
        }

        fun union(u: Int, v: Int) {
            if (u != v) {
                val x = find(u)
                val y = find(v)
                if (x != y) {
                    if (rank[x] > rank[y]) {
                        rank[x] += rank[y]
                        parent[y] = x
                    } else {
                        rank[y] += rank[x]
                        parent[x] = y
                    }
                }
            }
        }
    }
}
