package g1601_1700.s1653_minimum_deletions_to_make_string_balanced

// #Medium #String #Dynamic_Programming #Stack
// #2023_06_15_Time_291_ms_(100.00%)_Space_38.3_MB_(100.00%)

class Solution {
    fun minimumDeletions(s: String): Int {
        var a = 0
        var b = 0
        for (ch in s.toCharArray()) {
            if (ch == 'a') {
                a++
            } else {
                b = Math.max(a, b) + 1
            }
        }
        return s.length - Math.max(a, b)
    }
}
