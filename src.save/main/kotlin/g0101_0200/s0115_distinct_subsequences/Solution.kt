package g0101_0200.s0115_distinct_subsequences

// #Hard #String #Dynamic_Programming #2022_09_29_Time_285_ms_(88.89%)_Space_34.2_MB_(100.00%)

class Solution {
    fun numDistinct(text: String, text2: String): Int {
        if (text.length < text2.length) {
            return 0
        }
        if (text.length == text2.length) {
            return if (text == text2) 1 else 0
        }
        val move = text.length - text2.length + 2
        // Only finite number of character in s can occupy first position in T. Same applies for
        // every character in T.
        val dp = IntArray(move)
        var j = 1
        var k = 1
        for (i in 0 until text2.length) {
            var firstMatch = true
            while (j < move) {
                if (text2[i] == text[i + j - 1]) {
                    if (firstMatch) {
                        // Keep track of first match. To avoid useless comparisons on next
                        // iteration.
                        k = j
                        firstMatch = false
                    }
                    if (i == 0) {
                        dp[j] = 1
                    }
                    dp[j] += dp[j - 1]
                } else {
                    dp[j] = dp[j - 1]
                }
                j++
            }
            // No match found for current character of t in s. No point in checking others.
            if (dp[move - 1] == 0) {
                return 0
            }
            j = k
        }
        return dp[move - 1]
    }
}
