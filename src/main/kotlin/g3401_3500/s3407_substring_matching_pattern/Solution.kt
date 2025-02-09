package g3401_3500.s3407_substring_matching_pattern

// #Easy #String #String_Matching #2025_01_07_Time_2_ms_(100.00%)_Space_38.80_MB_(35.14%)

class Solution {
    fun hasMatch(s: String, p: String): Boolean {
        var index = -1
        for (i in 0..<p.length) {
            if (p[i] == '*') {
                index = i
                break
            }
        }
        val num1 = `fun`(s, p.substring(0, index))
        if (num1 == -1) {
            return false
        }
        val num2 = `fun`(s.substring(num1), p.substring(index + 1))
        return num2 != -1
    }

    private fun `fun`(s: String, k: String): Int {
        val n = s.length
        val m = k.length
        var j: Int
        for (i in 0..n - m) {
            j = 0
            while (j < m) {
                val ch1 = s[j + i]
                val ch2 = k[j]
                if (ch1 != ch2) {
                    break
                }
                j++
            }
            if (j == m) {
                return i + j
            }
        }
        return -1
    }
}
