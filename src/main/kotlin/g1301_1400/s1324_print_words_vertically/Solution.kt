package g1301_1400.s1324_print_words_vertically

// #Medium #Array #String #Simulation #2023_06_06_Time_149_ms_(66.67%)_Space_35.1_MB_(100.00%)

class Solution {
    fun printVertically(s: String): List<String> {
        val words = s.split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
        var columnMax = 0
        for (word in words) {
            columnMax = Math.max(columnMax, word.length)
        }
        val matrix = Array(words.size) { CharArray(columnMax) }
        for (i in words.indices) {
            var j = 0
            while (j < words[i].length) {
                matrix[i][j] = words[i][j]
                j++
            }
            while (j < columnMax) {
                matrix[i][j++] = '#'
            }
        }
        val result: MutableList<String> = ArrayList()
        for (j in 0 until columnMax) {
            val sb = StringBuilder()
            for (chars in matrix) {
                if (chars[j] != '#') {
                    sb.append(chars[j])
                } else {
                    sb.append(' ')
                }
            }
            val str = sb.toString()
            var k = str.length - 1
            while (k >= 0 && str[k] == ' ') {
                k--
            }
            result.add(str.substring(0, k + 1))
            sb.setLength(0)
        }
        return result
    }
}
