package g0201_0300.s0214_shortest_palindrome

// #Hard #String #Hash_Function #String_Matching #Rolling_Hash
// #2022_10_24_Time_278_ms_(100.00%)_Space_37.2_MB_(100.00%)

class Solution {
    fun shortestPalindrome(s: String): String {
        var i: Int
        var x: Int
        val diff: Int
        val n = s.length
        val m = (n shl 1) + 1
        val letters = CharArray(m)
        i = 0
        while (i < n) {
            letters[m - 1 - i] = s[i]
            letters[i] = letters[m - 1 - i]
            i++
        }
        letters[i] = '#'
        val lps = IntArray(m)
        lps[0] = 0
        i = 1
        while (i < m) {
            x = lps[i - 1]
            while (letters[i] != letters[x]) {
                if (x == 0) {
                    x = -1
                    break
                }
                x = lps[x - 1]
            }
            lps[i] = x + 1
            i++
        }
        diff = n - lps[m - 1]
        return if (diff == 0) {
            s
        } else {
            val builder = StringBuilder()
            i = n - 1
            while (i >= n - diff) {
                builder.append(s[i])
                i--
            }
            builder.append(s)
            builder.toString()
        }
    }
}
