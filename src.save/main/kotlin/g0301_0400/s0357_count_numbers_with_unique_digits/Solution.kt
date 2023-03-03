package g0301_0400.s0357_count_numbers_with_unique_digits

// #Medium #Dynamic_Programming #Math #Backtracking
// #2022_11_19_Time_104_ms_(100.00%)_Space_32.7_MB_(100.00%)

class Solution {
    fun countNumbersWithUniqueDigits(n: Int): Int {
        if (n == 0) return 1
        var temp = 9
        var res = 10
        for (i in 1 until n) {
            temp *= (10 - i)
            res += temp
        }
        return res
    }
}
