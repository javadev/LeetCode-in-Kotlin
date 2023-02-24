package g0701_0800.s0709_to_lower_case

// #Easy #String #Programming_Skills_I_Day_9_String
// #2023_02_24_Time_142_ms_(98.68%)_Space_35.1_MB_(7.89%)

class Solution {
    fun toLowerCase(s: String): String {
        val c = s.toCharArray()
        for (i in s.indices) {
            if (c[i] in 'A'..'Z') {
                c[i] = (c[i].code - 'A'.code + 'a'.code).toChar()
            }
        }
        return String(c)
    }
}
