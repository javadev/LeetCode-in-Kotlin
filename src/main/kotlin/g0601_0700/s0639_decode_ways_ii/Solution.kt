package g0601_0700.s0639_decode_ways_ii

// #Hard #String #Dynamic_Programming #2023_02_10_Time_259_ms_(100.00%)_Space_38.4_MB_(100.00%)

class Solution {
    fun numDecodings(s: String): Int {
        if (s[0] == '0') {
            return 0
        }
        val dp = LongArray(s.length + 1)
        dp[0] = 1
        dp[1] = (if (s[0] == '*') 9 else 1).toLong()
        val ch = s.toCharArray()
        for (i in 2..ch.size) {
            if (ch[i - 1] == '0') {
                if (ch[i - 2] == '1' || ch[i - 2] == '2') {
                    dp[i] = dp[i - 2]
                } else if (ch[i - 2] == '*') {
                    dp[i] = 2 * dp[i - 2]
                } else {
                    return 0
                }
            } else if (ch[i - 1] >= '1' && ch[i - 1] <= '6') {
                dp[i] = dp[i - 1]
                if (ch[i - 2] == '1' || ch[i - 2] == '2') {
                    dp[i] += dp[i - 2]
                } else if (ch[i - 2] == '*') {
                    dp[i] += 2 * dp[i - 2]
                }
            } else if (ch[i - 1] >= '7' && ch[i - 1] <= '9') {
                dp[i] = dp[i - 1]
                if (ch[i - 2] == '1' || ch[i - 2] == '*') {
                    dp[i] += dp[i - 2]
                }
            } else if (ch[i - 1] == '*') {
                dp[i] = 9 * dp[i - 1]
                if (ch[i - 2] == '1') {
                    dp[i] += 9 * dp[i - 2]
                } else if (ch[i - 2] == '2') {
                    dp[i] += 6 * dp[i - 2]
                } else if (ch[i - 2] == '*') {
                    dp[i] += 15 * dp[i - 2]
                }
            }
            dp[i] = dp[i] % 1000000007
        }
        return dp[s.length].toInt()
    }
}
