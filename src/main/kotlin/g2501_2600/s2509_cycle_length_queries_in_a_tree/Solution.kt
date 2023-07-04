package g2501_2600.s2509_cycle_length_queries_in_a_tree

// #Hard #Tree #Binary_Tree #2023_07_04_Time_825_ms_(75.00%)_Space_102.8_MB_(100.00%)

@Suppress("UNUSED_PARAMETER")
class Solution {
    fun cycleLengthQueries(n: Int, queries: Array<IntArray>): IntArray {
        val m = queries.size
        val res = IntArray(m)
        for (i in 0 until m) {
            var a = queries[i][0]
            var b = queries[i][1]
            var count = 1
            while (a != b) {
                if (a > b) {
                    a = a shr 1
                } else {
                    b = b shr 1
                }
                count++
            }
            res[i] = count
        }
        return res
    }
}
