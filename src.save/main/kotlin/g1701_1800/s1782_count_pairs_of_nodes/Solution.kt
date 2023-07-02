package g1701_1800.s1782_count_pairs_of_nodes

// #Hard #Binary_Search #Two_Pointers #Graph
// #2023_06_18_Time_1441_ms_(100.00%)_Space_116_MB_(100.00%)

class Solution {
    fun countPairs(n: Int, edges: Array<IntArray>, queries: IntArray): IntArray {
        val edgeCount: MutableMap<Int, Int> = HashMap()
        val degree = IntArray(n)
        for (e in edges) {
            val u = e[0] - 1
            val v = e[1] - 1
            degree[u]++
            degree[v]++
            val eId = Math.min(u, v) * n + Math.max(u, v)
            edgeCount[eId] = edgeCount.getOrDefault(eId, 0) + 1
        }
        val degreeCount: MutableMap<Int, Int> = HashMap()
        var maxDegree = 0
        for (d in degree) {
            degreeCount[d] = degreeCount.getOrDefault(d, 0) + 1
            maxDegree = Math.max(maxDegree, d)
        }
        val count = IntArray(2 * maxDegree + 1)
        for (d1 in degreeCount.entries) {
            for (d2 in degreeCount.entries) {
                count[d1.key + d2.key] += if (d1 === d2) d1.value * (d1.value - 1) else d1.value * d2.value
            }
        }
        for (i in count.indices) {
            count[i] /= 2
        }
        for ((key, value) in edgeCount) {
            val u = key / n
            val v = key % n
            count[degree[u] + degree[v]]--
            count[degree[u] + degree[v] - value]++
        }
        for (i in count.size - 2 downTo 0) {
            count[i] += count[i + 1]
        }
        val res = IntArray(queries.size)
        for (q in queries.indices) {
            res[q] = if (queries[q] + 1 >= count.size) 0 else count[queries[q] + 1]
        }
        return res
    }
}
