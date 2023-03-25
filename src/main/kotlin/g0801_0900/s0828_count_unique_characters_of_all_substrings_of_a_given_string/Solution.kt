package g0801_0900.s0828_count_unique_characters_of_all_substrings_of_a_given_string

// #Hard #String #Hash_Table #Dynamic_Programming
// #2023_03_25_Time_216_ms_(100.00%)_Space_37.1_MB_(50.00%)

import java.util.Arrays

class Solution {
    fun uniqueLetterString(s: String): Int {
        // Store last index of a character.
        val lastCharIdx = IntArray(26)
        // Store last to last index of a character.
        // Eg. For ABA - lastCharIdx = 2, prevLastCharIdx = 0.
        val prevLastCharIdx = IntArray(26)
        Arrays.fill(lastCharIdx, -1)
        Arrays.fill(prevLastCharIdx, -1)
        val len = s.length
        val dp = IntArray(len)
        var account = 1
        dp[0] = 1
        lastCharIdx[s[0].toInt() - 'A'.toInt()] = 0
        prevLastCharIdx[s[0].toInt() - 'A'.toInt()] = 0
        for (i in 1 until len) {
            val ch = s[i]
            val chIdx = ch.toInt() - 'A'.toInt()
            val lastSeenIdx = lastCharIdx[chIdx]
            val prevLastIdx = prevLastCharIdx[chIdx]
            dp[i] = dp[i - 1] + 1
            if (lastSeenIdx == -1) {
                dp[i] += i
            } else {
                // Add count for curr index from index of last char appearance.
                dp[i] += i - lastSeenIdx - 1
                if (prevLastIdx == lastSeenIdx) {
                    // if last char idx is the only appearance of the char from left so far,
                    // substrings that overlap [0, lastSeenIdx] will need count to be discounted, as
                    // current char will cause duplication.
                    dp[i] -= lastSeenIdx + 1
                } else {
                    dp[i] -= lastSeenIdx - prevLastIdx
                }
            }
            prevLastCharIdx[chIdx] = lastSeenIdx
            lastCharIdx[chIdx] = i
            account += dp[i]
        }
        return account
    }
}
