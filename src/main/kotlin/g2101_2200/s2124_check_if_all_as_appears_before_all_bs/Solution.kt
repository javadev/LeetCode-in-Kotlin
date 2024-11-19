package g2101_2200.s2124_check_if_all_as_appears_before_all_bs

// #Easy #String #2023_06_25_Time_136_ms_(87.50%)_Space_34.1_MB_(100.00%)

class Solution {
    fun checkString(s: String): Boolean {
        var aEndIndex = -1
        var bStartIndex = -1
        if (s.length == 1) {
            return true
        }
        for (i in s.length - 1 downTo 0) {
            if (s[i] == 'a') {
                aEndIndex = i
                break
            }
        }
        for (i in 0..s.length - 1) {
            if (s[i] == 'b') {
                bStartIndex = i
                break
            }
        }
        return if (aEndIndex == -1 || bStartIndex == -1) {
            true
        } else {
            bStartIndex > aEndIndex
        }
    }
}
