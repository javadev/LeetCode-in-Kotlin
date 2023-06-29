package g2301_2400.s2311_longest_binary_subsequence_less_than_or_equal_to_k

// #Medium #String #Dynamic_Programming #Greedy #Memoization
// #2023_06_29_Time_140_ms_(100.00%)_Space_34.1_MB_(100.00%)

@Suppress("NAME_SHADOWING")
class Solution {
    fun longestSubsequence(s: String, k: Int): Int {
        var k = k
        var res = 0
        var cost = 1
        val n = s.length
        for (i in n - 1 downTo 0) {
            if (s[i] == '0' || cost <= k) {
                k -= cost * (s[i].code - '0'.code)
                ++res
            }
            if (cost <= k) {
                cost *= 2
            }
        }
        return res
    }
}
