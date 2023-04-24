package g0901_1000.s0925_long_pressed_name

// #Easy #String #Two_Pointers #2023_04_17_Time_138_ms_(76.19%)_Space_33.4_MB_(100.00%)

class Solution {
    fun isLongPressedName(name: String, typed: String): Boolean {
        var i = 0
        var j = 0
        var prev = '$'
        if (typed.length < name.length) {
            return false
        }
        while (i < name.length && j < typed.length) {
            while (j < typed.length && typed[j] != name[i]) {
                if (typed[j] != prev) {
                    return false
                }
                if (j == typed.length - 1) {
                    return false
                }
                j++
            }
            prev = name[i]
            i++
            j++
        }
        if (i < name.length) {
            return false
        }
        while (j < typed.length) {
            if (typed[j] != prev) {
                return false
            }
            j++
        }
        return true
    }
}
