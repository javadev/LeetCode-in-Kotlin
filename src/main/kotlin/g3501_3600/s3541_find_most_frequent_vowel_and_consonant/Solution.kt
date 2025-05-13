package g3501_3600.s3541_find_most_frequent_vowel_and_consonant

// #Easy #String #Hash_Table #Counting #2025_05_11_Time_8_ms_(100.00%)_Space_43.92_MB_(100.00%)

import kotlin.math.max

class Solution {
    fun maxFreqSum(s: String): Int {
        val freq = IntArray(26)
        for (ch in s.toCharArray()) {
            val index = ch.code - 'a'.code
            freq[index]++
        }
        val si = "aeiou"
        var max1 = 0
        var max2 = 0
        for (i in 0..25) {
            val ch = (i + 'a'.code).toChar()
            if (si.indexOf(ch) != -1) {
                max1 = max(max1, freq[i])
            } else {
                max2 = max(max2, freq[i])
            }
        }
        return max1 + max2
    }
}
