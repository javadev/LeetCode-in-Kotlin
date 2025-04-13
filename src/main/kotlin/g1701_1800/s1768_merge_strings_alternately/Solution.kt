package g1701_1800.s1768_merge_strings_alternately

// #Easy #String #Two_Pointers #LeetCode_75_Array/String #Programming_Skills_I_Day_8_String
// #2023_06_18_Time_138_ms_(93.81%)_Space_33.8_MB_(97.56%)

class Solution {
    fun mergeAlternately(word1: String, word2: String): String {
        val size1 = word1.length
        val size2 = word2.length
        val min = Math.min(size1, size2)
        val sb = StringBuilder()
        for (i in 0 until min) {
            sb.append(word1[i])
            sb.append(word2[i])
        }
        if (min == size1) {
            sb.append(word2, size1, size2)
        }
        if (min == size2) {
            sb.append(word1, size2, size1)
        }
        return sb.toString()
    }
}
