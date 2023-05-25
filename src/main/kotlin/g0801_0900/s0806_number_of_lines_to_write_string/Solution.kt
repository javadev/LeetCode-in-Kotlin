package g0801_0900.s0806_number_of_lines_to_write_string

// #Easy #Array #String #2023_03_17_Time_134_ms_(100.00%)_Space_34.6_MB_(9.09%)

class Solution {
    fun numberOfLines(widths: IntArray, s: String): IntArray {
        var count = 0
        var line = 0
        var i = 0
        while (i < s.length) {
            count += widths[s[i].code - 'a'.code]
            if (count == 100) {
                line++
                count = 0
            }
            if (count > 100) {
                line++
                i--
                count = 0
            }
            i++
        }
        if (count in 1..99) {
            line++
        }
        if (count == 0) {
            count = 100
        }
        return intArrayOf(line, count)
    }
}
