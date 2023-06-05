package g1301_1400.s1310_xor_queries_of_a_subarray

// #Medium #Array #Bit_Manipulation #Prefix_Sum
class Solution {
    fun xorQueries(a: IntArray, queries: Array<IntArray>): IntArray {
        val res = IntArray(queries.size)
        for (i in 1 until a.size) {
            a[i] = a[i - 1] xor a[i]
        }
        for (i in queries.indices) {
            val query = queries[i]
            res[i] = if (query[0] == 0) a[query[1]] else a[query[0] - 1] xor a[query[1]]
        }
        return res
    }
}
