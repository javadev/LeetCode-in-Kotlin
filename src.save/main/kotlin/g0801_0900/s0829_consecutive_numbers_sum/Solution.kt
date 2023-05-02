package g0801_0900.s0829_consecutive_numbers_sum

// #Hard #Math #Enumeration #2023_03_25_Time_151_ms_(100.00%)_Space_33.6_MB_(100.00%)

class Solution {
    fun consecutiveNumbersSum(n: Int): Int {
        var ans = 0
        var i = 1
        while (i * i <= n) {
            if (n % i > 0) {
                i++
                continue
            }
            val j = n / i
            if (i % 2 == 1) {
                ans++
            }
            if (j != i && j % 2 == 1) {
                ans++
            }
            i++
        }
        return ans
    }
}
