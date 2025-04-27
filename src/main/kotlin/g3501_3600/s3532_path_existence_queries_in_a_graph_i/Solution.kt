package g3501_3600.s3532_path_existence_queries_in_a_graph_i

// #Medium #2025_04_27_Time_5_ms_(90.91%)_Space_126.78_MB_(9.09%)

class Solution {
    fun pathExistenceQueries(n: Int, nums: IntArray, maxDiff: Int, queries: Array<IntArray>): BooleanArray {
        val comp = IntArray(n)
        var compId = 0
        comp[0] = 0
        for (i in 1..<n) {
            if (nums[i] - nums[i - 1] <= maxDiff) {
                comp[i] = compId
            } else {
                compId++
                comp[i] = compId
            }
        }
        val ans = BooleanArray(queries.size)
        for (i in queries.indices) {
            val x = queries[i][0]
            val y = queries[i][1]
            ans[i] = comp[x] == comp[y]
        }
        return ans
    }
}
