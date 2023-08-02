package g2301_2400.s2301_match_substring_after_replacement

// #Hard #Array #String #Hash_Table #String_Matching
// #2023_06_29_Time_343_ms_(100.00%)_Space_44.5_MB_(100.00%)

@Suppress("NAME_SHADOWING")
class Solution {
    private lateinit var c1: CharArray
    private lateinit var c2: CharArray
    private lateinit var al: Array<MutableSet<Char>?>
    fun matchReplacement(s: String, sub: String, mappings: Array<CharArray>): Boolean {
        c1 = s.toCharArray()
        c2 = sub.toCharArray()
        al = arrayOfNulls(75)
        for (i in 0..74) {
            val temp: MutableSet<Char> = HashSet()
            al[i] = temp
        }
        for (mapping in mappings) {
            al[mapping[0].code - '0'.code]!!.add(mapping[1])
        }
        return ans(c1.size, c2.size) == 1
    }

    private fun ans(m: Int, n: Int): Int {
        var m = m
        var n = n
        if (m == 0) {
            return 0
        }
        if (ans(m - 1, n) == 1) {
            return 1
        }
        if (m >= n && (c1[m - 1] == c2[n - 1] || al[c2[n - 1].code - '0'.code]!!.contains(c1[m - 1]))) {
            while (n >= 1 && (c1[m - 1] == c2[n - 1] || al[c2[n - 1].code - '0'.code]!!.contains(c1[m - 1]))) {
                n--
                m--
            }
            if (n == 0) {
                return 1
            }
        }
        return 0
    }
}
