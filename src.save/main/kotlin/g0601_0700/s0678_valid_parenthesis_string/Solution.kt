package g0601_0700.s0678_valid_parenthesis_string

// #Medium #String #Dynamic_Programming #Greedy #Stack
// #2023_02_16_Time_133_ms_(100.00%)_Space_33.8_MB_(46.15%)

class Solution {
    fun checkValidString(s: String): Boolean {
        var lo = 0
        var hi = 0
        for (i in s.indices) {
            lo += if (s[i] == '(') 1 else -1
            hi += if (s[i] != ')') 1 else -1
            if (hi < 0) {
                break
            }
            lo = 0.coerceAtLeast(lo)
        }
        return lo == 0
    }
}
