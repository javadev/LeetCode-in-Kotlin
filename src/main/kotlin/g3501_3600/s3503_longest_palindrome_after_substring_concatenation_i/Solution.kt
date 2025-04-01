package g3501_3600.s3503_longest_palindrome_after_substring_concatenation_i

// #Medium #String #Dynamic_Programming #Two_Pointers #Enumeration
// #2025_04_01_Time_42_ms_(83.33%)_Space_43.01_MB_(100.00%)

import kotlin.math.max

class Solution {
    fun longestPalindrome(s: String, t: String): Int {
        var maxLen = 0
        maxLen = max(maxLen, longestPalindromicSubstring(s))
        maxLen = max(maxLen, longestPalindromicSubstring(t))
        val sLen = s.length
        val tLen = t.length
        for (i in 0..<sLen) {
            for (j in i..<sLen) {
                val m = j - i + 1
                for (k in 0..<tLen) {
                    for (l in k..<tLen) {
                        val n = l - k + 1
                        val totalLength = m + n
                        if (totalLength <= maxLen) {
                            continue
                        }
                        var isPalindrome = true
                        for (p in 0..<totalLength / 2) {
                            val q = totalLength - 1 - p
                            val c1: Char = if (p < m) {
                                s[i + p]
                            } else {
                                t[k + (p - m)]
                            }
                            val c2: Char = if (q < m) {
                                s[i + q]
                            } else {
                                t[k + (q - m)]
                            }
                            if (c1 != c2) {
                                isPalindrome = false
                                break
                            }
                        }
                        if (isPalindrome) {
                            maxLen = totalLength
                        }
                    }
                }
            }
        }
        return maxLen
    }

    private fun longestPalindromicSubstring(str: String): Int {
        var max = 0
        val len = str.length
        for (i in 0..<len) {
            for (j in i..<len) {
                var isPalin = true
                var left = i
                var right = j
                while (left < right) {
                    if (str[left] != str[right]) {
                        isPalin = false
                        break
                    }
                    left++
                    right--
                }
                if (isPalin) {
                    max = max(max, (j - i + 1))
                }
            }
        }
        return max
    }
}
