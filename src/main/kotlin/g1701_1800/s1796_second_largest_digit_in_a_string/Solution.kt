package g1701_1800.s1796_second_largest_digit_in_a_string

// #Easy #String #Hash_Table #2023_06_18_Time_148_ms_(100.00%)_Space_35.6_MB_(100.00%)

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
