package g3901_4000.s3941_password_strength

// #Medium #String #Hash_Table #Senior #Weekly_Contest_503
// #2026_09_29_Time_2_ms_(100.00%)_Space_47.21_MB_(40.64%)

class Solution {
    fun passwordStrength(password: String): Int {
        var strength = 0
        val present = BooleanArray(256)
        for (i in 0..<password.length) {
            present[password[i].code] = true
        }
        for (i in 97..122) {
            if (present[i]) {
                strength++
            }
        }
        for (i in 65..90) {
            if (present[i]) {
                strength += 2
            }
        }
        for (i in 48..57) {
            if (present[i]) {
                strength += 3
            }
        }
        if (present['!'.code]) {
            strength += 5
        }
        if (present['@'.code]) {
            strength += 5
        }
        if (present['#'.code]) {
            strength += 5
        }
        if (present['$'.code]) {
            strength += 5
        }
        return strength
    }
}
