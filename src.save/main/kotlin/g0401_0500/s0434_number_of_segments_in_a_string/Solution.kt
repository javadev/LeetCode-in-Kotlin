package g0401_0500.s0434_number_of_segments_in_a_string

// #Easy #String #2022_12_22_Time_167_ms_(80.00%)_Space_35.4_MB_(46.67%)

@Suppress("NAME_SHADOWING")
class Solution {
    fun countSegments(s: String): Int {
        var s = s
        s = s.trim { it <= ' ' }
        if (s.length == 0) {
            return 0
        }
        val splitted = s.split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
        var result = 0
        for (value in splitted) {
            if (value.length > 0) {
                result++
            }
        }
        return result
    }
}
