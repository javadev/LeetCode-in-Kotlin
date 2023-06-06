package g1301_1400.s1370_increasing_decreasing_string

// #Easy #String #Hash_Table #Counting #2023_06_06_Time_189_ms_(33.33%)_Space_36_MB_(33.33%)

class Solution {
    fun sortString(s: String): String {
        val count = IntArray(26)
        for (c in s.toCharArray()) {
            count[c.code - 'a'.code]++
        }
        val sb = StringBuilder()
        while (sb.length < s.length) {
            for (i in count.indices) {
                if (count[i] != 0) {
                    val character = (i + 'a'.code).toChar()
                    sb.append(character)
                    count[i]--
                }
            }
            for (i in 25 downTo 0) {
                if (count[i] > 0) {
                    val character = (i + 'a'.code).toChar()
                    sb.append(character)
                    count[i]--
                }
            }
        }
        return sb.toString()
    }
}
