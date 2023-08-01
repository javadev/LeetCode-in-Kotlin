package g2701_2800.s2718_sum_of_matrix_after_queries

// #Medium #Array #Hash_Table #2023_08_01_Time_668_ms_(100.00%)_Space_92.6_MB_(41.67%)

class Solution {
    fun matrixSumQueries(n: Int, queries: Array<IntArray>): Long {
        val queriedRow = BooleanArray(n)
        val queriedCol = BooleanArray(n)
        var sum: Long = 0
        var remainingRows = n
        var remainingCols = n
        for (i in queries.indices.reversed()) {
            val type = queries[i][0]
            val index = queries[i][1]
            val value = queries[i][2]
            if (type == 0) {
                if (queriedRow[index]) {
                    continue
                }
                sum += (value * remainingCols).toLong()
                remainingRows--
                queriedRow[index] = true
            } else {
                if (queriedCol[index]) {
                    continue
                }
                sum += (value * remainingRows).toLong()
                remainingCols--
                queriedCol[index] = true
            }
        }
        return sum
    }
}
