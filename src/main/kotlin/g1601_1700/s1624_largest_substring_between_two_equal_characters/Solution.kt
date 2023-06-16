package g1601_1700.s1624_largest_substring_between_two_equal_characters

// #Easy #String #Hash_Table #2023_06_16_Time_132_ms_(100.00%)_Space_33.2_MB_(100.00%)

class Solution {
    fun maxLengthBetweenEqualCharacters(s: String): Int {
        val lenS = s.length
        val firstIndexesOf = IntArray(26) { -1 }
        var longest = -1
        for (idx in 0 until lenS) {
            val idxCh = (s[idx] - 'a')
            if (firstIndexesOf[idxCh] < 0) {
                firstIndexesOf[idxCh] = idx
            } else {
                val len = idx - firstIndexesOf[idxCh] + 1 - 2
                longest = maxOf(longest, len)
            }
        }
        return longest
    }
}
