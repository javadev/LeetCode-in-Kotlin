package g1101_1200.s1163_last_substring_in_lexicographical_order

// #Hard #String #Two_Pointers #2023_05_25_Time_254_ms_(100.00%)_Space_92.7_MB_(50.00%)

class Solution {
    fun lastSubstring(s: String): String {
        var i = 0
        var j = 1
        var k = 0
        val n = s.length
        val ca = s.toCharArray()
        while (j + k < n) {
            if (ca[i + k] == ca[j + k]) {
                k++
            } else if (ca[i + k] > ca[j + k]) {
                j += k + 1
                k = 0
            } else {
                i = Math.max(i + k + 1, j)
                j = i + 1
                k = 0
            }
        }
        return s.substring(i)
    }
}
