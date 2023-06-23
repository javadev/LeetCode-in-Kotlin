package g2001_2100.s2027_minimum_moves_to_convert_string

// #Easy #String #Greedy #2023_06_23_Time_142_ms_(100.00%)_Space_34.1_MB_(100.00%)

class Solution {
    fun minimumMoves(s: String): Int {
        var r = 0
        var i = 0
        val sArray = s.toCharArray()
        while (i < sArray.size) {
            if (sArray[i] == 'X') {
                r++
                i += 2
            }
            i++
        }
        return r
    }
}
