package g3201_3300.s3298_count_substrings_that_can_be_rearranged_to_contain_a_string_ii

// #Hard #String #Hash_Table #Sliding_Window #2024_09_24_Time_433_ms_(78.57%)_Space_51.9_MB_(42.86%)

class Solution {
    fun validSubstringCount(word1: String, word2: String): Long {
        val ar = word1.toCharArray()
        val n = ar.size
        val temp = word2.toCharArray()
        val f = IntArray(26)
        for (i in temp) {
            f[i.code - 97]++
        }
        var ans: Long = 0
        var needed = temp.size
        var beg = 0
        var end = 0
        while (end < n) {
            if (f[ar[end].code - 97]-- > 0) {
                needed--
            }
            while (needed == 0) {
                // All substrings from [beg, i], where end <= i < n are valid
                ans += (n - end).toLong()
                // Shrink
                if (f[ar[beg++].code - 97]++ == 0) {
                    needed++
                }
            }
            end++
        }
        return ans
    }
}
