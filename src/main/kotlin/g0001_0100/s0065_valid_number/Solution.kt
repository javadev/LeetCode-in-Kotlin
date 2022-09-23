package g0001_0100.s0065_valid_number

// #Hard #String #2022_09_23_Time_310_ms_(81.82%)_Space_35.5_MB_(87.88%)

class Solution {
    fun isNumber(s: String?): Boolean {
        if (s == null || s.length == 0) {
            return false
        }
        var eSeen = false
        var numberSeen = false
        var decimalSeen = false
        for (i in 0 until s.length) {
            val c = s[i]
            if (c.toInt() >= 48 && c.toInt() <= 57) {
                numberSeen = true
            } else if (c == '+' || c == '-') {
                if (i == s.length - 1 ||
                    i != 0 && s[i - 1] != 'e' && s[i - 1] != 'E'
                ) {
                    return false
                }
            } else if (c == '.') {
                if (eSeen || decimalSeen) {
                    return false
                }
                decimalSeen = true
            } else if (c == 'e' || c == 'E') {
                if (i == s.length - 1 || eSeen || !numberSeen) {
                    return false
                }
                eSeen = true
            } else {
                return false
            }
        }
        return numberSeen
    }
}
