package g1601_1700.s1684_count_the_number_of_consistent_strings

// #Easy #Array #String #Hash_Table #Bit_Manipulation
// #2023_06_15_Time_234_ms_(100.00%)_Space_37.1_MB_(100.00%)

class Solution {
    fun countConsistentStrings(allowed: String, words: Array<String>): Int {
        var alwd = 0
        var res = 0
        for (i in 0 until allowed.length) {
            alwd = alwd or (1 shl allowed[i].code)
        }
        for (word in words) {
            var b = 0
            for (j in 0 until word.length) {
                b = b or (1 shl word[j].code)
            }
            if (alwd or b == alwd) {
                ++res
            }
        }
        return res
    }
}
