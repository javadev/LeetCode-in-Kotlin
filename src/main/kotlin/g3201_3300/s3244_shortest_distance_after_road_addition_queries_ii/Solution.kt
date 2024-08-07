package g3201_3300.s3244_shortest_distance_after_road_addition_queries_ii

// #Hard #Array #Greedy #Graph #Ordered_Set #2024_08_07_Time_794_ms_(92.31%)_Space_109_MB_(15.38%)

class Solution {
    fun shortestDistanceAfterQueries(n: Int, queries: Array<IntArray>): IntArray {
        val flag = IntArray(n)
        val res = IntArray(queries.size)
        for (i in 0 until n) {
            flag[i] = i + 1
        }
        for (k in queries.indices) {
            val query = queries[k]
            val preRes = if (k == 0) (n - 1) else res[k - 1]
            if (flag[query[0]] >= query[1]) {
                res[k] = preRes
                continue
            }
            var subDis = 0
            var curr = query[0]
            while (curr < query[1]) {
                val next = flag[curr]
                subDis += 1
                flag[curr] = query[1]
                curr = next
            }
            res[k] = preRes + 1 - subDis
        }
        return res
    }
}
