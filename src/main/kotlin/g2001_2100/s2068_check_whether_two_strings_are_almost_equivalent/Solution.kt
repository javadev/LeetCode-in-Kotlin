package g2001_2100.s2068_check_whether_two_strings_are_almost_equivalent

// #Easy #String #Hash_Table #Counting #2023_06_26_Time_131_ms_(100.00%)_Space_34.1_MB_(100.00%)

import kotlin.math.abs

class Solution {
    fun checkAlmostEquivalent(word1: String, word2: String): Boolean {
        val freq = IntArray(26)
        for (i in word1.indices) {
            ++freq[word1[i].code - 'a'.code]
            --freq[word2[i].code - 'a'.code]
        }
        for (i in freq) {
            if (abs(i) > 3) {
                return false
            }
        }
        return true
    }
}
