package g3501_3600.s3503_longest_palindrome_after_substring_concatenation_i

// #Medium #2025_03_30_Time_206_ms_(66.67%)_Space_47.71_MB_(86.67%)

import kotlin.math.max

class Solution {
    fun longestPalindrome(s: String, t: String): Int {
        var result = 0
        for (i in 0..s.length) {
            for (j in i..s.length) {
                val subStrS = s.substring(i, j)
                for (k in 0..t.length) {
                    for (l in k..t.length) {
                        val subStrT = t.substring(k, l)
                        val combineStr = subStrS + subStrT
                        if (isPalindrome(combineStr)) {
                            result = max(result, combineStr.length)
                        }
                    }
                }
            }
        }
        return result
    }

    private fun isPalindrome(input: String): Boolean {
        var left = 0
        var right = input.length - 1
        while (left < right) {
            if (input.get(left) != input.get(right)) {
                return false
            }
            left++
            right--
        }
        return true
    }
}
