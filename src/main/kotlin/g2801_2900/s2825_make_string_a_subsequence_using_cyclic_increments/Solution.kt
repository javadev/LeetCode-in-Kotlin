package g2801_2900.s2825_make_string_a_subsequence_using_cyclic_increments

// #Medium #String #Two_Pointers #2023_12_18_Time_227_ms_(83.33%)_Space_39.6_MB_(91.67%)

class Solution {
    fun canMakeSubsequence(str1: String, str2: String): Boolean {
        var str1ptr = 0
        for (element in str2) {
            val c2 = element
            var found = false
            while (str1ptr < str1.length) {
                val c1 = str1[str1ptr++]
                if (c1 == c2 || (c1.code - 'a'.code + 1) % 26 == c2.code - 'a'.code) {
                    found = true
                    break
                }
            }
            if (!found) {
                return false
            }
        }
        return true
    }
}
