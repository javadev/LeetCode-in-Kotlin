package g1601_1700.s1694_reformat_phone_number

// #Easy #String #2023_06_15_Time_142_ms_(100.00%)_Space_34.4_MB_(100.00%)

class Solution {
    fun reformatNumber(number: String): String {
        val sb = StringBuilder()
        for (c in number.toCharArray()) {
            if (Character.isDigit(c)) {
                sb.append(c)
            }
        }
        val cleaned = sb.toString()
        sb.setLength(0)
        var i = 0
        while (i < cleaned.length) {
            i += if (i + 4 == cleaned.length) {
                sb.append(cleaned, i, i + 2)
                sb.append("-")
                sb.append(cleaned.substring(i + 2))
                break
            } else if (i + 3 <= cleaned.length) {
                sb.append(cleaned, i, i + 3)
                sb.append("-")
                3
            } else {
                sb.append(cleaned.substring(i))
                break
            }
        }
        if (sb[sb.length - 1] == '-') {
            sb.setLength(sb.length - 1)
        }
        return sb.toString()
    }
}
