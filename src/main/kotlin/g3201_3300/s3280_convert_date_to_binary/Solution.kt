package g3201_3300.s3280_convert_date_to_binary

// #Easy #String #Math #2024_09_11_Time_174_ms_(79.31%)_Space_36.2_MB_(82.76%)

class Solution {
    fun convertDateToBinary(dat: String): String {
        val str = StringBuilder()
        val res = StringBuilder()
        for (c in dat.toCharArray()) {
            if (c.isDigit()) {
                str.append(c)
            } else if (c == '-') {
                res.append(str.toString().toInt().toString(2))
                res.append('-')
                str.setLength(0)
            }
        }
        if (str.isNotEmpty()) {
            res.append(str.toString().toInt().toString(2))
        }
        return res.toString()
    }
}
