package g2001_2100.s2042_check_if_numbers_are_ascending_in_a_sentence

// #Easy #String #2023_06_23_Time_161_ms_(64.29%)_Space_34.7_MB_(64.29%)

class Solution {
    fun areNumbersAscending(s: String): Boolean {
        val words = s.split("\\ ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
        var prev = 0
        for (word in words) {
            if (Character.isDigit(word[0])) {
                prev = if (word.toInt() <= prev) {
                    return false
                } else {
                    word.toInt()
                }
            }
        }
        return true
    }
}
