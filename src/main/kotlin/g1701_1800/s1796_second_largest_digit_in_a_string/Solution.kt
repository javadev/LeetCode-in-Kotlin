package g1701_1800.s1796_second_largest_digit_in_a_string

// #Easy #String #Hash_Table
class Solution {
    fun secondHighest(s: String): Int {
        var largest = -1
        var sl = -1
        for (ch in s.toCharArray()) {
            if (Character.isDigit(ch)) {
                val n = ch.code - '0'.code
                if (n > largest) {
                    sl = largest
                    largest = n
                } else if (n > sl && n < largest) {
                    sl = n
                }
            }
        }
        return sl
    }
}
