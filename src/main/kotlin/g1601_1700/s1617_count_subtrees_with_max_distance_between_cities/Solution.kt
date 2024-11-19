package g1601_1700.s1617_count_subtrees_with_max_distance_between_cities

// #Hard #Dynamic_Programming #Tree #Bit_Manipulation #Bitmask #Enumeration
// #2023_06_15_Time_297_ms_(100.00%)_Space_38.6_MB_(100.00%)

import kotlin.math.pow

class Solution {
    private var ans = 0
    private var vis = 0

    fun countSubgraphsForEachDiameter(n: Int, edges: Array<IntArray>): IntArray {
        ans = 0
        vis = 0
        val dist = IntArray(n - 1)
        val graph: MutableMap<Int, MutableList<Int>> = HashMap()
        for (i in edges) {
            graph.computeIfAbsent(1 shl i[0] - 1) { initialCapacity: Int? ->
                ArrayList(
                    initialCapacity!!,
                )
            }.add(1 shl i[1] - 1)
            graph.computeIfAbsent(1 shl i[1] - 1) { initialCapacity: Int? ->
                ArrayList(
                    initialCapacity!!,
                )
            }.add(1 shl i[0] - 1)
        }
        val ps = 2.0.pow(n.toDouble()).toInt() - 1
        for (set in 3..ps) {
            // is power of 2
            val isp2 = set != 0 && set and set - 1 == 0
            if (!isp2) {
                ans = 0
                vis = 0
                dfs(graph, set, Integer.highestOneBit(set), -1)
                if (vis == set) {
                    dist[ans - 1]++
                }
            }
        }
        return dist
    }

    private fun dfs(graph: Map<Int, MutableList<Int>>, set: Int, c: Int, p: Int): Int {
        if (set and c == 0) {
            return 0
        }
        vis = vis or c
        var fdist = 0
        var sdist = 0
        for (i in graph[c]!!) {
            if (i != p) {
                val dist = dfs(graph, set, i, c)
                if (dist > fdist) {
                    sdist = fdist
                    fdist = dist
                } else {
                    sdist = sdist.coerceAtLeast(dist)
                }
            }
        }
        ans = ans.coerceAtLeast(fdist + sdist)
        return 1 + fdist
    }
}
