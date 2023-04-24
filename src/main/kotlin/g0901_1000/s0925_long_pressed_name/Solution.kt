package g0901_1000.s0925_long_pressed_name

// #Easy #String #Two_Pointers #2023_04_24_Time_126_ms_(92.31%)_Space_33.6_MB_(84.62%)

class Solution {
    fun isLongPressedName(name: String, typed: String): Boolean {
        var right = 0
        for (left in typed.indices) {
            if (right < name.length && typed[left] == name[right]) {
                right++
            } else if (left == 0 || typed[left] != typed[left - 1]) {
                return false
            }
        }
        return right == name.length
    }
}
