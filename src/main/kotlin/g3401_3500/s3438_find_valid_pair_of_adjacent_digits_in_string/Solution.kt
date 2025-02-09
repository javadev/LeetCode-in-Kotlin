package g3401_3500.s3438_find_valid_pair_of_adjacent_digits_in_string

// #Easy #String #Hash_Table #Counting #2025_02_05_Time_2_ms_(93.18%)_Space_36.38_MB_(100.00%)

class Solution {
    fun findValidPair(s: String): String {
        val t = IntArray(26)
        for (i in 0..<s.length) {
            t[s[i].code - '0'.code]++
        }
        for (i in 1..<s.length) {
            if (s[i - 1] == s[i] || t[s[i - 1].code - '0'.code] != s[i - 1].code - '0'.code ||
                t[s[i].code - '0'.code] != s[i].code - '0'.code
            ) {
                continue
            }
            return s.substring(i - 1, i + 1)
        }
        return ""
    }
}
