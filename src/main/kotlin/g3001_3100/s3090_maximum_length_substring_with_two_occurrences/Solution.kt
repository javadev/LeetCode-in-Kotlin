package g3001_3100.s3090_maximum_length_substring_with_two_occurrences

// #Easy #String #Hash_Table #Sliding_Window #2024_04_18_Time_157_ms_(90.24%)_Space_35_MB_(67.07%)

import kotlin.math.max

class Solution {
    fun maximumLengthSubstring(s: String): Int {
        val freq = IntArray(26)
        val chars = s.toCharArray()
        var i = 0
        val len = s.length
        var max = 0
        for (j in 0 until len) {
            ++freq[chars[j].code - 'a'.code]
            while (freq[chars[j].code - 'a'.code] == 3) {
                --freq[chars[i].code - 'a'.code]
                i++
            }
            max = max(max, (j - i + 1))
        }
        return max
    }
}
