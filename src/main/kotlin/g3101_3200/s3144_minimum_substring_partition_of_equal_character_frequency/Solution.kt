package g3101_3200.s3144_minimum_substring_partition_of_equal_character_frequency

// #Medium #String #Hash_Table #Dynamic_Programming #Counting
// #2024_05_15_Time_232_ms_(88.00%)_Space_38.9_MB_(48.00%)

import kotlin.math.min

class Solution {
    fun minimumSubstringsInPartition(s: String): Int {
        val cs = s.toCharArray()
        val n = cs.size
        val dp = IntArray(n + 1)
        dp.fill(n)
        dp[0] = 0
        for (i in 1..n) {
            val count = IntArray(26)
            var distinct = 0
            var maxCount = 0
            for (j in i - 1 downTo 0) {
                val index = cs[j].code - 'a'.code
                if (++count[index] == 1) {
                    distinct++
                }
                if (count[index] > maxCount) {
                    maxCount = count[index]
                }
                if (maxCount * distinct == i - j) {
                    dp[i] = min(dp[i], (dp[j] + 1))
                }
            }
        }
        return dp[n]
    }
}
