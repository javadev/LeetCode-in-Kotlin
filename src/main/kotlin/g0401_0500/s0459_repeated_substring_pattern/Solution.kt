package g0401_0500.s0459_repeated_substring_pattern

// #Easy #String #String_Matching #Programming_Skills_II_Day_2
// #2022_12_27_Time_201_ms_(100.00%)_Space_36.2_MB_(89.29%)

class Solution {
    fun repeatedSubstringPattern(s: String): Boolean {
        val n = s.length
        if (n < 2) {
            return false
        }
        var i = 0
        while (i < (n + 1) / 2) {
            if (n % (i + 1) != 0) {
                i++
                continue
            }
            var match = true
            val substring = s.substring(0, i + 1)
            var skippedI = i
            var j = i + 1
            while (j < n) {
                if (s.substring(j, j + i + 1) != substring) {
                    match = false
                    break
                }
                skippedI += i + 1
                j += i + 1
            }
            if (match) {
                return true
            }
            i = skippedI
            i++
        }
        return false
    }
}
