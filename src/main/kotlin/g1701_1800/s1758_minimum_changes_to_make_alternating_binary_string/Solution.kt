package g1701_1800.s1758_minimum_changes_to_make_alternating_binary_string

// #Easy #String #2023_06_18_Time_153_ms_(100.00%)_Space_36.6_MB_(87.50%)

@Suppress("NAME_SHADOWING")
class Solution {
    fun minOperations(s: String): Int {
        return Math.min(countFlips(s, '0'), countFlips(s, '1'))
    }

    private fun countFlips(s: String, next: Char): Int {
        var next = next
        var count = 0
        for (c in s.toCharArray()) {
            if (next != c) {
                count++
            }
            next = if (next == '0') '1' else '0'
        }
        return count
    }
}
