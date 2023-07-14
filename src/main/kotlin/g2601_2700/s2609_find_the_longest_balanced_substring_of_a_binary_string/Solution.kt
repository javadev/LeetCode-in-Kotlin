package g2601_2700.s2609_find_the_longest_balanced_substring_of_a_binary_string

// #Easy #String #2023_07_14_Time_174_ms_(100.00%)_Space_36.6_MB_(66.67%)

class Solution {
    fun findTheLongestBalancedSubstring(s: String): Int {
        val n = s.length
        var max = 0
        var countZeros = 0
        var countOnes = 0
        var temp = 0
        for (i in 0 until n) {
            if (s[i] == '0') {
                countOnes = 0
                countZeros++
            }
            if (s[i] == '1') {
                countOnes++
                temp = countZeros
                if (i < n - 1 && s[i + 1] == '0') countZeros = 0
            }
            if (countOnes <= temp) max = max.coerceAtLeast(countOnes)
        }
        return 2 * max
    }
}
