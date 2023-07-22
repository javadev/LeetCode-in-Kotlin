package g2101_2200.s2129_capitalize_the_title

// #Easy #String #2023_06_25_Time_140_ms_(100.00%)_Space_34.7_MB_(100.00%)

class Solution {
    fun capitalizeTitle(title: String): String {
        val sb = StringBuilder()
        var i = 0
        var j = 0
        while (i < title.length) {
            while (j < title.length && title[j] != ' ') {
                sb.append(title[j].lowercaseChar())
                j++
            }
            val len = j - i
            if (len > 2) {
                sb.setCharAt(i, title[i].uppercaseChar())
            }
            if (j == title.length) {
                break
            }
            sb.append(title[j])
            i = ++j
        }
        return sb.toString()
    }
}
