package g2201_2300.s2299_strong_password_checker_ii

// #Easy #String
class Solution {
    fun strongPasswordCheckerII(password: String): Boolean {
        if (password.length < 8) {
            return false
        }
        var l = false
        var u = false
        var d = false
        var s = false
        val special = "!@#$%^&*()-+"
        var previous = '.'
        for (i in 0 until password.length) {
            val ch = password[i]
            if (ch == previous) {
                return false
            }
            previous = ch
            if (ch >= 'A' && ch <= 'Z') {
                u = true
            } else if (ch >= 'a' && ch <= 'z') {
                l = true
            } else if (ch >= '0' && ch <= '9') {
                d = true
            } else if (special.indexOf(ch) != -1) {
                s = true
            }
        }
        return l && u && d && s
    }
}
