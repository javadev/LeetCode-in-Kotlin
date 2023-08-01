package g2701_2800.s2713_maximum_strictly_increasing_cells_in_a_matrix

// #Hard #Array #Dynamic_Programming #Sorting #Binary_Search #Matrix #Memoization
// #2023_08_01_Time_1141_ms_(100.00%)_Space_110.2_MB_(54.55%)

import java.util.concurrent.atomic.AtomicInteger

internal class Solution {
    fun maxIncreasingCells(mat: Array<IntArray>): Int {
        val n = mat.size
        val m = mat[0].size
        val map: MutableMap<Int, MutableList<IntArray>> = HashMap()
        for (i in 0 until n) {
            for (j in 0 until m) {
                val `val` = mat[i][j]
                if (!map.containsKey(`val`)) {
                    map.put(`val`, ArrayList())
                }
                map[`val`]!!.add(intArrayOf(i, j))
            }
        }
        val memo = Array(n) { IntArray(m) }
        val res = IntArray(n + m)
        val max = AtomicInteger()
        map.keys.stream().sorted().forEach { a: Int ->
            for (pos in map[a]!!) {
                val i = pos[0]
                val j = pos[1]
                memo[i][j] = res[i].coerceAtLeast(res[n + j]) + 1
                max.set(max.get().coerceAtLeast(memo[i][j]))
            }
            for (pos in map[a]!!) {
                val i = pos[0]
                val j = pos[1]
                res[n + j] = res[n + j].coerceAtLeast(memo[i][j])
                res[i] = res[i].coerceAtLeast(memo[i][j])
            }
        }
        return max.get()
    }
}
