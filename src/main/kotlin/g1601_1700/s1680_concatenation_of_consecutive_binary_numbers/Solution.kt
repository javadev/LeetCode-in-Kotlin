package g1601_1700.s1680_concatenation_of_consecutive_binary_numbers

// #Medium #Math #Bit_Manipulation #Simulation
// #2023_06_15_Time_175_ms_(100.00%)_Space_32.7_MB_(100.00%)

class Solution {
    fun concatenatedBinary(n: Int): Int {
        // calculate the length of binary string
        var length = 0
        var sum: Long = 0
        for (i in 1..n) {
            if (i and i - 1 == 0) {
                length++
            }
            sum = sum shl length
            sum += i.toLong()
            if (sum > MOD) {
                sum %= MOD
            }
        }
        return (sum % MOD).toInt()
    }

    companion object {
        private const val MOD: Long = 1000000007
    }
}
