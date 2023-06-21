package g1901_2000.s1952_three_divisors

// #Easy #Math #2023_06_21_Time_141_ms_(33.33%)_Space_32.8_MB_(100.00%)

class Solution {
    fun isThree(n: Int): Boolean {
        var divisors = 0
        for (i in 1..n) {
            if (n % i == 0) {
                divisors++
            }
        }
        return divisors == 3
    }
}
