package g1601_1700.s1663_smallest_string_with_a_given_numeric_value

// #Medium #String #Greedy #2023_06_15_Time_202_ms_(100.00%)_Space_38.4_MB_(50.00%)

@Suppress("NAME_SHADOWING")
class Solution {
    fun getSmallestString(n: Int, k: Int): String {
        var n = n
        var k = k
        val res = CharArray(n)
        res.fill('a')
        k -= n
        while (k > 0) {
            --n
            res[n] = res[n] + Math.min(25, k).toChar().code
            k -= Math.min(25, k)
        }
        return String(res)
    }
}
