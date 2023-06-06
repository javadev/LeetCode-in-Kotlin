package g1301_1400.s1310_xor_queries_of_a_subarray

// #Medium #Array #Bit_Manipulation #Prefix_Sum
// #2023_06_05_Time_382_ms_(100.00%)_Space_57.8_MB_(100.00%)

class Solution {
    fun xorQueries(arr: IntArray, queries: Array<IntArray>): IntArray {
        val res = IntArray(queries.size)
        for (i in 1 until arr.size) {
            arr[i] = arr[i - 1] xor arr[i]
        }
        for (i in queries.indices) {
            val query = queries[i]
            res[i] = if (query[0] == 0) arr[query[1]] else arr[query[0] - 1] xor arr[query[1]]
        }
        return res
    }
}
