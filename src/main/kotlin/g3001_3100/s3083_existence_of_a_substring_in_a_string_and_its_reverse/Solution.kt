package g3001_3100.s3083_existence_of_a_substring_in_a_string_and_its_reverse

// #Easy #String #Hash_Table #2024_04_18_Time_168_ms_(79.49%)_Space_37.5_MB_(24.36%)

class Solution {
    fun isSubstringPresent(s: String): Boolean {
        if (s.length == 1) {
            return false
        }
        val revSb = StringBuilder()
        for (i in s.length - 1 downTo 0) {
            revSb.append(s[i])
        }
        val rev = revSb.toString()
        for (i in 0 until s.length - 1) {
            val sub = s.substring(i, i + 2)
            if (rev.contains(sub)) {
                return true
            }
        }
        return false
    }
}
