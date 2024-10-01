package g3301_3400.s3303_find_the_occurrence_of_first_almost_equal_substring

// #Hard #String #String_Matching #2024_10_01_Time_364_ms_(100.00%)_Space_40.8_MB_(100.00%)

import kotlin.math.abs

class Solution {
    fun minStartingIndex(s: String, pattern: String): Int {
        val n = s.length
        var left = 0
        var right = 0
        val f1 = IntArray(26)
        val f2 = IntArray(26)
        for (ch in pattern.toCharArray()) {
            f2[ch.code - 'a'.code]++
        }
        while (right < n) {
            val ch = s.get(right)
            f1[ch.code - 'a'.code]++
            if (right - left + 1 == pattern.length + 1) {
                f1[s.get(left).code - 'a'.code]--
                left += 1
            }
            if (right - left + 1 == pattern.length && check(f1, f2, left, s, pattern)) {
                return left
            }
            right += 1
        }
        return -1
    }

    private fun check(f1: IntArray, f2: IntArray, left: Int, s: String, pattern: String): Boolean {
        var cnt = 0
        for (i in 0..25) {
            if (f1[i] != f2[i]) {
                if ((abs((f1[i] - f2[i])) > 1) || (abs(f1[i] - f2[i]) != 1 && cnt == 2)) {
                    return false
                }
                cnt += 1
            }
        }
        cnt = 0
        var start = 0
        var end = pattern.length - 1
        while (start <= end) {
            if (s[start + left] != pattern[start]) {
                cnt += 1
            }
            if (start + left != left + end && s[left + end] != pattern[end]) {
                cnt += 1
            }
            if (cnt >= 2) {
                return false
            }
            start++
            end--
        }
        return true
    }
}
