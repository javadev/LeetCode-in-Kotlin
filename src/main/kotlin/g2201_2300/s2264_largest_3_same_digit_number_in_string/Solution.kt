package g2201_2300.s2264_largest_3_same_digit_number_in_string

// #Easy #String
class Solution {
    fun largestGoodInteger(num: String): String {
        var maxi = "000"
        var c = 0
        for (i in 0 until num.length - 2) {
            val s = num.substring(i, i + 3)
            if (s[0] == s[1] && s[1] == s[2]) {
                if (s.compareTo(maxi) >= 0) {
                    maxi = s
                }
                ++c
            }
        }
        return if (c == 0) {
            ""
        } else maxi
    }
}
