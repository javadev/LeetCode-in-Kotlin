package g1801_1900.s1837_sum_of_digits_in_base_k

// #Easy #Math #2023_06_21_Time_120_ms_(100.00%)_Space_32.4_MB_(100.00%)

class Solution {
    fun sumBase(n: Int, k: Int): Int {
        val str = (n.toString() + "").toInt(10).toString(k)
        var sum = 0
        for (c in str.toCharArray()) {
            sum += Character.getNumericValue(c)
        }
        return sum
    }
}
