package g2801_2900.s2844_minimum_operations_to_make_a_special_number

// #Medium #String #Math #Greedy #Enumeration
// #2023_12_18_Time_162_ms_(60.00%)_Space_35.2_MB_(60.00%)

class Solution {
    fun minimumOperations(num: String): Int {
        val number = num.toCharArray()
        val n = number.size
        var zero = 0
        var five = 0
        for (i in n - 1 downTo 0) {
            if (number[i] == '0') {
                if (zero == 1) {
                    return n - i - 2
                } else {
                    zero++
                }
            } else if (number[i] == '5') {
                if (zero == 1) {
                    return n - i - 2
                }
                if (five == 0) {
                    five++
                }
            } else if ((number[i] == '2' || number[i] == '7') && five == 1) {
                return n - i - 2
            }
        }
        if (zero == 1) {
            return n - 1
        }
        return n
    }
}
