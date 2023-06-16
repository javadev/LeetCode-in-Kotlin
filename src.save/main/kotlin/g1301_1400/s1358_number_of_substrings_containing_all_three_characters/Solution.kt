package g1301_1400.s1358_number_of_substrings_containing_all_three_characters

// #Medium #String #Hash_Table #Sliding_Window
// #2023_06_06_Time_196_ms_(100.00%)_Space_37.1_MB_(100.00%)

class Solution {
    fun numberOfSubstrings(s: String): Int {
        val counts = IntArray(3)
        var i = 0
        val n = s.length
        var result = 0
        for (j in 0 until n) {
            counts[s[j].code - 'a'.code]++
            while (counts[0] > 0 && counts[1] > 0 && counts[2] > 0) {
                counts[s[i++].code - 'a'.code]--
            }
            result += i
        }
        return result
    }
}
