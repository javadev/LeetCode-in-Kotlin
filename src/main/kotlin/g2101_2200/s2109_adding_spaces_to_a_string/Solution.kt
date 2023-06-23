package g2101_2200.s2109_adding_spaces_to_a_string

// #Medium #Array #String #Simulation
class Solution {
    fun addSpaces(string: String, spaces: IntArray): String {
        val stringChars = CharArray(string.length + spaces.size)
        for (i in spaces.indices) {
            stringChars[spaces[i] + i] = ' '
        }
        var equivalentIndex = -1
        var i = 0
        while (i < string.length) {
            equivalentIndex++
            if (stringChars[equivalentIndex] == ' ') {
                i--
            } else {
                stringChars[equivalentIndex] = string[i]
            }
            i++
        }
        return String(stringChars)
    }
}
