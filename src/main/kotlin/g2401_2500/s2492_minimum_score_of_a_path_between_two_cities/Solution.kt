package g2401_2500.s2492_minimum_score_of_a_path_between_two_cities

// #Medium #Depth_First_Search #Breadth_First_Search #Graph #Union_Find
// #2023_07_05_Time_929_ms_(91.67%)_Space_109.9_MB_(100.00%)

@Suppress("NAME_SHADOWING")
class Solution {
    fun minScore(n: Int, roads: Array<IntArray>): Int {
        val parent = IntArray(n + 1)
        val rank = IntArray(n + 1)
        for (i in 1..n) {
            parent[i] = i
            rank[i] = Int.MAX_VALUE
        }
        var ans = Int.MAX_VALUE
        for (road in roads) {
            union(parent, rank, road[0], road[1], road[2])
        }
        val u: Int = find(parent, 1)
        val v: Int = find(parent, n)
        if (u == v) {
            ans = rank[u]
        }
        return ans
    }

    private fun find(parent: IntArray, x: Int): Int {
        return if (x == parent[x]) x else find(parent, parent[x]).also { parent[x] = it }
    }

    private fun union(parent: IntArray, rank: IntArray, u: Int, v: Int, w: Int) {
        var u = u
        var v = v
        u = find(parent, u)
        v = find(parent, v)
        if (rank[u] <= rank[v]) {
            parent[v] = u
            rank[u] = Math.min(rank[u], w)
        } else {
            parent[u] = v
            rank[v] = Math.min(rank[v], w)
        }
        return
    }
}
