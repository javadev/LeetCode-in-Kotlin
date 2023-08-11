package g2401_2500.s2427_number_of_common_factors

// #Easy #Math #Enumeration #Number_Theory #2023_07_05_Time_127_ms_(100.00%)_Space_32.8_MB_(83.33%)

class Solution {
    fun commonFactors(a: Int, b: Int): Int {
        var ans = 0
        for (i in 1..a.coerceAtMost(b)) {
            if (a % i == 0 && b % i == 0) {
                ans++
            }
        }
        return ans
    }
}
