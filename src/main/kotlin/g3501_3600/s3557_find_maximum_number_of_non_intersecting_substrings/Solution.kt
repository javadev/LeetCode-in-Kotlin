package g3501_3600.s3557_find_maximum_number_of_non_intersecting_substrings

import java.util.LinkedList
import kotlin.math.max

// #Medium #2025_05_25_Time_103_ms_(100.00%)_Space_54.87_MB_(100.00%)

class Solution {
    fun maxSubstrings(s: String): Int {
        val last: Array<LinkedList<Int>> = Array(26) { LinkedList() }
        val n = s.length
        val dp = IntArray(n + 1)
        for (i in 0..<n) {
            val c = s[i].code - 'a'.code
            dp[i + 1] = dp[i]
            for (j in last[c]) {
                if (i - j + 1 >= 4) {
                    dp[i + 1] = max(dp[i + 1], dp[j] + 1)
                }
            }
            last[c].addLast(i)
            if (last[c].size > 4) {
                last[c].removeFirst()
            }
        }
        return dp[n]
    }
}
