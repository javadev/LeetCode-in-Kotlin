package g3301_3400.s3378_count_connected_components_in_lcm_graph

// #Hard #Array #Hash_Table #Math #Union_Find #Number_Theory
// #2024_12_08_Time_58_ms_(100.00%)_Space_54.4_MB_(100.00%)

class Solution {
    private class UnionFind(n: Int) {
        var parent = IntArray(n) { it }
        var rank = IntArray(n)
        var totalComponents = n

        fun find(u: Int): Int {
            if (parent[u] == u) {
                return u
            }
            parent[u] = find(parent[u])
            return parent[u]
        }

        fun union(u: Int, v: Int) {
            val parentU = find(u)
            val parentV = find(v)
            if (parentU != parentV) {
                totalComponents--
                when {
                    rank[parentU] == rank[parentV] -> {
                        parent[parentV] = parentU
                        rank[parentU]++
                    }
                    rank[parentU] > rank[parentV] -> parent[parentV] = parentU
                    else -> parent[parentU] = parentV
                }
            }
        }
    }

    fun countComponents(nums: IntArray, threshold: Int): Int {
        val goodNums = nums.filter { it <= threshold }
        val totalNums = nums.size
        if (goodNums.isEmpty()) {
            return totalNums
        }
        val uf = UnionFind(goodNums.size)
        val presentElements = IntArray(threshold + 1) { -1 }
        goodNums.forEachIndexed { index, num ->
            presentElements[num] = index
        }
        for (d in goodNums) {
            for (i in d..threshold step d) {
                if (presentElements[i] == -1) {
                    presentElements[i] = presentElements[d]
                } else if (presentElements[i] != presentElements[d]) {
                    uf.union(presentElements[i], presentElements[d])
                }
            }
        }
        return uf.totalComponents + totalNums - goodNums.size
    }
}
