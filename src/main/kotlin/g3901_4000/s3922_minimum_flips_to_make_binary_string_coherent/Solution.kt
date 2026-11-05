package g3901_4000.s3922_minimum_flips_to_make_binary_string_coherent

// #Medium #String #Senior #Biweekly_Contest_182
// #2026_09_29_Time_4_ms_(100.00%)_Space_47.56_MB_(76.92%)

import kotlin.math.min

class Solution {
    fun minFlips(s: String): Int {
        val n = s.length
        var count1 = 0
        for (c in s.toCharArray()) {
            count1 += c.code - '0'.code
        }
        val count0 = n - count1
        // Option 1: all 0s
        var ans = count1
        // Option 2: all 1s
        ans = min(ans, count0)
        // Option 3: exactly one 1 (at any position)
        ans = if (count1 >= 1) {
            min(ans, count1 - 1)
        } else {
            min(ans, 1)
        }
        // Option 4: "10...01" (1 at position 0 and position n-1)
        if (n >= 2 && count1 >= 2) {
            var cost4 = count1
            if (s[0] == '1') {
                cost4--
            }
            if (s[n - 1] == '1') {
                cost4--
            }
            ans = min(ans, cost4)
        }
        return ans
    }
}
