package g3001_3100.s3007_maximum_number_that_sum_of_the_prices_is_less_than_or_equal_to_k

// #Medium #Dynamic_Programming #Binary_Search #Bit_Manipulation
// #2024_02_28_Time_133_ms_(100.00%)_Space_33.6_MB_(100.00%)

class Solution {
    private fun count(k: Long, bit: Int, x: Int): Long {
        if (k < bit) {
            return 0
        }
        var n: Long = 1
        var bits = bit.toLong()
        var p: Long = 1
        while (2 * bits + (if (p % x == 0L) n else 0) <= k) {
            bits = 2 * bits + (if (p % x == 0L) n else 0)
            n *= 2
            ++p
        }
        return n + count(k - bits, bit + (if (p % x == 0L) 1 else 0), x)
    }

    fun findMaximumNumber(k: Long, x: Int): Long {
        return count(k, 0, x) - 1
    }
}
