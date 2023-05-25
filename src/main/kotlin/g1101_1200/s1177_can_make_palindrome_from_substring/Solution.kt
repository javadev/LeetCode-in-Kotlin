package g1101_1200.s1177_can_make_palindrome_from_substring

// #Medium #String #Hash_Table #Bit_Manipulation #Prefix_Sum
// #2023_05_25_Time_937_ms_(100.00%)_Space_149.7_MB_(100.00%)

class Solution {
    fun canMakePaliQueries(s: String, queries: Array<IntArray>): List<Boolean> {
        return canMakeP(s, queries)
    }

    private fun canMakeP(s: String, qs: Array<IntArray>): List<Boolean> {
        val n = s.length
        val counts = IntArray(n)
        for (i in 0 until n) {
            var m = 0
            if (i > 0) {
                m = counts[i - 1]
            }
            val c = s[i]
            m = m xor (1 shl c.code - 'a'.code)
            counts[i] = m
        }
        val ans: MutableList<Boolean> = ArrayList()
        for (q in qs) {
            ans.add(check(q, counts))
        }
        return ans
    }

    private fun check(q: IntArray, counts: IntArray): Boolean {
        val l = q[0]
        val r = q[1]
        val k = q[2]
        val prev = if (l > 0) counts[l - 1] else 0
        val kk = Integer.bitCount(prev xor counts[r])
        return kk / 2 <= k
    }
}
