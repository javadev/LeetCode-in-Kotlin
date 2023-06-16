package g1701_1800.s1759_count_number_of_homogenous_substrings

// #Medium #String #Math
class Solution {
    fun countHomogenous(s: String): Int {
        var total = 0
        var count = 0
        for (i in 0 until s.length) {
            if (i > 0 && s[i] == s[i - 1]) {
                count++
            } else {
                count = 1
            }
            total = (total + count) % 1000000007
        }
        return total
    }
}
