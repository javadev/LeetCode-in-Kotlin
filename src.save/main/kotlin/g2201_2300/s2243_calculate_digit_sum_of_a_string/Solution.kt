package g2201_2300.s2243_calculate_digit_sum_of_a_string

// #Easy #String #Simulation #2023_06_27_Time_141_ms_(100.00%)_Space_33.5_MB_(100.00%)

@Suppress("NAME_SHADOWING")
class Solution {
    fun digitSum(s: String, k: Int): String {
        var s = s
        while (s.length > k) {
            val n = s.length
            var count = 0
            var sum = 0
            val sb = StringBuilder()
            for (i in 0 until n) {
                if (count == k) {
                    sb.append(sum)
                    sum = 0
                    count = 0
                }
                sum += s[i].code - '0'.code
                count++
            }
            sb.append(sum)
            s = sb.toString()
        }
        return s
    }
}
