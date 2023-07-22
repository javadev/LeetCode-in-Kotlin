package g2401_2500.s2496_maximum_value_of_a_string_in_an_array

// #Easy #Array #String #2023_07_05_Time_138_ms_(100.00%)_Space_33.7_MB_(100.00%)

class Solution {
    fun maximumValue(strs: Array<String>): Int {
        var maxVal = 0
        for (s in strs) {
            maxVal = Math.max(maxVal, value(s))
        }
        return maxVal
    }

    private fun value(s: String): Int {
        var total = 0
        for (ch in s.toCharArray()) {
            total = if (ch in '0'..'9') {
                total * 10 + (ch.code - '0'.code)
            } else {
                return s.length
            }
        }
        return total
    }
}
