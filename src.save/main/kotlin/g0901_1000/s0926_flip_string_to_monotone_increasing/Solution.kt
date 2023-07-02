package g0901_1000.s0926_flip_string_to_monotone_increasing

// #Medium #String #Dynamic_Programming #2023_04_24_Time_199_ms_(100.00%)_Space_37.4_MB_(27.27%)

class Solution {
    fun minFlipsMonoIncr(s: String): Int {
        var ones = 0
        var flips = 0
        for (element in s) {
            if (element == '1') {
                ones++
            } else {
                flips = (flips + 1).coerceAtMost(ones)
            }
        }
        return flips
    }
}
