package g2501_2600.s2564_substring_xor_queries

// #Medium #Array #String #Hash_Table #Bit_Manipulation
// #2023_07_08_Time_1603_ms_(100.00%)_Space_129.9_MB_(100.00%)

class Solution {
    fun substringXorQueries(s: String, queries: Array<IntArray>): Array<IntArray> {
        val n = s.length
        val indices = queries.withIndex().groupBy(
            keySelector = { it.value[0] xor it.value[1] },
            valueTransform = { it.index },
        ).toMutableMap()
        val res = Array(queries.size) { IntArray(2) { -1 } }
        fun helper(value: Int, left: Int, right: Int) {
            (indices.remove(value) ?: return).forEach {
                res[it][0] = left
                res[it][1] = right
            }
        }
        for (i in 0 until n) {
            if (s[i] == '0') {
                helper(0, i, i)
            } else {
                var tmp = 0L
                for (j in i until n) {
                    tmp = (tmp shl 1) + (s[j] - '0')
                    if (tmp > Int.MAX_VALUE) break
                    helper(tmp.toInt(), i, j)
                }
            }
        }
        return res
    }
}
