package g3901_4000.s3954_sum_of_compatible_numbers_in_range_i

// #Easy #Dynamic_Programming #Bit_Manipulation #Enumeration #Mid_Level #Weekly_Contest_505
// #2026_10_20_Time_1_ms_(100.00%)_Space_42.37_MB_(88.29%)

class Solution {
    fun sumOfGoodIntegers(n: Int, k: Int): Int {
        var sum = 0
        val l = k + n
        var s = n - k
        if (s < 0) {
            s = 1
        }
        for (i in s..l) {
            if ((i and n) == 0) {
                sum += i
            }
        }
        return sum
    }
}
