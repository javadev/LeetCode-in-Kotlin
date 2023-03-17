package g0801_0900.s0809_expressive_words

// #Medium #Array #String #Two_Pointers #2023_03_17_Time_158_ms_(100.00%)_Space_35.1_MB_(100.00%)

@Suppress("NAME_SHADOWING")
class Solution {
    fun expressiveWords(s: String, words: Array<String>): Int {
        var ans = 0
        for (w in words) {
            if (check(s, w)) {
                ans++
            }
        }
        return ans
    }

    private fun check(s: String, w: String): Boolean {
        var i = 0
        var j = 0
        while (i < s.length && j < w.length) {
            val ch1 = s[i]
            val ch2 = w[j]
            val len1 = getLen(s, i)
            val len2 = getLen(w, j)
            if (ch1 == ch2) {
                if (len1 == len2 || len1 >= 3 && len2 < len1) {
                    i += len1
                    j += len2
                } else {
                    return false
                }
            } else {
                return false
            }
        }
        return i == s.length && j == w.length
    }

    private fun getLen(value: String, i: Int): Int {
        var i = i
        i += 1
        var count = 1
        for (j in i until value.length) {
            if (value[j] == value[i - 1]) {
                count++
            } else {
                break
            }
        }
        return count
    }
}
