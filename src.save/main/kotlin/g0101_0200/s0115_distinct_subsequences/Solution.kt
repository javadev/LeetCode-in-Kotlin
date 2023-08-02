package g0101_0200.s0115_distinct_subsequences

// #Hard #String #Dynamic_Programming #2022_09_29_Time_285_ms_(88.89%)_Space_34.2_MB_(100.00%)

class Solution {
    fun numDistinct(s: String, t: String): Int {
        if (s.length < t.length) {
            return 0
        }
        if (s.length == t.length) {
            return if (s == t) 1 else 0
        }
        val move = s.length - t.length + 2
        // Only finite number of character in s can occupy first position in T. Same applies for
        // every character in T.
        val dp = IntArray(move)
        var j = 1
        var k = 1
        for (i in 0 until t.length) {
            var firstMatch = true
            while (j < move) {
                if (t[i] == s[i + j - 1]) {
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
