package g1901_2000.s1945_sum_of_digits_of_string_after_convert

// #Easy #String #Simulation #2023_06_20_Time_146_ms_(75.00%)_Space_33.9_MB_(100.00%)

@Suppress("NAME_SHADOWING")
class Solution {
    fun getLucky(s: String, k: Int): Int {
        var k = k
        val list: MutableList<Int> = ArrayList()
        for (c in s.toCharArray()) {
            list.add(c.code - 'a'.code + 1)
        }
        var sum = 0
        for (i in list) {
            if (i >= 10) {
                sum += i / 10
            }
            sum += i % 10
        }
        while (k-- > 1) {
            var newSum = 0
            while (sum != 0) {
                newSum += sum % 10
                sum /= 10
            }
            sum = newSum
        }
        return sum
    }
}
