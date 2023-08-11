package g0701_0800.s0762_prime_number_of_set_bits_in_binary_representation

// #Easy #Math #Bit_Manipulation #2023_03_08_Time_147_ms_(100.00%)_Space_33.1_MB_(66.67%)

class Solution {
    fun countPrimeSetBits(left: Int, right: Int): Int {
        var count = 0
        val notPrime = BooleanArray(33)
        notPrime[0] = true
        notPrime[1] = true
        sieve(notPrime)
        for (i in left..right) {
            var num = i
            var setBits = 0
            while (num > 0) {
                num = num and num - 1
                setBits++
            }
            if (!notPrime[setBits]) {
                count++
            }
        }
        return count
    }

    private fun sieve(notPrime: BooleanArray) {
        for (i in 2..32) {
            if (!notPrime[i]) {
                var j = 2 * i
                while (j <= 32) {
                    notPrime[j] = true
                    j += i
                }
            }
        }
    }
}
