package g3401_3500.s3456_find_special_substring_of_length_k

// #Easy #String #2025_02_18_Time_1_ms_(100.00%)_Space_36.22_MB_(54.84%)

class Solution {
    fun hasSpecialSubstring(s: String, k: Int): Boolean {
        var start = 0
        var end = k
        while (end <= s.length) {
            var flag = false
            var i = start
            while (i < end - 1) {
                if (s[i] != s[i + 1]) {
                    start++
                    end++
                    flag = true
                    break
                }
                i++
            }
            if (flag) {
                continue
            }
            if (start - 1 >= 0 && s[start] == s[start - 1]) {
                start++
                end++
            } else if (end < s.length && s[end] == s[end - 1]) {
                start++
                end++
            } else {
                return true
            }
        }
        return false
    }
}
