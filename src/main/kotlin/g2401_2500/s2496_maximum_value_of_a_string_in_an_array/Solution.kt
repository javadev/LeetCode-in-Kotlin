package g2401_2500.s2496_maximum_value_of_a_string_in_an_array

// #Easy #Array #String
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
            total = if (ch >= '0' && ch <= '9') {
                total * 10 + (ch.code - '0'.code)
            } else {
                return s.length
            }
        }
        return total
    }
}
