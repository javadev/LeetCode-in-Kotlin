package g2301_2400.s2316_count_unreachable_pairs_of_nodes_in_an_undirected_graph

// #Medium #Depth_First_Search #Breadth_First_Search #Graph #Union_Find
// #2023_06_30_Time_981_ms_(87.50%)_Space_118.4_MB_(50.00%)

class Solution {
    fun countPairs(n: Int, edges: Array<IntArray>): Long {
        val d = DSU(n)
        val map = HashMap<Int, Int>()
        for (e in edges) {
            d.union(e[0], e[1])
        }
        var ans: Long = 0
        for (i in 0 until n) {
            val p = d.findParent(i)
            val cnt = if (map.containsKey(p)) map[p]!! else 0
            ans += (i - cnt).toLong()
            map[p] = map.getOrDefault(p, 0) + 1
        }
        return ans
    }

    private class DSU internal constructor(n: Int) {
        var rank: IntArray
        var parent: IntArray

        init {
            rank = IntArray(n + 1)
            parent = IntArray(n + 1)
            for (i in 1..n) {
                parent[i] = i
            }
        }

        fun findParent(node: Int): Int {
            if (parent[node] == node) {
                return node
            }
            parent[node] = findParent(parent[node])
            return findParent(parent[node])
        }

        fun union(x: Int, y: Int): Boolean {
            val px = findParent(x)
            val py = findParent(y)
            if (px == py) {
                return false
            }
            if (rank[px] > rank[py]) {
                parent[py] = px
            } else {
                parent[px] = py
                rank[py]++
            }
            return true
        }
    }
}
