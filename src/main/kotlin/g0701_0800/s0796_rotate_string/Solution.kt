package g0701_0800.s0796_rotate_string

// #Easy #String #String_Matching #2023_03_14_Time_134_ms_(100.00%)_Space_33.5_MB_(86.96%)

@Suppress("NAME_SHADOWING")
class Solution {
    private fun check(s: String, goal: String, i: Int): Boolean {
        var i = i
        var j = 0
        val len = goal.length
        while (j < len) {
            if (i == len) {
                i = 0
            }
            if (s[i] != goal[j]) {
                return false
            }
            j++
            i++
        }
        return true
    }

    fun rotateString(s: String, goal: String): Boolean {
        if (s.length != goal.length) {
            return false
        }
        val len = s.length
        if (s[0] == goal[0] && s != goal) {
            return false
        }
        for (i in 0 until len) {
            if (s[i] == goal[0] && check(s, goal, i)) {
                return true
            }
        }
        return false
    }
}
