package g2101_2200.s2109_adding_spaces_to_a_string

// #Medium #Array #String #Simulation #2023_06_25_Time_624_ms_(100.00%)_Space_72.6_MB_(100.00%)

class Solution {
    fun addSpaces(s: String, spaces: IntArray): String {
        val stringChars = CharArray(s.length + spaces.size)
        for (i in spaces.indices) {
            stringChars[spaces[i] + i] = ' '
        }
        var equivalentIndex = -1
        var i = 0
        while (i < s.length) {
            equivalentIndex++
            if (stringChars[equivalentIndex] == ' ') {
                i--
            } else {
                stringChars[equivalentIndex] = s[i]
            }
            i++
        }
        return String(stringChars)
    }
}
