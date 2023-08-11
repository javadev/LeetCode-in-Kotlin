package g1901_2000.s1903_largest_odd_number_in_string

// #Easy #String #Math #Greedy #2023_06_19_Time_256_ms_(75.00%)_Space_39.4_MB_(87.50%)

class Solution {
    fun largestOddNumber(num: String): String {
        for (i in num.length - 1 downTo 0) {
            if (("" + num[i]).toInt() % 2 == 1) {
                return num.substring(0, i + 1)
            }
        }
        return ""
    }
}
