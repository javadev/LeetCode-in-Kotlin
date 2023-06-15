package g1601_1700.s1684_count_the_number_of_consistent_strings

// #Easy #Array #String #Hash_Table #Bit_Manipulation
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
