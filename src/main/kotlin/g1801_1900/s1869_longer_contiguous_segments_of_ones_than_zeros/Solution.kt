package g1801_1900.s1869_longer_contiguous_segments_of_ones_than_zeros

// #Easy #String
class Solution {
    fun checkZeroOnes(s: String): Boolean {
        var zeroes = 0
        var ones = 0
        var i = 0
        while (i < s.length) {
            var start = i
            while (i < s.length && s[i] == '0') {
                i++
            }
            if (i > start) {
                zeroes = Math.max(zeroes, i - start)
            }
            start = i
            while (i < s.length && s[i] == '1') {
                i++
            }
            if (i > start) {
                ones = Math.max(ones, i - start)
            }
        }
        return ones > zeroes
    }
}
