package g1301_1400.s1392_longest_happy_prefix

// #Hard #String #Hash_Function #String_Matching #Rolling_Hash
// #2025_04_24_Time_7_ms_(100.00%)_Space_47.37_MB_(25.00%)

class Solution {
    fun longestPrefix(s: String): String {
        val c = s.toCharArray()
        val n = c.size
        val a = IntArray(n)
        var max = 0
        var i = 1
        while (i < n) {
            if (c[max] == c[i]) {
                max++
                a[i] = max
                i++
            } else {
                if (max > 0) {
                    max = a[max - 1]
                } else {
                    a[i] = 0
                    i++
                }
            }
        }
        return s.substring(0, a[n - 1])
    }
}
