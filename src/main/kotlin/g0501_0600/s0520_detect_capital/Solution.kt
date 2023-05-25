package g0501_0600.s0520_detect_capital

// #Easy #String #2023_01_13_Time_161_ms_(84.54%)_Space_33.9_MB_(92.99%)

class Solution {
    fun detectCapitalUse(word: String): Boolean {
        if (word.isEmpty()) {
            return false
        }
        var upper = 0
        var lower = 0
        val n = word.length
        var firstUpper = Character.isUpperCase(word[0])
        for (i in 0 until n) {
            if (Character.isUpperCase(word[i])) {
                upper++
            } else if (Character.isLowerCase(word[i])) {
                lower++
            }
        }
        if (firstUpper && upper > 1) {
            firstUpper = false
        }
        return upper == n || lower == n || firstUpper
    }
}
