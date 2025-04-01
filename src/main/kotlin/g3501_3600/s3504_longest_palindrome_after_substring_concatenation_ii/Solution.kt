package g3501_3600.s3504_longest_palindrome_after_substring_concatenation_ii

// #Hard #String #Dynamic_Programming #Two_Pointers
// #2025_04_01_Time_59_ms_(100.00%)_Space_58.68_MB_(57.14%)

import kotlin.math.max

class Solution {
    private lateinit var sPa: IntArray
    private lateinit var tPa: IntArray
    private lateinit var ss: CharArray
    private lateinit var tt: CharArray

    fun longestPalindrome(s: String, t: String): Int {
        val sLen = s.length
        val tLen = t.length
        ss = s.toCharArray()
        tt = t.toCharArray()
        val palindrome = Array<IntArray?>(sLen) { IntArray(tLen + 1) }
        sPa = IntArray(sLen)
        tPa = IntArray(tLen)
        var maxLen = 1
        for (j in 0..<tLen) {
            if (ss[0] == tt[j]) {
                palindrome[0]!![j] = 2
                sPa[0] = 2
                tPa[j] = 2
                maxLen = 2
            }
        }
        for (i in 1..<sLen) {
            for (j in 0..<tLen) {
                if (ss[i] == tt[j]) {
                    palindrome[i]!![j] = 2 + palindrome[i - 1]!![j + 1]
                    sPa[i] = max(sPa[i], palindrome[i]!![j])
                    tPa[j] = max(tPa[j], palindrome[i]!![j])
                    maxLen = max(maxLen, palindrome[i]!![j])
                }
            }
        }
        for (i in 0..<sLen - 1) {
            val len = maxS(i, i + 1)
            maxLen = max(maxLen, len)
        }
        for (i in 1..<sLen) {
            val len = maxS(i - 1, i + 1) + 1
            maxLen = max(maxLen, len)
        }
        for (j in 0..<tLen - 1) {
            val len = maxT(j, j + 1)
            maxLen = max(maxLen, len)
        }
        for (j in 0..<tLen - 1) {
            val len = maxT(j - 1, j + 1) + 1
            maxLen = max(maxLen, len)
        }
        return maxLen
    }

    private fun maxS(left: Int, right: Int): Int {
        var left = left
        var right = right
        var len = 0
        while (left >= 0 && right < ss.size && ss[left] == ss[right]) {
            len += 2
            left--
            right++
        }
        if (left >= 0) {
            len += sPa[left]
        }
        return len
    }

    private fun maxT(left: Int, right: Int): Int {
        var left = left
        var right = right
        var len = 0
        while (left >= 0 && right < tt.size && tt[left] == tt[right]) {
            len += 2
            left--
            right++
        }
        if (right < tt.size) {
            len += tPa[right]
        }
        return len
    }
}
