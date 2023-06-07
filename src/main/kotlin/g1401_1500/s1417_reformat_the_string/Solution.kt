package g1401_1500.s1417_reformat_the_string

// #Easy #String
class Solution {
    fun reformat(s: String): String {
        val chars: MutableList<Char> = ArrayList()
        val digits: MutableList<Char> = ArrayList()
        for (c in s.toCharArray()) {
            if (c >= '0' && c <= '9') {
                digits.add(c)
            } else {
                chars.add(c)
            }
        }
        if (Math.abs(digits.size - chars.size) > 1) {
            return ""
        }
        var isDigit = digits.size > chars.size
        val sb = StringBuilder()
        for (i in 0 until s.length) {
            if (isDigit) {
                sb.append(digits.removeAt(0))
            } else {
                sb.append(chars.removeAt(0))
            }
            isDigit = !isDigit
        }
        return sb.toString()
    }
}
