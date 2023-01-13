package g0501_0600.s0521_longest_uncommon_subsequence_i

// #Easy #String #2023_01_14_Time_146_ms_(88.89%)_Space_33.5_MB_(66.67%)

class Solution {
    fun findLUSlength(a: String, b: String): Int {
        return if (a == b) {
            -1
        } else a.length.coerceAtLeast(b.length)
    }
}
