package g1801_1900.s1849_splitting_a_string_into_descending_consecutive_values

// #Medium #String #Backtracking #2023_06_22_Time_136_ms_(100.00%)_Space_33.3_MB_(100.00%)

class Solution {
    fun splitString(s: String): Boolean {
        return solve(0, -1, s, 0)
    }

    private fun solve(i: Int, prev: Long, s: String, k: Int): Boolean {
        if (i == s.length) {
            return k >= 2
        }
        var cur: Long = 0
        for (j in i until s.length) {
            cur = cur * 10 + s[j].code.toLong() - '0'.code.toLong()
            if ((prev == -1L || prev - cur == 1L) && solve(j + 1, cur, s, k + 1)) {
                return true
            }
        }
        return false
    }
}
